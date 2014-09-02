/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain.vo;

import java.io.Serializable;

/**
 * @author 李猛
 * @version 1
 * @date 2009-10-16 下午12:31:33
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
	 * <p>节点名</p>
	 * @return 节点名称(编码)
	 */
	public String getDeclareSn() {
		return declareSn;
	}

	public void setDeclareSn(String declareSn) {
		this.declareSn = declareSn;
	}

	/**
	 * <p>节点值</p>
	 * @return 节点值
	 */
	public String getInstanceSn() {
		return instanceSn;
	}

	public void setInstanceSn(String instanceSn) {
		this.instanceSn = instanceSn;
	}
}
