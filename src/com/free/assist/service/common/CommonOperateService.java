package com.free.assist.service.common;

import java.util.List;

import javax.jws.WebService;

import com.free.assist.domain.BusReleaseTrends;
import com.free.assist.domain.BusReleaseTrendsExample;
import com.free.assist.domain.BusReleaseTrendsKey;
import com.free.assist.domain.SuptAction;
import com.free.assist.domain.SuptActionExample;
import com.free.assist.domain.SuptAttach;
import com.free.assist.domain.SuptTask;
import com.free.assist.domain.SuptTaskExample;
import com.free.assist.service.BaseService;

@WebService
public interface CommonOperateService extends BaseService {

    List<BusReleaseTrends> query(BusReleaseTrendsExample ex);

    BusReleaseTrends queryByKey(BusReleaseTrendsKey key);

    List<SuptTask> queryTask(SuptTaskExample example);

    List<SuptAction> queryActions(SuptActionExample example);
    
    String uploadFile(SuptAttach attach);
    
    String queryNextDealObject(String userId);
}
