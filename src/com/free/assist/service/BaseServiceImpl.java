package com.free.assist.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.DataFieldMaxValueIncrementer;
import org.springframework.stereotype.Service;

import com.free.assist.dao.GenericDAO;
import com.free.assist.domain.BaseExample;
import com.free.assist.util.Pager;
import com.free.assist.util.StringUtil;

@Service("baseService")
public class BaseServiceImpl implements BaseService {

	public final Logger logger = LoggerFactory.getLogger(getClass());

	private GenericDAO genericDAO;
	private DataFieldMaxValueIncrementer incrementer;

	@Autowired
	public void setGenericDAO(GenericDAO genericDAO) {
		this.genericDAO = genericDAO;
	}

	@Autowired
	public void setIncrementer(DataFieldMaxValueIncrementer incrementer) {
		this.incrementer = incrementer;
	}

	public BaseServiceImpl() {

	}

	public int deleteByExample(Object example) throws RuntimeException {
		try {
			return genericDAO.deleteByExample(example);
		} catch (RuntimeException e) {
			logger.info("��" + this.getClass().getSimpleName() + "��������쳣:" + e.getMessage());
			throw new RuntimeException("����쳣:" + e.getMessage());
		}
	}

	public int deleteByPrimaryKey(Object object) throws RuntimeException {
		try {
			return genericDAO.deleteByPrimaryKey(object);
		} catch (RuntimeException e) {
			logger.info("��" + this.getClass().getSimpleName() + "��������쳣:" + e.getMessage());
			throw new RuntimeException("����쳣:" + e.getMessage());
		}
	}

	public void insert(Object object) throws RuntimeException {
		try {
			genericDAO.insert(object);

		} catch (RuntimeException e) {
			logger.info("��" + this.getClass().getSimpleName() + "��������쳣:" + e.getMessage());
			throw new RuntimeException("����쳣:" + e.getMessage());
		}
	}

	public List selectByExample(Object example) throws RuntimeException {
		try {
			return genericDAO.selectByExample(example);
		} catch (RuntimeException e) {
			logger.info("��" + this.getClass().getSimpleName() + "��������쳣:" + e.getMessage());
			throw new RuntimeException("����쳣:" + e.getMessage());
		}
	}

	public List selectByExampleWithBLOBs(Object example) throws RuntimeException{
		try {
			return genericDAO.selectByExampleWithBLOBs(example);
		} catch (RuntimeException e) {
			logger.info("��" + this.getClass().getSimpleName() + "��������쳣:" + e.getMessage());
			throw new RuntimeException("����쳣:" + e.getMessage());
		}
	}

	public Object selectByPrimaryKey(Object object) throws RuntimeException {
		try {
			return genericDAO.selectByPrimaryKey(object);
		} catch (RuntimeException e) {
			logger.info("��" + this.getClass().getSimpleName() + "��������쳣:" + e.getMessage());
			throw new RuntimeException("����쳣:" + e.getMessage());
		}
	}

	public Object selectByPrimaryKeyWithBLOBs(Object object) throws RuntimeException {
		try {
			return genericDAO.selectByPrimaryKeyWithBLOBs(object);
		} catch (RuntimeException e) {
			logger.info("��" + this.getClass().getSimpleName() + "��������쳣:" + e.getMessage());
			throw new RuntimeException("����쳣:" + e.getMessage());
		}
	}

	public Integer selectCountByExample(Object example) throws RuntimeException {
		try {
			return genericDAO.selectCountByExample(example);
		} catch (RuntimeException e) {
			logger.info("��" + this.getClass().getSimpleName() + "��������쳣:" + e.getMessage());
			throw new RuntimeException("����쳣:" + e.getMessage());
		}
	}

	public int updateByPrimaryKey(Object object) throws RuntimeException {
		try {
			return genericDAO.updateByPrimaryKey(object);
		} catch (RuntimeException e) {
			logger.info("��" + this.getClass().getSimpleName() + "��������쳣:" + e.getMessage());
			throw new RuntimeException("����쳣:" + e.getMessage());
		}
	}

	public int updateByPrimaryKeySelective(Object object) throws RuntimeException {
		try {
			return genericDAO.updateByPrimaryKeySelective(object);
		} catch (RuntimeException e) {
			logger.info("��" + this.getClass().getSimpleName() + "��������쳣:" + e.getMessage());
			throw new RuntimeException("����쳣:" + e.getMessage());
		}
	}

	public Date getSysDate() throws RuntimeException {
		return this.genericDAO.getSysDate();
	}

	public String buildGUID() throws RuntimeException {
		return this.genericDAO.buildGUID();
	}

	public String buildSequence() throws RuntimeException {
		Long sequence = new Long(incrementer.nextLongValue());
		return StringUtil.padLeft(sequence.toString(), 4);
	}

	/* (non-Javadoc)
	 * @see com.regaltec.blocimp.service.BaseService#selectPageByExample(java.lang.Object)
	 */
	public Pager selectPageByExample(BaseExample example) throws RuntimeException {
		try {
			return genericDAO.selectPageByExample(example);
		} catch (RuntimeException e) {
			logger.info("��" + this.getClass().getSimpleName() + "��������쳣:" + e.getMessage());
			throw new RuntimeException("����쳣:" + e.getMessage());
		}
	}
	
	public Pager selectPageByExampleWithBLOBs(BaseExample example) throws RuntimeException{
		try {
			return genericDAO.selectPageByExampleWithBLOBs(example);
		} catch (RuntimeException e) {
			logger.info("��" + this.getClass().getSimpleName() + "��������쳣:" + e.getMessage());
			throw new RuntimeException("����쳣:" + e.getMessage());
		}
		
	}
}