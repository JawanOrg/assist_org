package com.free.assist.service.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.free.assist.dao.SuptActionDAO;
import com.free.assist.dao.SuptAttachDAO;
import com.free.assist.dao.SuptTaskDAO;
import com.free.assist.dao.SysRoleDAO;
import com.free.assist.dao.SysUnitDAO;
import com.free.assist.dao.SysUserDAO;
import com.free.assist.dao.SysUserRoleDAO;
import com.free.assist.domain.SuptAction;
import com.free.assist.domain.SuptActionExample;
import com.free.assist.domain.SuptAttach;
import com.free.assist.domain.SuptTask;
import com.free.assist.domain.SuptTaskExample;
import com.free.assist.domain.SysRole;
import com.free.assist.domain.SysRoleExample;
import com.free.assist.domain.SysUnit;
import com.free.assist.domain.SysUser;
import com.free.assist.domain.SysUserKey;
import com.free.assist.domain.SysUserRole;
import com.free.assist.domain.SysUserRoleExample;
import com.free.assist.service.BaseServiceImpl;
import com.free.assist.util.Constant;

@Service("commonOperateService")
public class CommonOperateServiceImpl extends BaseServiceImpl implements CommonOperateService {
	private SuptActionDAO suptActionDAO;
	private SuptTaskDAO suptTaskDAO;
	private SuptAttachDAO suptAttachDAO;
	@Autowired
	private SysUnitDAO mySysUnitDAO;
	@Autowired
	private SysUserDAO sysUserDAO;
	@Autowired
	private SysUserRoleDAO sysUserRoleDAO;
	@Autowired
	private SysRoleDAO sysRoleDAO;

	@Autowired
	public void setSuptActionDAO(SuptActionDAO suptActionDAO) {
		this.suptActionDAO = suptActionDAO;
	}

	@Autowired
	public void setSuptTaskDAO(SuptTaskDAO suptTaskDAO) {
		this.suptTaskDAO = suptTaskDAO;
	}

	@Autowired
	public void setSuptAttachDAO(SuptAttachDAO suptAttachDAO) {
		this.suptAttachDAO = suptAttachDAO;
	}

	@Override
	public List<SuptTask> queryTask(SuptTaskExample example) {
		return suptTaskDAO.selectByExample(example);
	}

	@Override
	public List<SuptAction> queryActions(SuptActionExample example) {
		return suptActionDAO.selectByExample(example);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public String uploadFile(SuptAttach attach) {
		suptAttachDAO.insertSelective(attach);
		return Constant.OPERATE_RESULT_SUCCESS;
	}

	public String queryNextDealObject(String userId, String userRoleName, String nextStatus) {
		List<SysUnit> sysUnitList = this.mySysUnitDAO.selectByUserId(userId);
		if (sysUnitList != null && sysUnitList.size() > 0) {
			if (Constant.S_AUDIT.equals(nextStatus)) {
				if (Constant.ROLE_NAME_GENERAL.equals(userRoleName)) {
					for (SysUnit unit : sysUnitList) {
						if (unit.getUnitDes() != null && unit.getUnitDes().trim().length() > 0 && Constant.UNIT_TYPE_UNIT.equals(unit.getUnitType())) {
							return unit.getUnitDes();
						}
					}
				}
			} else if (Constant.S_RELEASE.equals(nextStatus)) {
				if (Constant.ROLE_NAME_GENERAL.equals(userRoleName)) {
					for (SysUnit unit : sysUnitList) {
						if (unit.getUnitDes() != null && unit.getUnitDes().trim().length() > 0 && Constant.UNIT_TYPE_GROUG.equals(unit.getUnitType())) {
							return unit.getUnitDes();
						}
					}
				} else if (Constant.ROLE_NAME_ADMIN_UNIT.equals(userRoleName)) {
					for (SysUnit unit : sysUnitList) {
						if (unit.getUnitDes() != null && unit.getUnitDes().trim().length() > 0 && Constant.UNIT_TYPE_GROUG.equals(unit.getUnitType())) {
							return unit.getUnitDes();
						}
					}
				}
			}
		}
		return null;
	}

	public String queryUserName(String userId) {
		SysUserKey userKey = new SysUserKey();
		userKey.setUserId(userId);
		SysUser user = sysUserDAO.selectByPrimaryKey(userKey);
		if (user != null) {
			return user.getUserName();
		}
		return "";
	}

	public String queryNextStatus(String userRoleName, String actionType) {
		String nextStatus = null;
		if (Constant.OP_CREATE.equals(actionType)) {
			if (Constant.ROLE_NAME_GENERAL.equals(userRoleName)) {
				nextStatus = Constant.S_AUDIT;
			} else if (Constant.ROLE_NAME_ADMIN_UNIT.equals(userRoleName)) {
				nextStatus = Constant.S_RELEASE;
			} else if (Constant.ROLE_NAME_ADMIN_WEB.equals(userRoleName)) {
				nextStatus = Constant.S_WORK;
			}
		} else if (Constant.OP_AUDIT_AGREE.equals(actionType)) {
			if (Constant.ROLE_NAME_GENERAL.equals(userRoleName)) {
				nextStatus = Constant.S_RELEASE;
			} else if (Constant.ROLE_NAME_ADMIN_UNIT.equals(userRoleName)) {
				nextStatus = Constant.S_WORK;
			}
		} else if (Constant.OP_RELEASE_AGREE.equals(actionType)) {
			if (Constant.ROLE_NAME_GENERAL.equals(userRoleName)) {
				nextStatus = Constant.S_WORK;
			}
		}
		return nextStatus;
	}

	public String queryUserRoleName(String userId) {
		String userRoleName = "";
		SysRoleExample roleEx = new SysRoleExample();
		List<String> roleNameList = new ArrayList<String>();
		roleNameList.add(Constant.ROLE_NAME_ADMIN_UNIT);
		roleNameList.add(Constant.ROLE_NAME_ADMIN_WEB);
		roleNameList.add(Constant.ROLE_NAME_GENERAL);
		roleEx.createCriteria().andRolenameIn(roleNameList);
		List<SysRole> roleList = sysRoleDAO.selectByExample(roleEx);
		SysUserRole userRole = null;
		List<SysUserRole> urList = null;
		for (SysRole role : roleList) {
			SysUserRoleExample urEx = new SysUserRoleExample();
			urEx.createCriteria().andRoleIdEqualTo(role.getRoleid()).andUserIdEqualTo(userId);
			urList = sysUserRoleDAO.selectByExample(urEx);
			if (urList != null && urList.size() > 0) {
				userRole = urList.get(0);
				if (Constant.ROLE_NAME_GENERAL.equals(role.getRolename()) && userRole.getRoleId().equals(role.getRoleid())) {
					userRoleName = Constant.ROLE_NAME_GENERAL;
				}
				if (Constant.ROLE_NAME_ADMIN_UNIT.equals(role.getRolename()) && userRole.getRoleId().equals(role.getRoleid())) {
					userRoleName = Constant.ROLE_NAME_ADMIN_UNIT;
				}
				if (Constant.ROLE_NAME_ADMIN_WEB.equals(role.getRolename()) && userRole.getRoleId().equals(role.getRoleid())) {
					userRoleName = Constant.ROLE_NAME_ADMIN_WEB;
				}
			}
		}
		return userRoleName;
	}

	public String queryUserUnitName(String userId) {
		List<SysUnit> sysUnitList = this.mySysUnitDAO.selectByUserId(userId);
		if (sysUnitList != null && sysUnitList.size() > 0) {
			for (SysUnit unit : sysUnitList) {
				if (Constant.UNIT_TYPE_UNIT.equals(unit.getUnitType())) {
					return unit.getUnitName();
				} else if (Constant.UNIT_TYPE_GROUG.equals(unit.getUnitType())) {
					return unit.getUnitName();
				}
			}
		}
		return "";
	}

	public String queryUserUnitId(String userId) {
		List<SysUnit> sysUnitList = this.mySysUnitDAO.selectByUserId(userId);
		if (sysUnitList != null && sysUnitList.size() > 0) {
			for (SysUnit unit : sysUnitList) {
				if (Constant.UNIT_TYPE_UNIT.equals(unit.getUnitType())) {
					return unit.getUnitId();
				}
			}
		}
		return "";
	}
}
