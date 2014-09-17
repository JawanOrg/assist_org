package com.free.assist.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.free.assist.dao.BusLinePipeKnowledgeDAO;
import com.free.assist.domain.BusLinePipeKnowledge;
import com.free.assist.domain.SuptAction;
import com.free.assist.service.BaseServiceImpl;
import com.free.assist.service.common.CommonOperateService;
import com.free.assist.util.Constant;

@Service("linePipeOperateService")
public class LinePipeOperateServiceImpl extends BaseServiceImpl implements LinePipeOperateService {
	@Autowired
	private BusLinePipeKnowledgeDAO busLinePipeKnowledgeDAO;

	@Autowired
	private CommonOperateService commonOperateService;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public String addKnowledge(BusLinePipeKnowledge knowledge, SuptAction action) {
		knowledge.setCreator(action.getUserVO().getUserId());
		knowledge.setCreateTime(this.getSysDate());
		busLinePipeKnowledgeDAO.insertSelective(knowledge);
		return Constant.OPERATE_RESULT_SUCCESS;
	}
}
