package com.free.assist.service.iface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.assist.dao.IfaceLogEventDAO;
import com.free.assist.dao.IfaceLogRepositoryDAO;
import com.free.assist.domain.IfaceLogEventExample;
import com.free.assist.domain.IfaceLogEventMonitor;
import com.free.assist.domain.IfaceLogRepositoryExample;
import com.free.assist.domain.IfaceMonitor;
import com.free.assist.service.BaseServiceImpl;

@Service("ifaceMonitorService")
public class IfaceMonitorServiceImpl extends BaseServiceImpl implements IfaceMonitorService {
	@Autowired private IfaceLogRepositoryDAO ifaceLogRepositoryDAO;
	@Autowired private IfaceLogEventDAO ifaceLogEventDAO;
	public List<IfaceMonitor> selectIfaceMonitorByExample(IfaceLogRepositoryExample example) {
		return this.ifaceLogRepositoryDAO.selectIfaceMonitorByExample(example);
	}
	public List<IfaceLogEventMonitor>selectIfaceLogEventMonitorByExample(IfaceLogEventExample example) {
		return this.ifaceLogEventDAO.selectIfaceLogEventMonitorByExample(example);
	}
}
