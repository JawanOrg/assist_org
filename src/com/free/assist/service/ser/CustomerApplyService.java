package com.free.assist.service.ser;

import javax.jws.WebService;

import com.free.assist.domain.SysUser;

@WebService
public interface CustomerApplyService {
	public String getAllUser(String xml);
}
