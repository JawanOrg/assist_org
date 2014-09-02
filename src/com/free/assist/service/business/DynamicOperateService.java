package com.free.assist.service.business;

import com.free.assist.domain.BusReleaseTrends;
import com.free.assist.domain.SuptAction;
import com.free.assist.service.BaseService;

public interface DynamicOperateService extends BaseService {
    String create(BusReleaseTrends relsease, SuptAction action);

    String audit(SuptAction action);

    String release(SuptAction action);

    String writeSuggestion(SuptAction action);

    String finishWork(SuptAction action);

}
