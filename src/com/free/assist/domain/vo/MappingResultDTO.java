/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.domain.vo;

import java.io.Serializable;

/**
 * @author ����
 * @version 1
 * @date 2009-10-16 ����12:31:33
 */
public class MappingResultDTO implements Serializable {

	private static final long serialVersionUID = 20091016L;

	private String declareSn;
	
	private String instanceSn;

	public MappingResultDTO() {
	}
	
	public MappingResultDTO(String declareSn, String instanceSn) {
		this.declareSn = declareSn;
		this.instanceSn = declareSn;
	}

	/**
	 * <p>�ڵ���</p>
	 * @return �ڵ�����(����)
	 */
	public String getDeclareSn() {
		return declareSn;
	}

	public void setDeclareSn(String declareSn) {
		this.declareSn = declareSn;
	}

	/**
	 * <p>�ڵ�ֵ</p>
	 * @return �ڵ�ֵ
	 */
	public String getInstanceSn() {
		return instanceSn;
	}

	public void setInstanceSn(String instanceSn) {
		this.instanceSn = instanceSn;
	}
}
