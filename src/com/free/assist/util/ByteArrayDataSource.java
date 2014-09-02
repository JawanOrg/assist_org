package com.free.assist.util;

import javax.activation.DataSource;
import java.io.*;

public class ByteArrayDataSource implements DataSource {
	private byte data[];
	private String type;

	public ByteArrayDataSource(InputStream inputstream, String s) {
		type = s;
		try {
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
			byte abyte0[] = new byte[4096];
			for (int i = 0; (i = inputstream.read(abyte0)) != -1;) {
				bytearrayoutputstream.write(abyte0, 0, i);
			}

			data = bytearrayoutputstream.toByteArray();
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	public ByteArrayDataSource(byte abyte0[], String s) {
		data = abyte0;
		type = s;
	}

	public ByteArrayDataSource(String s, String s1) {
		data = s.getBytes();
		type = s1;
	}

	public InputStream getInputStream() throws IOException {
		if (data == null)
			throw new IOException("no data");
		else
			return new ByteArrayInputStream(data);
	}

	public OutputStream getOutputStream() throws IOException {
		throw new IOException("cannot do this");
	}

	public String getContentType() {
		return type;
	}

	public String getName() {
		return "dummy";
	}

}
