/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.domain.vo;

/**
 * @author 李猛
 * @version 1
 * @date 2009-10-27 下午04:50:21
 */
public class MorphDTO {
	
	public static final String INDICATOR_TYPE_MORPH = "2";
	
	public static final String INDICATOR_TYPE_FETCH = "1";

	private String hostId; //A端
	
	private String siteId; //B端

	private String nodeName;

	private String nodeText;

	private String hostSn;      //A端静态数据类型
	
	private String siteSn;      //Z端静态数据类型
	
	private String cascadeSn;      //静态数据类型的依赖值(A端?B端?)
	
	private String indicator;
	
	public MorphDTO() {
	}

	/**
	 * <p>二个系统间静态数据转化的构造函数</p>
	 * @param 系统标识
	 * @param 节点名字
	 * @param 节点值
	 * @param 静态数据类型
	 * @param 依赖静态数据类型
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
	 * <p>单系统取静态数据的构造函数</p>
	 * @param 系统标识
	 * @param 节点名字
	 * @param 静态数据类型
	 * @param 依赖静态数据类型
	 */
	public MorphDTO(String applicationId, String nodeName, String declareSn, String cascadeSn) {
		this.hostId = applicationId;
		this.nodeName = nodeName;
		this.hostSn = declareSn;
		this.cascadeSn = cascadeSn;
		this.indicator = MorphDTO.INDICATOR_TYPE_FETCH;
	}

	/**
	 * 获取A端系统标识
	 * @return A端系统标识
	 */
	public String getHostId() {
		return hostId;
	}

	/**
	 * 设置A端系统标识
	 * @param A端系统标识
	 */
	public void setHostId(String applicationId) {
		this.hostId = applicationId;
	}

	/**
	 * 获取Z端系统标识
	 * @return Z端系统标识
	 */
	public String getSiteId() {
		return siteId;
	}

	/**
	 * 设置Z端系统标识
	 * @param Z端系统标识
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
	 * 获取A端系统的静态数据编码
	 * @return A端静态数据编码
	 */
	public String getHostSn() {
		return hostSn;
	}

	/**
	 * 设置A端系统的静态数据编码
	 * @param A端静态数据编码
	 */
	public void setHostSn(String declareSn) {
		this.hostSn = declareSn;
	}

	/**
	 * 获取Z端系统的静态数据编码
	 * @return Z端静态数据编码
	 */
	public String getSiteSn() {
		return siteSn;
	}

	/**
	 * 设置Z端系统的静态数据编码
	 * @param Z端静态数据编码
	 */
	public void setSiteSn(String declareSn) {
		this.siteSn = declareSn;
	}

	/**
	 * 获取静态数据的依赖值
	 * @param 静态数据依赖值
	 */
	public String getCascadeSn() {
		return cascadeSn;
	}

	/**
	 * 设置静态数据的依赖值
	 * @param 静态数据依赖值
	 */
	public void setCascadeSn(String cascadeSn) {
		this.cascadeSn = cascadeSn;
	}

	public String getIndicator() {
		return indicator;
	}

	/**
	 * 1为单系统，2为双系统
	 * @param indicator
	 */
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}
}
