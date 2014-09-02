package com.free.assist.service.sys;

import com.free.assist.domain.SysParameterConf;
import com.free.assist.service.BaseService;

public interface ISysParameterConfService extends BaseService {

	public String addDataSysParameterConf(SysParameterConf sto) throws Exception;

	public String updateDataSysParameterConf(SysParameterConf sto) throws Exception;

	public String deleteDataSysParameterConf(String ids) throws Exception;

	public String getParValueByParName(String parName) throws Exception;

	public String getParValueByParName(String parName, String defaultValue) throws Exception;

}
