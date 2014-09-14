package com.free.assist.service.news;

import com.free.assist.domain.BusReleaseTrends;
import com.free.assist.domain.SuptAction;
import com.free.assist.service.BaseService;

public interface NewsOperateService extends BaseService {
    String create(BusReleaseTrends relsease, SuptAction action);

    String audit(SuptAction action);

    String release(SuptAction action);

}
