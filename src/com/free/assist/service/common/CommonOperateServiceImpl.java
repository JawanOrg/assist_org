package com.free.assist.service.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.free.assist.dao.BusReleaseTrendsDAO;
import com.free.assist.dao.SuptActionDAO;
import com.free.assist.dao.SuptAttachDAO;
import com.free.assist.dao.SuptTaskDAO;
import com.free.assist.domain.BusReleaseTrends;
import com.free.assist.domain.BusReleaseTrendsExample;
import com.free.assist.domain.BusReleaseTrendsKey;
import com.free.assist.domain.SuptAction;
import com.free.assist.domain.SuptActionExample;
import com.free.assist.domain.SuptAttach;
import com.free.assist.domain.SuptTask;
import com.free.assist.domain.SuptTaskExample;
import com.free.assist.service.BaseServiceImpl;
import com.free.assist.util.Constant;

@Service("commonOperateService")
public class CommonOperateServiceImpl extends BaseServiceImpl implements CommonOperateService {
    private BusReleaseTrendsDAO busReleaseTrendsDAO;
    private SuptActionDAO suptActionDAO;
    private SuptTaskDAO suptTaskDAO;
    private SuptAttachDAO suptAttachDAO;

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

    @Autowired
    public void setSuptAttachDAO(SuptAttachDAO suptAttachDAO) {
        this.suptAttachDAO = suptAttachDAO;
    }

    @Override
    public List<BusReleaseTrends> query(BusReleaseTrendsExample ex) {
        return busReleaseTrendsDAO.selectByExample(ex);
    }

    @Override
    public BusReleaseTrends queryByKey(BusReleaseTrendsKey key) {
        return busReleaseTrendsDAO.selectByPrimaryKey(key);
    }

    @Override
    public List<SuptTask> queryTask(SuptTaskExample example) {
        return suptTaskDAO.selectByExample(example);
    }

    @Override
    public List<SuptAction> queryActions(SuptActionExample example) {
        return suptActionDAO.selectByExample(example);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
    public String uploadFile(SuptAttach attach) {
        suptAttachDAO.insertSelective(attach);
        return Constant.OPERATE_RESULT_SUCCESS;
    }
}
