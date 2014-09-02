/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.service.iface;

import java.util.List;

import com.free.assist.domain.IfaceConfigCommand;
import com.free.assist.domain.IfaceConfigDeclare;
import com.free.assist.domain.IfaceConfigInstance;
import com.free.assist.domain.IfaceConfigMapping;
import com.free.assist.domain.IfaceConfigMappingExample;
import com.free.assist.domain.IfaceConfigProtocol;
import com.free.assist.domain.IfaceConfigSystem;
import com.free.assist.domain.vo.MorphDTO;
import com.free.assist.service.BaseService;

/**
 * @author 李猛
 * @version 1
 * @date 2009-09-29 16:24:33
 */
public interface IfaceConfigFacade extends BaseService {

	/**
	 * <p>校验字段值是否在静态数据范围里。</p>
	 * @param applicationId，第三方应用接口程序(系统)，是个标识，不是编码。
	 * @param declareSn，静态数据的字典编码，必须与XML的标签的tag一样，否则xml数据与静态数据无法关联上。
	 * @param instanceSn，静态数据的条目(实例)值。
	 * @return 如果不存在该静态数据、或者不存储静态数据值都会返回false。
	 */
	public boolean exists(String applicationId, String declareSn, String instanceSn);
	
	/**
	 * <p>静态数据转化。</p>
	 * @param morphDTO，转换数据对象。
	 * @return 转换后的字符串，如果静态数据没有配置映射，返回入参instanceSn。
	 */
	public String morph(MorphDTO morphDTO);
	
	/**
	 * <p>静态数据翻译。</p>
	 * @param morphDTO，翻译数据对象。
	 * @return 翻译后的字符串，如果静态数据没有配置映射，返回入参instanceSn。
	 */
	public String trans(MorphDTO morphDTO);

	public List<IfaceConfigSystem> getApplicationList();

	/**
	 * <p>加载一条静态数据定义的记录</p>
	 * @param ifaceConfigDeclareKey
	 * @return 静态数据定义对象
	 */
	IfaceConfigDeclare getDeclare(String declareId);
	
	/**
	 * <p>根据系统标识及表态数据编码加载一条记录</p>
	 * @param applicationSn
	 * @param declareSn
	 * @return 静态数据定义对象
	 */
	IfaceConfigDeclare getDeclare(String applicationId, String declareSn);

	/**
	 * <p>插入静态数据定义</p>
	 * @param ifaceConfigDeclare
	 */
	void addDeclare(IfaceConfigDeclare ifaceConfigDeclare);
	
	/**
	 * <p>更新表态数据定义</p>
	 * @param ifaceConfigDeclare
	 */
	void updateDeclare(IfaceConfigDeclare ifaceConfigDeclare);

	/**
	 * <p>删除表态数据定义</p>
	 * @param ifaceConfigDeclare
	 */
	void removeDeclare(String declareId);

	/**
	 * <p>表态数据定义检索</p>
	 * @param ifaceConfigDeclareExample
	 * @return 静态数据定义集合
	 */
	//List<IfaceConfigDeclare> findDeclare(IfaceConfigDeclareExample example);

	/**
	 * <p>根据系统应用程序检索静态数据定义</p>
	 * @param ifaceApplicationKey
	 * @return 静态数据定义集合
	 */
	public List<IfaceConfigDeclare> findDeclare(String applicationId);
	
	public List<IfaceConfigDeclare> findDeclareWithChildren(String applicationId);

	/**
	 * <p>加载一条静态数据条目的记录</p>
	 * @param ifaceConfigInstanceKey
	 * @return 静态数据条目对象
	 */
	IfaceConfigInstance getInstance(String instanceId);

	/**
	 * <p>根据静态数据标识及实例值加载实例。</p>
	 * @param declareId
	 * @param instanceSn
	 * @return 实例
	 */
	public IfaceConfigInstance getInstance(String declareId, String instanceSn);

	/**
	 * <p>
	 * @param ifaceConfigInstance
	 */
	void addInstance(IfaceConfigInstance ifaceConfigInstance);

	/**
	 * <p>更新静态数据实例</p>
	 * @param ifaceConfigInstance
	 */
	void updateInstance(IfaceConfigInstance ifaceConfigInstance);

	/**
	 * 
	 * @param ifaceConfigInstance
	 */
	void removeInstance(String instanceId);

	//List<IfaceConfigInstance> findInstance(IfaceConfigInstanceExample example);
	
	/**
	 * <p>根据类型找到下属的实例名称</p>
	 * @param declareId，类型标识
	 * @return 实例列表
	 */
	public List<IfaceConfigInstance> findInstance(String declareId);
	
	//public List<IfaceConfigInstance> findInstanceWithChildren(String declareId);
	
	public List<IfaceConfigInstance> findInstance(String sourcePid, String resultPid);
	
	IfaceConfigMapping getMapping(String mappingId);
	
	void addMapping(IfaceConfigMapping ifaceConfigMapping);
	
	void removeMapping(String mappingId);
	
	List<IfaceConfigMapping> findMapping(IfaceConfigMappingExample example);
	
	//List<IfaceConfigMapping> findMapping(IfaceConfigDeclareKey ifaceConfigDeclareKey);
	
	//List<IfaceConfigMapping> findMapping(String applicationId);
	
	public IfaceConfigCommand findCommand(String applicationSn, String serviceName);
	
	public IfaceConfigProtocol getProtocol(String protocolId);
}
