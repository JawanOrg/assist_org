/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.service.iface;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.free.assist.domain.IfaceConfigDeclare;
import com.free.assist.domain.IfaceConfigInstance;
import com.free.assist.domain.IfaceConfigMapping;
import com.free.assist.domain.IfaceConfigMappingExample;
import com.free.assist.domain.IfaceConfigSystem;

/**
 * @author 李猛
 * @version 1
 * @date 2009-10-20 下午11:10:59
 */
public class IfaceConfigRO {
	
	private Logger logger = LoggerFactory.getLogger(IfaceConfigRO.class);

	public List<IfaceConfigSystem> getSystemList() {
		List<IfaceConfigSystem> result = ifaceConfigFacade.getApplicationList();
		return result;
	}
	
	public List<IfaceConfigDeclare> getDeclareList(String applicationId) {
		return ifaceConfigFacade.findDeclareWithChildren(applicationId);
	}
	
	public List<IfaceConfigInstance> getInstanceList(String declareId) {
		return ifaceConfigFacade.findInstance(declareId);
	}
	
	/*public List<IfaceConfigInstance> getInstanceList(String sourcePid, String resultPid) {
		if (StringUtils.isBlank(resultPid)) {
			ifaceConfigFacade.findInstance(sourcePid);
		}
		return ifaceConfigFacade.findInstance(sourcePid, resultPid);
	}*/
	
	public IfaceConfigMapping addMapping(IfaceConfigMapping ifaceConfigMapping) {
		ifaceConfigFacade.addMapping(ifaceConfigMapping);
		return ifaceConfigMapping;
	}
	
	/**
	 * <p>
	 * @param A端静态数据类型标识(declareId)
	 * @param B端静态数据类型标识(declareId)
	 * @return 静态数据列表(带映射标识)
	 */
	public List<IfaceConfigMapping> getMappingList(String sourcePid, String resultPid) {
		if (StringUtils.isBlank(sourcePid)) {
			logger.error("argument sourcePid is null");
			throw new IllegalArgumentException("expected sourcePid but empty.");
		}
		if (StringUtils.isBlank(resultPid)) {
			logger.error("argument resultPid is null");
			throw new IllegalArgumentException("expected resultPid but empty.");
		}
		IfaceConfigMappingExample example = new IfaceConfigMappingExample();
		example.createCriteria().andSourcePidEqualTo(sourcePid).andResultPidEqualTo(resultPid).andAvailableEqualTo("Y");
		return ifaceConfigFacade.findMapping(example);
	}
	
	public void removeMapping(String mappingId) {
		ifaceConfigFacade.removeMapping(mappingId);
	}
	
	@Resource private IfaceConfigFacade ifaceConfigFacade;
}
