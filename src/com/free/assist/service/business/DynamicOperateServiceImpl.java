package com.free.assist.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.free.assist.dao.BusReleaseTrendsDAO;
import com.free.assist.dao.SuptActionDAO;
import com.free.assist.dao.SuptTaskDAO;
import com.free.assist.domain.BusReleaseTrends;
import com.free.assist.domain.BusReleaseTrendsKey;
import com.free.assist.domain.SuptAction;
import com.free.assist.domain.SuptTask;
import com.free.assist.service.BaseServiceImpl;
import com.free.assist.service.common.CommonOperateService;
import com.free.assist.util.Constant;
import com.free.assist.util.Helper;

@Service("dynamicOperateService")
public class DynamicOperateServiceImpl extends BaseServiceImpl implements DynamicOperateService {
    private BusReleaseTrendsDAO busReleaseTrendsDAO;
    private SuptActionDAO suptActionDAO;
    private SuptTaskDAO suptTaskDAO;
    
    @Autowired
    private CommonOperateService commonOperateService;

    @Autowired
    public void setBusReleaseTrendsDAO(BusReleaseTrendsDAO busReleaseDAO) {
        this.busReleaseTrendsDAO = busReleaseDAO;
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
    public String create(BusReleaseTrends relsease, SuptAction action) {
        String billSn = Helper.getCurrentTimeStr() + this.buildSequence();
        relsease.setBillSn(billSn);
        relsease.setCreator(action.getUserVO().getUserId());
        relsease.setCreateDept(action.getUserVO().getUserId());
        relsease.setCreateTime(this.getSysDate());
        relsease.setBillStatus(Constant.S_AUDIT);
        busReleaseTrendsDAO.insertSelective(relsease);

        SuptTask task = new SuptTask();
        task.setBillId(relsease.getBillId());
        task.setBusinessType(Constant.BUSINESS_TYPE_TRENDS);
        task.setTaskSn(Helper.getCurrentTimeStr() + this.buildSequence());
        task.setTaskStatus(Constant.S_AUDIT);
        task.setCreator(action.getUserVO().getUserId());
        task.setIsFinish(Constant.FLAG_NO);
        task.setIsRedo(Constant.FLAG_NO);
        task.setDealObjectId(commonOperateService.queryNextDealObject(action.getUserVO().getUserId()));
        task.setDealObjectType(Constant.DEAL_OBJECT_TYPE_PERSON);
        task.setDealObjectGroup(action.getUserVO().getUnitId());
        task.setTaskIdParent("0");
        suptTaskDAO.insertSelective(task);

        action.setBusinessType(Constant.BUSINESS_TYPE_TRENDS);
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
        BusReleaseTrendsKey trendsKey = new BusReleaseTrendsKey();
        trendsKey.setBillId(action.getBillId());
        BusReleaseTrends oldRelsease = busReleaseTrendsDAO.selectByPrimaryKey(trendsKey);
        if (oldRelsease != null && !Constant.S_AUDIT.equals(oldRelsease.getBillStatus())) {
            return "工单已审核！";
        }

        BusReleaseTrends relsease = new BusReleaseTrends();
        relsease.setBillId(action.getBillId());
        relsease.setBillStatus(Constant.S_RELEASE);
        busReleaseTrendsDAO.updateByPrimaryKeySelective(relsease);

        SuptTask updateTask = new SuptTask();
        updateTask.setTaskId(action.getTaskId());
        updateTask.setIsFinish(Constant.FLAG_YES);
        updateTask.setFinishTime(this.getSysDate());
        suptTaskDAO.updateByPrimaryKeySelective(updateTask);

        SuptTask task = new SuptTask();
        task.setBillId(relsease.getBillId());
        task.setBusinessType(Constant.BUSINESS_TYPE_TRENDS);
        task.setTaskSn(Helper.getCurrentTimeStr() + this.buildSequence());
        task.setTaskStatus(Constant.S_RELEASE);
        task.setCreator(action.getUserVO().getUserId());
        task.setIsFinish(Constant.FLAG_NO);
        task.setIsRedo(Constant.FLAG_NO);
        task.setDealObjectId(action.getUserVO().getUserId());// TODO
        task.setDealObjectType(Constant.DEAL_OBJECT_TYPE_PERSON);
        task.setDealObjectGroup(action.getUserVO().getUnitId());
        task.setTaskIdParent(action.getTaskId());
        suptTaskDAO.insertSelective(task);

        action.setBusinessType(Constant.BUSINESS_TYPE_TRENDS);
        action.setBillId(relsease.getBillId());
        action.setBillStatus(relsease.getBillStatus());
        action.setOperator(action.getUserVO().getUserId());
        suptActionDAO.insertSelective(action);

        return Constant.OPERATE_RESULT_SUCCESS;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
    public String release(SuptAction action) {
        BusReleaseTrendsKey trendsKey = new BusReleaseTrendsKey();
        trendsKey.setBillId(action.getBillId());
        BusReleaseTrends oldRelsease = busReleaseTrendsDAO.selectByPrimaryKey(trendsKey);
        if (oldRelsease != null && !Constant.S_RELEASE.equals(oldRelsease.getBillStatus())) {
            return "工单已发布！";
        }

        BusReleaseTrends relsease = new BusReleaseTrends();
        relsease.setBillId(action.getBillId());
        relsease.setBillStatus(Constant.S_WORK);
        busReleaseTrendsDAO.updateByPrimaryKeySelective(relsease);

        SuptTask updateTask = new SuptTask();
        updateTask.setTaskId(action.getTaskId());
        updateTask.setIsFinish(Constant.FLAG_YES);
        updateTask.setFinishTime(this.getSysDate());
        suptTaskDAO.updateByPrimaryKeySelective(updateTask);

        SuptTask task = new SuptTask();
        task.setBillId(relsease.getBillId());
        task.setBusinessType(Constant.BUSINESS_TYPE_TRENDS);
        task.setTaskSn(Helper.getCurrentTimeStr() + this.buildSequence());
        task.setTaskStatus(Constant.S_WORK);
        task.setCreator(action.getUserVO().getUserId());
        task.setIsFinish(Constant.FLAG_NO);
        task.setIsRedo(Constant.FLAG_NO);
        task.setDealObjectId(action.getUserVO().getUserId());// TODO
        task.setDealObjectType(Constant.DEAL_OBJECT_TYPE_PERSON);
        task.setDealObjectGroup(action.getUserVO().getUnitId());
        task.setTaskIdParent(action.getTaskId());
        suptTaskDAO.insertSelective(task);

        action.setBusinessType(Constant.BUSINESS_TYPE_TRENDS);
        action.setBillId(relsease.getBillId());
        action.setBillStatus(relsease.getBillStatus());
        action.setOperator(action.getUserVO().getUserId());
        suptActionDAO.insertSelective(action);

        return Constant.OPERATE_RESULT_SUCCESS;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
    public String writeSuggestion(SuptAction action) {
        BusReleaseTrendsKey key = new BusReleaseTrendsKey();
        key.setBillId(action.getBillId());
        BusReleaseTrends trends = busReleaseTrendsDAO.selectByPrimaryKey(key);
        action.setActionType(Constant.OP_WRITE_SUGGESTION);
        action.setBusinessType(Constant.BUSINESS_TYPE_TRENDS);
        action.setBillStatus(trends.getBillStatus());
        action.setOperator(action.getUserVO().getUserId());
        suptActionDAO.insertSelective(action);

        return Constant.OPERATE_RESULT_SUCCESS;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
    public String finishWork(SuptAction action) {
        BusReleaseTrendsKey trendsKey = new BusReleaseTrendsKey();
        trendsKey.setBillId(action.getBillId());
        BusReleaseTrends oldRelsease = busReleaseTrendsDAO.selectByPrimaryKey(trendsKey);
        if (oldRelsease != null && !Constant.S_WORK.equals(oldRelsease.getBillStatus())) {
            return "工单已完工！";
        }

        BusReleaseTrendsKey key = new BusReleaseTrendsKey();
        key.setBillId(action.getBillId());
        BusReleaseTrends trends = busReleaseTrendsDAO.selectByPrimaryKey(key);

        trends.setBillStatus(Constant.S_FINISH);
        busReleaseTrendsDAO.updateByPrimaryKeySelective(trends);

        SuptTask updateTask = new SuptTask();
        updateTask.setTaskId(action.getTaskId());
        updateTask.setIsFinish(Constant.FLAG_YES);
        updateTask.setFinishTime(this.getSysDate());
        suptTaskDAO.updateByPrimaryKeySelective(updateTask);

        SuptTask task = new SuptTask();
        task.setBillId(action.getBillId());
        task.setBusinessType(Constant.BUSINESS_TYPE_TRENDS);
        task.setTaskSn(Helper.getCurrentTimeStr() + this.buildSequence());
        task.setTaskStatus(Constant.S_FINISH);
        task.setCreator(action.getUserVO().getUserId());
        task.setIsFinish(Constant.FLAG_YES);
        task.setIsRedo(Constant.FLAG_NO);
        task.setDealObjectId(action.getUserVO().getUserId());
        task.setDealObjectType(Constant.DEAL_OBJECT_TYPE_PERSON);
        task.setDealObjectGroup(action.getUserVO().getUnitId());
        task.setTaskIdParent(action.getTaskId());
        suptTaskDAO.insertSelective(task);

        action.setActionType(Constant.OP_FINISH_WORK);
        action.setBusinessType(Constant.BUSINESS_TYPE_TRENDS);
        action.setBillStatus(trends.getBillStatus());
        action.setOperator(action.getUserVO().getUserId());
        suptActionDAO.insertSelective(action);

        return Constant.OPERATE_RESULT_SUCCESS;
    }

}
