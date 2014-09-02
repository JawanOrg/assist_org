package com.free.assist.service.iface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.assist.dao.IfaceConfigProtocolDAO;
import com.free.assist.dao.IfaceConfigSystemDAO;
import com.free.assist.domain.IfaceConfigProtocol;
import com.free.assist.domain.IfaceConfigProtocolExample;
import com.free.assist.domain.IfaceConfigSystem;
import com.free.assist.domain.IfaceConfigSystemExample;
import com.free.assist.service.BaseServiceImpl;

@Service("ifaceConfigSystem")
public class IfaceConfigSystemServiceImpl extends BaseServiceImpl implements IfaceConfigSystemService {
	
	private IfaceConfigSystemDAO ifaceConfigSystemDAO;
	
	private IfaceConfigProtocolDAO ifaceConfigProtocolDAO;
	
	@Autowired
	public void setIfaceConfigSystemDAO(IfaceConfigSystemDAO ifaceConfigSystemDAO) {
		this.ifaceConfigSystemDAO = ifaceConfigSystemDAO;
	}
	
	@Autowired
	public void setIfaceConfigProtocolDAO(IfaceConfigProtocolDAO ifaceConfigProtocolDAO) {
		this.ifaceConfigProtocolDAO = ifaceConfigProtocolDAO;
	}
	
	public List selectByExample(IfaceConfigSystemExample example) {
		return this.ifaceConfigSystemDAO.selectByExample(example);
	}
	
	public List selectByExample(IfaceConfigProtocolExample example) {
		return this.ifaceConfigProtocolDAO.selectByExample(example);
	}
	
	public void insertBySelective(IfaceConfigSystem record) {
		this.ifaceConfigSystemDAO.insertSelective(record);
	}
	
	public void insertIfaceConfigProtocolRecord(IfaceConfigProtocol record) {
		this.ifaceConfigProtocolDAO.insert(record);
	}

}
