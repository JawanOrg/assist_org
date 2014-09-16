package com.free.assist.service.business;

import com.free.assist.domain.BusReleaseNews;
import com.free.assist.domain.SuptAction;
import com.free.assist.service.BaseService;

public interface NewsOperateService extends BaseService {
    String create(BusReleaseNews relsease, SuptAction action);

    String audit(SuptAction action);

    String release(SuptAction action);

}
