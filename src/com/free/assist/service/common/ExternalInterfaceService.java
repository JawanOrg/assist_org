package com.free.assist.service.common;

import javax.jws.WebService;

import com.free.assist.service.BaseService;


@WebService
public interface ExternalInterfaceService extends BaseService {

	/**
	 * 通用对外接口
	 *
	 * @param xmlStr
	 * @return
	 * @throws Exception
	 */
	public String executeXML(String xmlStr) throws Exception;

}
