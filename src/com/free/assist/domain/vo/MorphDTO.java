/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.domain.vo;

/**
 * @author ����
 * @version 1
 * @date 2009-10-27 ����04:50:21
 */
public class MorphDTO {
	
	public static final String INDICATOR_TYPE_MORPH = "2";
	
	public static final String INDICATOR_TYPE_FETCH = "1";

	private String hostId; //A��
	
	private String siteId; //B��

	private String nodeName;

	private String nodeText;

	private String hostSn;      //A�˾�̬��������
	
	private String siteSn;      //Z�˾�̬��������
	
	private String cascadeSn;      //��̬�������͵�����ֵ(A��?B��?)
	
	private String indicator;
	
	public MorphDTO() {
	}

	/**
	 * <p>����ϵͳ�侲̬����ת���Ĺ��캯��</p>
	 * @param ϵͳ��ʶ
	 * @param �ڵ�����
	 * @param �ڵ�ֵ
	 * @param ��̬��������
	 * @param ������̬��������
	 */
	public MorphDTO(String applicationId, String nodeName, String nodeText, String declareSn, String cascadeSn) {
		this.hostId = applicationId;
		this.nodeName = nodeName;
		this.nodeText = nodeText;
		this.hostSn = declareSn;
		this.cascadeSn = cascadeSn;
		this.indicator = MorphDTO.INDICATOR_TYPE_MORPH;
	}
	
	/**
	 * <p>��ϵͳȡ��̬���ݵĹ��캯��</p>
	 * @param ϵͳ��ʶ
	 * @param �ڵ�����
	 * @param ��̬��������
	 * @param ������̬��������
	 */
	public MorphDTO(String applicationId, String nodeName, String declareSn, String cascadeSn) {
		this.hostId = applicationId;
		this.nodeName = nodeName;
		this.hostSn = declareSn;
		this.cascadeSn = cascadeSn;
		this.indicator = MorphDTO.INDICATOR_TYPE_FETCH;
	}

	/**
	 * ��ȡA��ϵͳ��ʶ
	 * @return A��ϵͳ��ʶ
	 */
	public String getHostId() {
		return hostId;
	}

	/**
	 * ����A��ϵͳ��ʶ
	 * @param A��ϵͳ��ʶ
	 */
	public void setHostId(String applicationId) {
		this.hostId = applicationId;
	}

	/**
	 * ��ȡZ��ϵͳ��ʶ
	 * @return Z��ϵͳ��ʶ
	 */
	public String getSiteId() {
		return siteId;
	}

	/**
	 * ����Z��ϵͳ��ʶ
	 * @param Z��ϵͳ��ʶ
	 */
	public void setSiteId(String applicationId) {
		this.siteId = applicationId;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getNodeText() {
		return nodeText;
	}

	public void setNodeText(String nodeText) {
		this.nodeText = nodeText;
	}

	/**
	 * ��ȡA��ϵͳ�ľ�̬���ݱ���
	 * @return A�˾�̬���ݱ���
	 */
	public String getHostSn() {
		return hostSn;
	}

	/**
	 * ����A��ϵͳ�ľ�̬���ݱ���
	 * @param A�˾�̬���ݱ���
	 */
	public void setHostSn(String declareSn) {
		this.hostSn = declareSn;
	}

	/**
	 * ��ȡZ��ϵͳ�ľ�̬���ݱ���
	 * @return Z�˾�̬���ݱ���
	 */
	public String getSiteSn() {
		return siteSn;
	}

	/**
	 * ����Z��ϵͳ�ľ�̬���ݱ���
	 * @param Z�˾�̬���ݱ���
	 */
	public void setSiteSn(String declareSn) {
		this.siteSn = declareSn;
	}

	/**
	 * ��ȡ��̬���ݵ�����ֵ
	 * @param ��̬��������ֵ
	 */
	public String getCascadeSn() {
		return cascadeSn;
	}

	/**
	 * ���þ�̬���ݵ�����ֵ
	 * @param ��̬��������ֵ
	 */
	public void setCascadeSn(String cascadeSn) {
		this.cascadeSn = cascadeSn;
	}

	public String getIndicator() {
		return indicator;
	}

	/**
	 * 1Ϊ��ϵͳ��2Ϊ˫ϵͳ
	 * @param indicator
	 */
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}
}
