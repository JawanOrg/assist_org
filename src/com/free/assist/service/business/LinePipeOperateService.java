package com.free.assist.service.business;

import com.free.assist.domain.BusLinePipeKnowledge;
import com.free.assist.domain.SuptAction;
import com.free.assist.service.BaseService;

public interface LinePipeOperateService extends BaseService {
	String addKnowledge(BusLinePipeKnowledge knowledge, SuptAction action);

}
