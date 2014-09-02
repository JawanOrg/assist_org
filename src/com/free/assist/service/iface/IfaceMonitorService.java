package com.free.assist.service.iface;

import java.util.List;

import com.free.assist.domain.IfaceLogEventExample;
import com.free.assist.domain.IfaceLogEventMonitor;
import com.free.assist.domain.IfaceLogRepositoryExample;
import com.free.assist.domain.IfaceMonitor;
import com.free.assist.service.BaseService;

public interface IfaceMonitorService extends BaseService {
	public List<IfaceMonitor> selectIfaceMonitorByExample(IfaceLogRepositoryExample example);
	public List<IfaceLogEventMonitor> selectIfaceLogEventMonitorByExample(IfaceLogEventExample example);
}
