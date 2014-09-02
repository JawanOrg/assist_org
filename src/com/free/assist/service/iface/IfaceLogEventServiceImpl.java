/*
 * <p>����: Э������ϵͳ</p>
 * <p>����: ...</p>
 * <p>��Ȩ: Copyright (c) 2009</p>
 * <p>��˾: free</p>
 * <p>��ַ��http://www.free.cn/
 */
package com.free.assist.service.iface;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.free.assist.dao.IfaceLogEventDAO;
import com.free.assist.domain.IfaceLogEvent;
import com.free.assist.service.BaseServiceImpl;

/**
 * @author ����
 * @version 1
 * @date 2009-12-07 17:41:54
 */
@Service("ifaceLogEventService")
public class IfaceLogEventServiceImpl extends BaseServiceImpl implements IfaceLogEventService {

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceLogEventService#begin(java.lang.String)
	 */
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public IfaceLogEvent begin(String inputXML) {
		IfaceLogEvent ifaceLogEvent = new IfaceLogEvent();
		ifaceLogEvent.setType("TRACE");//Ĭ��Ϊ��¼
		ifaceLogEvent.setRelateId(this.buildSequence());
		ifaceLogEvent.setDescription("�ӿ��յ���Ϣ����¼��");
		ifaceLogEvent.setDocument(inputXML);
		ifaceLogEvent.setCreated(this.getSysDate());
		ifaceLogEventDAO.insert(ifaceLogEvent);
		return ifaceLogEvent;
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.iface.IfaceLogEventService#end(com.regaltec.blocimp.domain.IfaceLogEvent)
	 */
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public void end(IfaceLogEvent ifaceLogEvent) {
		ifaceLogEventDAO.updateByPrimaryKeySelective(ifaceLogEvent);
	}

	@Resource private IfaceLogEventDAO ifaceLogEventDAO;
}
