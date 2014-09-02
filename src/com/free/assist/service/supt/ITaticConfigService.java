package com.free.assist.service.supt;

import java.util.List;
import java.util.Map;

import org.dom4j.Document;

import com.free.assist.domain.SuptIfaceGroupRelation;
import com.free.assist.domain.SuptTaticGroup;
import com.free.assist.domain.SuptTaticInstance;
import com.free.assist.domain.SysUser;
import com.free.assist.service.BaseService;

public interface ITaticConfigService extends BaseService {
	public void insertTaticGroup(SuptTaticGroup model, SysUser user);

	public void updateTaticGroup(SuptTaticGroup model, SysUser user)throws Exception;

	public void delTaticGroup(SuptTaticGroup model, SysUser user) throws Exception;

	public void insertTaticInstance(SuptTaticInstance model, List<SuptTaticInstance> list, SysUser user);

	public void insertIfaceGroup(SuptIfaceGroupRelation model, List<SuptIfaceGroupRelation> list, SysUser user);

	public void updateIfaceGroup(List<SuptIfaceGroupRelation> list, SysUser user) ;

	public String getTaticDispatchObject(String methodId, Document document);

	public void delIfaceGroup(SuptIfaceGroupRelation model, SysUser user) throws Exception;

	public String getTatiConversionValue(String methodId, String elementName, Document document, Map<String, String> map, String taticGroupType);
}
