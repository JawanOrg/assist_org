package com.free.assist.service.business;

import com.free.assist.domain.BusReleaseTrendsWithBLOBs;
import com.free.assist.domain.SuptAction;
import com.free.assist.service.BaseService;

public interface DynamicOperateService extends BaseService {
    String create(BusReleaseTrendsWithBLOBs relsease, SuptAction action);

    String audit(SuptAction action);

    String release(SuptAction action);

    String writeSuggestion(SuptAction action);

    String finishWork(BusReleaseTrendsWithBLOBs relsease, SuptAction action);

}
