package com.free.assist.service.ser;

import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;


import com.free.assist.util.SpringContextUtil;

@WebService
@Service("customerApplyService")
public class CustomerApplyServiceImpl implements CustomerApplyService {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(CustomerApplyServiceImpl.class);

	public String getAllUser(String xml) {
		logger.info("\n\n\n ��ʼ������Ϣ��");
		//BuildMessage producer = SpringContextUtil.getBean("buildMsg", BuildMessage.class);
		//producer.sendMessage(xml);
		return "success";
	}

}
