package com.free.assist.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

public class Mail {

	private InputStream inputStream;

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	String to = "";// �ռ���

	String from = "";// ������

	String host = "";// smtp����

	String username = "";

	String password = "";

	String filename = "";// �����ļ���

	String subject = "";// �ʼ�����

	String content = "";// �ʼ�����

	Vector file = new Vector();// �����ļ�����

	/**
	 * <br>
	 * ����˵����Ĭ�Ϲ����� <br>
	 * ��������� <br>
	 * �������ͣ�
	 */
	public Mail() {
	}

	/**
	 * <br>
	 * ����˵�������������ṩֱ�ӵĲ������� <br>
	 * ��������� <br>
	 * �������ͣ�
	 */
	public Mail(String to, String from, String smtpServer, String username, String password, String subject, String content, InputStream inputStream) {
		this.to = to;
		this.from = from;
		this.host = smtpServer;
		this.username = username;
		this.password = password;
		this.subject = subject;
		this.content = content;
		this.inputStream = inputStream;
	}

	/**
	 * <br>
	 * ����˵���������ʼ���������ַ <br>
	 * ���������String host �ʼ���������ַ���� <br>
	 * �������ͣ�
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * <br>
	 * ����˵�������õ�¼������У������ <br>
	 * ��������� <br>
	 * �������ͣ�
	 */
	public void setPassWord(String pwd) {
		this.password = pwd;
	}

	/**
	 * <br>
	 * ����˵�������õ�¼������У���û� <br>
	 * ��������� <br>
	 * �������ͣ�
	 */
	public void setUserName(String usn) {
		this.username = usn;
	}

	/**
	 * <br>
	 * ����˵���������ʼ�����Ŀ������ <br>
	 * ��������� <br>
	 * �������ͣ�
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * <br>
	 * ����˵���������ʼ�����Դ���� <br>
	 * ��������� <br>
	 * �������ͣ�
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * <br>
	 * ����˵���������ʼ����� <br>
	 * ��������� <br>
	 * �������ͣ�
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * <br>
	 * ����˵���������ʼ����� <br>
	 * ��������� <br>
	 * �������ͣ�
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * <br>
	 * ����˵����������ת��Ϊ���� <br>
	 * ���������String strText <br>
	 * �������ͣ�
	 */
	public String transferChinese(String strText) {
		try {
			strText = MimeUtility.encodeText(new String(strText.getBytes(), "GB2312"), "GB2312", "B");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strText;
	}

	/**
	 * <br>
	 * ����˵�����������������Ӹ��� <br>
	 * ��������� <br>
	 * �������ͣ�
	 */
	public void attachfile(String fname) {
		file.addElement(fname);
	}

	/**
	 * <br>
	 * ����˵���������ʼ� <br>
	 * ��������� <br>
	 * �������ͣ�boolean �ɹ�Ϊtrue����֮Ϊfalse
	 */
	public boolean sendMail() {

		// ����mail session
		Properties props = System.getProperties(); // ��ȡϵͳ Properties
		props.put("mail.smtp.host", host);// ������ SMTP ����������ӵ� mail.smtp.host
		// �ؼ��ֵ�������
		props.put("mail.smtp.auth", "true");
		Session session = Session.getDefaultInstance(props, new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});// ��ȡ���� Properties Session ����

		try {
			// ����MimeMessage ���趨������ֵ
			MimeMessage msg = new MimeMessage(session);// �� session ����һ��
			// MimeMessage
			msg.setFrom(new InternetAddress(from));// ������Ϣ�� from ��
			InternetAddress[] address = { new InternetAddress(to) };// ������Ϣ�� to
			// ��
			msg.setRecipients(Message.RecipientType.TO, address);
			subject = transferChinese(subject);
			msg.setSubject(subject);// ������Ϣ����

			// ����Multipart
			Multipart mp = new MimeMultipart();

			// ��Multipart�������
			MimeBodyPart mbpContent = new MimeBodyPart();
			mbpContent.setText(content);// ������Ϣ����
			// ��MimeMessage��ӣ�Multipart�������ģ�
			mp.addBodyPart(mbpContent);

			// ��Multipart��Ӹ���
			Enumeration efile = file.elements();
			while (efile.hasMoreElements()) {

				MimeBodyPart mbpFile = new MimeBodyPart();
				filename = efile.nextElement().toString();
				FileDataSource fds = new FileDataSource(filename);

				
				byte a[] = getBytesFromIS(inputStream);
				mbpFile.setDataHandler(new DataHandler(new ByteArrayDataSource(a, "application/octet-stream")));
				mbpFile.setFileName(fds.getName());
				mp.addBodyPart(mbpFile);

			}

			file.removeAllElements();
			// ��Multipart���MimeMessage
			msg.setContent(mp);
			msg.setSentDate(new Date());
			// �����ʼ�
			Transport.send(msg);// �� Transport ������Ϣ

		} catch (Exception mex) {
			mex.printStackTrace();
			return false;
		}
		return true;
	}
	public byte[] getBytesFromIS(InputStream is) throws IOException{
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    int b=0;
	    while( (b = is.read())!=-1)
	        baos.write(b);
	    return baos.toByteArray();
	}

	public static void main(String[] args) {
		Mail sendmail = new Mail();
		sendmail.setHost("shdxnoc-mail.sh.ctc.com");
		sendmail.setUserName("qiuxiaojun");
		sendmail.setPassWord("shnocqxj");
		sendmail.setTo("hanjun132@163.com");
		sendmail.setFrom("qiuxiaojun@shtel.com.cn");
		sendmail.setSubject("��ã����ǲ��ԣ�");
		sendmail.setContent("�������һ�����฽���Ĳ��ԣ�");
		sendmail.attachfile("c:\\TheWorld.xml");
		sendmail.sendMail();
	}
}