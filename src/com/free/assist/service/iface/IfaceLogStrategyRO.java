/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.service.iface;

import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.free.assist.dao.IfaceLogListenerDAO;
import com.free.assist.dao.IfaceLogStrategyDAO;
import com.free.assist.domain.IfaceLogListener;
import com.free.assist.domain.IfaceLogListenerExample;
import com.free.assist.domain.IfaceLogStrategy;
import com.free.assist.domain.IfaceLogStrategyExample;

/**
 * @author 李猛
 * @version 1
 * @date 2009-10-20 下午11:11:49
 */
public class IfaceLogStrategyRO {

	private Logger logger = LoggerFactory.getLogger(IfaceLogStrategyRO.class);

	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public IfaceLogStrategy current() {
		IfaceLogStrategyExample example = new IfaceLogStrategyExample();
		example.setOrderByClause("IS_AVAILABLE DESC");
		example.setSkipResults(0).setMaxResults(1);
		List<IfaceLogStrategy> ifaceLogStrategyList = ifaceLogStrategyDAO.selectByExample(example);
		if (ifaceLogStrategyList == null || ifaceLogStrategyList.isEmpty()) {
			IfaceLogStrategy ifaceLogStrategy = new IfaceLogStrategy();
			ifaceLogStrategy.setTimeEnable("N");
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.HOUR, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			ifaceLogStrategy.setTimeLower(calendar.getTime());
			calendar.set(Calendar.HOUR, 23);
			calendar.set(Calendar.MINUTE, 59);
			calendar.set(Calendar.SECOND, 59);
			ifaceLogStrategy.setTimeUpper(calendar.getTime());
			ifaceLogStrategy.setDateEnable("N");
			ifaceLogStrategy.setDateSetting("");
			ifaceLogStrategy.setMonthEnable("N");
			ifaceLogStrategy.setMonthSetting("");
			ifaceLogStrategy.setWeekEnable("N");
			ifaceLogStrategy.setWeekSetting("");
			ifaceLogStrategy.setUpdateDate(new java.util.Date());
			ifaceLogStrategy.setAvailable("Y");
			ifaceLogStrategyDAO.insert(ifaceLogStrategy);
			return ifaceLogStrategy;
		} else {
			return ifaceLogStrategyList.iterator().next();
		}
	}
	
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public void update(IfaceLogStrategy ifaceLogStrategy) {
		if (ifaceLogStrategy == null) {
			logger.error("parameter ifaceLogStrategy must not be null");
			throw new IllegalArgumentException("parameter ifaceLogStrategy must not be null");
		}
		if (StringUtils.isBlank(ifaceLogStrategy.getStrategyId())) {
			logger.error("property strategyId must not be empty");
			throw new IllegalArgumentException("property strategyId must not be empty");
		}
		ifaceLogStrategyDAO.updateByPrimaryKeySelective(ifaceLogStrategy);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public List<IfaceLogListener> getListeners() {
		IfaceLogListenerExample example = new IfaceLogListenerExample();
		return ifaceLogListenerDAO.selectByExample(example);
	}
	
	/*public void subscribe(List<IfaceLogListener> IfaceLogListeners) {
		ifaceLogListenerDAO.deleteByExample(new IfaceLogListenerExample());
		if (IfaceLogListeners == null || IfaceLogListeners.isEmpty()) {
			if (logger.isInfoEnabled()) {
				logger.info("该次订阅中订阅对象为空！");
			}
			return;
		}
		for (IfaceLogListener ifaceLogListener : IfaceLogListeners) {
			if (StringUtils.isBlank(ifaceLogListener.getListenerType()) || StringUtils.isBlank(ifaceLogListener.getListenerSign())) {
				if (logger.isWarnEnabled()) {
					logger.warn("property listenerType is empty, so this time is ignore.");
				}
				continue;
			}
			if (StringUtils.isBlank(ifaceLogListener.getListenerId())) {
				ifaceLogListenerDAO.insert(ifaceLogListener);
			} else {
				ifaceLogListenerDAO.updateByPrimaryKeySelective(ifaceLogListener);
			}
		}
	}*/
	
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public IfaceLogListener subscribe(IfaceLogListener ifaceLogListener) {
		if (StringUtils.isBlank(ifaceLogListener.getListenerType()) || StringUtils.isBlank(ifaceLogListener.getListenerSign())) {
			if (logger.isWarnEnabled()) {
				logger.warn("property listenerType or listenerSign is empty");
			}
			throw new IllegalArgumentException("property listenerType or listenerSign is empty");
		}
		ifaceLogListenerDAO.insert(ifaceLogListener);
		return ifaceLogListener;
	}
	
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public IfaceLogListener unsubscribe(IfaceLogListener ifaceLogListener) {
		if (ifaceLogListener == null) {
			logger.error("parameter ifaceLogListener must not be null");
			throw new IllegalArgumentException("parameter ifaceLogListener must not be null");
		}
		if (StringUtils.isBlank(ifaceLogListener.getListenerId())) {
			logger.error("property listenerId must not be empty");
			throw new IllegalArgumentException("property listenerId must not be empty");
		}
		ifaceLogListenerDAO.deleteByPrimaryKey(ifaceLogListener);
		return ifaceLogListener;
	}
	
	@Resource private IfaceLogStrategyDAO ifaceLogStrategyDAO;
	
	@Resource private IfaceLogListenerDAO ifaceLogListenerDAO;
}
