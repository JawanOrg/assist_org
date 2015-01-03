package com.free.assist.service.common;

import java.util.List;

import javax.jws.WebService;

import com.free.assist.domain.SuptAction;
import com.free.assist.domain.SuptActionExample;
import com.free.assist.domain.SuptAttach;
import com.free.assist.domain.SuptTask;
import com.free.assist.domain.SuptTaskExample;
import com.free.assist.service.BaseService;

@WebService
public interface CommonOperateService extends BaseService {

	List<SuptTask> queryTask(SuptTaskExample example);

	List<SuptAction> queryActions(SuptActionExample example);

	String uploadFile(SuptAttach attach);

	String queryNextDealObject(String userId, String userRoleName, String nextStatus);

	String queryUserName(String userId);

	String queryNextStatus(String userRoleName, String actionType);

	String queryUserRoleName(String userId);
	
	String queryUserUnitName(String userId);
}
