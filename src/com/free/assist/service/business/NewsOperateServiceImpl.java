package com.free.assist.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.free.assist.dao.BusReleaseNewsDAO;
import com.free.assist.dao.SuptActionDAO;
import com.free.assist.dao.SuptTaskDAO;
import com.free.assist.domain.BusReleaseNews;
import com.free.assist.domain.BusReleaseNewsKey;
import com.free.assist.domain.BusReleaseNewsWithBLOBs;
import com.free.assist.domain.SuptAction;
import com.free.assist.domain.SuptTask;
import com.free.assist.domain.SuptTaskKey;
import com.free.assist.service.BaseServiceImpl;
import com.free.assist.service.common.CommonOperateService;
import com.free.assist.util.Constant;
import com.free.assist.util.Helper;

@Service("newsOperateService")
public class NewsOperateServiceImpl extends BaseServiceImpl implements NewsOperateService {
	private BusReleaseNewsDAO busReleaseNewsDAO;
	private SuptActionDAO suptActionDAO;
	private SuptTaskDAO suptTaskDAO;

	@Autowired
	private CommonOperateService commonOperateService;

	@Autowired
	public void setBusReleaseNewsDAO(BusReleaseNewsDAO busReleaseDAO) {
		this.busReleaseNewsDAO = busReleaseDAO;
	}

	@Autowired
	public void setSuptActionDAO(SuptActionDAO suptActionDAO) {
		this.suptActionDAO = suptActionDAO;
	}

	@Autowired
	public void setSuptTaskDAO(SuptTaskDAO suptTaskDAO) {
		this.suptTaskDAO = suptTaskDAO;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public String create(BusReleaseNewsWithBLOBs relsease, SuptAction action) {
		String userRoleName = commonOperateService.queryUserRoleName(action.getUserVO().getUserId());
		if (userRoleName == null || userRoleName.trim().length() == 0) {
			return "您没有新闻创建权限！";
		}
		String billStatus = commonOperateService.queryNextStatus(userRoleName, Constant.OP_CREATE);
		String billSn = Helper.getCurrentTimeStr() + this.buildSequence();
		relsease.setBillSn(billSn);
		relsease.setCreator(action.getUserVO().getUserId());
		relsease.setCreateDept(action.getUserVO().getUserId());
		relsease.setCreateTime(this.getSysDate());
		relsease.setBillStatus(billStatus);
		busReleaseNewsDAO.insertSelective(relsease);

		SuptTask task = new SuptTask();
		task.setBillId(relsease.getBillId());
		task.setBusinessType(Constant.BUSINESS_TYPE_NEWS);
		task.setTaskSn(Helper.getCurrentTimeStr() + this.buildSequence());
		task.setTaskStatus(Constant.S_AUDIT);
		task.setCreator(action.getUserVO().getUserId());
		task.setIsFinish(Constant.FLAG_NO);
		task.setIsRedo(Constant.FLAG_NO);
		task.setDealObjectId(commonOperateService.queryNextDealObject(action.getUserVO().getUserId(), userRoleName, billStatus));
		task.setDealObjectType(Constant.DEAL_OBJECT_TYPE_PERSON);
		task.setDealObjectGroup(commonOperateService.queryUserUnitName(task.getDealObjectId()));
		task.setTaskIdParent("0");
		suptTaskDAO.insertSelective(task);

		action.setBusinessType(Constant.BUSINESS_TYPE_NEWS);
		action.setBillId(relsease.getBillId());
		action.setBillStatus(relsease.getBillStatus());
		action.setActionType(Constant.OP_CREATE);
		action.setOperator(action.getUserVO().getUserId());
		suptActionDAO.insertSelective(action);

		return Constant.OPERATE_RESULT_SUCCESS;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public String audit(SuptAction action) {
		BusReleaseNewsKey newsKey = new BusReleaseNewsKey();
		newsKey.setBillId(action.getBillId());
		BusReleaseNews oldRelsease = busReleaseNewsDAO.selectByPrimaryKey(newsKey);
		if (oldRelsease != null && !Constant.S_AUDIT.equals(oldRelsease.getBillStatus())) {
			return "此新闻已经被其他人审核！";
		}

		BusReleaseNewsWithBLOBs relsease = new BusReleaseNewsWithBLOBs();
		relsease.setBillId(action.getBillId());
		if (Constant.OP_AUDIT_AGREE.equals(action.getActionType())) {
			relsease.setBillStatus(Constant.S_RELEASE);
		} else if (Constant.OP_AUDIT_NOTAGREE.equals(action.getActionType())) {
			relsease.setBillStatus(Constant.S_CREATE);
		}
		busReleaseNewsDAO.updateByPrimaryKeySelective(relsease);

		SuptTask updateTask = new SuptTask();
		updateTask.setTaskId(action.getTaskId());
		updateTask.setIsFinish(Constant.FLAG_YES);
		updateTask.setFinishTime(this.getSysDate());
		suptTaskDAO.updateByPrimaryKeySelective(updateTask);

		SuptTask task = new SuptTask();
		task.setBillId(relsease.getBillId());
		task.setBusinessType(Constant.BUSINESS_TYPE_NEWS);
		task.setTaskSn(Helper.getCurrentTimeStr() + this.buildSequence());
		task.setDealObjectType(Constant.DEAL_OBJECT_TYPE_PERSON);
		if (Constant.OP_AUDIT_AGREE.equals(action.getActionType())) {
			task.setTaskStatus(Constant.S_RELEASE);
			String userRoleName = commonOperateService.queryUserRoleName(action.getUserVO().getUserId());
			task.setDealObjectId(commonOperateService.queryNextDealObject(action.getUserVO().getUserId(), userRoleName, relsease.getBillStatus()));
			task.setDealObjectGroup(commonOperateService.queryUserUnitName(task.getDealObjectId()));
		} else if (Constant.OP_AUDIT_NOTAGREE.equals(action.getActionType())) {
			task.setTaskStatus(Constant.S_CREATE);
			task.setDealObjectId(oldRelsease.getCreator());
		}
		task.setCreator(action.getUserVO().getUserId());
		task.setIsFinish(Constant.FLAG_NO);
		task.setIsRedo(Constant.FLAG_NO);
		task.setTaskIdParent(action.getTaskId());
		suptTaskDAO.insertSelective(task);

		action.setBusinessType(Constant.BUSINESS_TYPE_NEWS);
		action.setBillId(relsease.getBillId());
		action.setBillStatus(relsease.getBillStatus());
		action.setOperator(action.getUserVO().getUserId());
		suptActionDAO.insertSelective(action);

		return Constant.OPERATE_RESULT_SUCCESS;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public String release(SuptAction action) {
		BusReleaseNewsKey newsKey = new BusReleaseNewsKey();
		newsKey.setBillId(action.getBillId());
		BusReleaseNews oldRelsease = busReleaseNewsDAO.selectByPrimaryKey(newsKey);
		if (oldRelsease != null && !Constant.S_RELEASE.equals(oldRelsease.getBillStatus())) {
			return "此新闻已经发布！";
		}

		BusReleaseNewsWithBLOBs relsease = new BusReleaseNewsWithBLOBs();
		relsease.setBillId(action.getBillId());
		if (Constant.OP_RELEASE_AGREE.equals(action.getActionType())) {
			relsease.setBillStatus(Constant.S_FINISH);
		} else if (Constant.OP_RELEASE_NOTAGREE.equals(action.getActionType())) {
			relsease.setBillStatus(Constant.S_AUDIT);
		}
		busReleaseNewsDAO.updateByPrimaryKeySelective(relsease);

		SuptTaskKey updateTaskkey = new SuptTaskKey();
		updateTaskkey.setTaskId(action.getTaskId());
		SuptTask updateTask = suptTaskDAO.selectByPrimaryKey(updateTaskkey);
		updateTask.setIsFinish(Constant.FLAG_YES);
		updateTask.setFinishTime(this.getSysDate());
		suptTaskDAO.updateByPrimaryKeySelective(updateTask);

		SuptTask task = new SuptTask();
		task.setBillId(relsease.getBillId());
		task.setBusinessType(Constant.BUSINESS_TYPE_NEWS);
		task.setTaskSn(Helper.getCurrentTimeStr() + this.buildSequence());
		task.setCreator(action.getUserVO().getUserId());
		task.setIsFinish(Constant.FLAG_NO);
		task.setIsRedo(Constant.FLAG_NO);
		task.setDealObjectType(Constant.DEAL_OBJECT_TYPE_PERSON);
		if (Constant.OP_RELEASE_AGREE.equals(action.getActionType())) {
			task.setTaskStatus(Constant.S_FINISH);
			task.setDealObjectId(action.getUserVO().getUserId());
			task.setDealObjectGroup(action.getUserVO().getUnitId());
		} else if (Constant.OP_RELEASE_NOTAGREE.equals(action.getActionType())) {
			task.setTaskStatus(Constant.S_AUDIT);
			SuptTaskKey taskkey = new SuptTaskKey();
			taskkey.setTaskId(updateTask.getTaskIdParent());
			SuptTask lastTask = suptTaskDAO.selectByPrimaryKey(taskkey);
			task.setDealObjectId(lastTask.getDealObjectId());
			task.setDealObjectGroup(lastTask.getDealObjectGroup());
		}
		task.setTaskIdParent(action.getTaskId());
		suptTaskDAO.insertSelective(task);

		action.setBusinessType(Constant.BUSINESS_TYPE_NEWS);
		action.setBillId(relsease.getBillId());
		action.setBillStatus(relsease.getBillStatus());
		action.setOperator(action.getUserVO().getUserId());
		suptActionDAO.insertSelective(action);

		return Constant.OPERATE_RESULT_SUCCESS;
	}

}
