package com.free.assist.service.sys;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.assist.dao.SysModuleDAO;
import com.free.assist.dao.SysRoleDAO;
import com.free.assist.dao.SysRoleModuleDAO;
import com.free.assist.dao.SysUnitRoleDAO;
import com.free.assist.dao.SysUserRoleDAO;
import com.free.assist.domain.SysModule;
import com.free.assist.domain.SysModuleExample;
import com.free.assist.domain.SysRole;
import com.free.assist.domain.SysRoleExample;
import com.free.assist.domain.SysRoleModule;
import com.free.assist.domain.SysRoleModuleExample;
import com.free.assist.domain.SysUnit;
import com.free.assist.domain.SysUnitExample;
import com.free.assist.domain.SysUnitRole;
import com.free.assist.domain.SysUnitRoleExample;
import com.free.assist.domain.SysUser;
import com.free.assist.domain.SysUserRole;
import com.free.assist.domain.SysUserRoleExample;
import com.free.assist.domain.SysUserUnitExample;
import com.free.assist.service.BaseServiceImpl;

@Service("sysRoleService")
public class SysRoleServiceImpl extends BaseServiceImpl implements ISysRoleService {

	@Autowired private SysRoleDAO mySysRoleDAO;
	@Autowired private SysModuleDAO mySysModuleDAO;
	@Autowired private SysRoleModuleDAO mySysRoleModuleDAO;	
	@Autowired private SysUnitRoleDAO  mySysUnitRoleDAO;
	@Autowired private SysUserRoleDAO  mySysUserRoleDAO;
	
	//------------------------------------------------------------------------- 
	//----------------------------       SysRole begin ----------------------------  
	/**
	 * DWR函数--新增数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String addDataSysRole(SysRole sto) throws Exception {
		String strRet="";
		if(sto.getRolename()!=null&&!"".equalsIgnoreCase(sto.getRolename())) {
			SysRoleExample ex=new SysRoleExample();
			ex.createCriteria().andRolenameEqualTo(sto.getRolename().trim());
			int count= this.mySysRoleDAO.countByExample(ex);
			if(count>=1) {
				strRet="权限组名称重复!";
				return strRet;
			}
		}		
		this.mySysRoleDAO.insert(sto);
		return strRet;
	}
	
	
	/**
	 * DWR函数--更新数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String updateDataSysRole(SysRole sto) throws Exception {
		String strRet="";
		if(sto.getRolename()!=null&&!"".equalsIgnoreCase(sto.getRolename())) {
			SysRoleExample ex=new SysRoleExample();
			ex.createCriteria().andRolenameEqualTo(sto.getRolename().trim()).andRoleidNotEqualTo(sto.getRoleid());
			int count= this.mySysRoleDAO.countByExample(ex);
			if(count>=1) {
				strRet="权限组名称重复!";
				return strRet;
			}
		}		
		this.mySysRoleDAO.updateByPrimaryKeySelective(sto);
		return strRet;
	};


	/**
	 * DWR函数--删除数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String deleteDataSysRole(String ids) throws Exception {
		String strRet="";
		String[] id = StringUtils.split(ids, "|");
		for(String s:id) {
			SysRoleExample heomaEx=new SysRoleExample();
			heomaEx.createCriteria().andRoleidEqualTo(s);
			this.mySysRoleDAO.deleteByExample(heomaEx);
		}
		return strRet;
	}

	//----------------------------    SysRole end ----------------------------  
	//------------------------------------------------------------------------- 
	
	//------------------------------------------------------------------------- 
	//----------------------------     SysModule begin ----------------------------  
	/**
	 * DWR函数--新增数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String addDataSysModule(SysModule sto) throws Exception {
		String strRet="";
		if(sto.getModuleName()!=null&&!"".equalsIgnoreCase(sto.getModuleName())) {
			SysModuleExample ex=new SysModuleExample();
			ex.createCriteria().andModuleNameEqualTo(sto.getModuleName().trim());
			int count= this.mySysModuleDAO.countByExample(ex);
			if(count>=1) {
				strRet="模块名称重复!";
				return strRet;
			}
		}
		this.mySysModuleDAO.insert(sto);
		return strRet;
	}
	
	
	/**
	 * DWR函数--更新数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String updateDataSysModule(SysModule sto) throws Exception {
		String strRet="";
		if(sto.getModuleName()!=null&&!"".equalsIgnoreCase(sto.getModuleName())) {
			SysModuleExample ex=new SysModuleExample();
			ex.createCriteria().andModuleNameEqualTo(sto.getModuleName().trim()).andModuleIdNotEqualTo(sto.getModuleId());
			int count= this.mySysModuleDAO.countByExample(ex);
			if(count>=1) {
				strRet="模块名称重复!";
				return strRet;
			}
		}
		this.mySysModuleDAO.updateByPrimaryKeySelective(sto);
		return strRet;
	};
	
	
	/**
	 * DWR函数--删除数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String deleteDataSysModule(String ids) throws Exception {
		String strRet="";
		String[] id = StringUtils.split(ids, "|");
		for(String s:id) {
			SysModuleExample heomaEx=new SysModuleExample();
			heomaEx.createCriteria().andModuleIdEqualTo(s);
			this.mySysModuleDAO.deleteByExample(heomaEx);
			
			SysRoleModuleExample srmEx = new SysRoleModuleExample();
			srmEx.createCriteria().andRightidEqualTo(s);
			this.mySysRoleModuleDAO.deleteByExample(srmEx);
		}
		return strRet;
	}
	
	public int countChildrenDataSysModule(SysModuleExample smEX) {
		int childrenCount = this.mySysModuleDAO.countByExample(smEX);
		return childrenCount;
	}
	
	//--------------------------------SysModule end ----------------------------  
	//-------------------------------------------------------------------------- 
	
	//---------------------------------------------------------------------------- 
	//------------------------------SysRoleModule begin -------------------------- 
	/**
	 * DWR函数--新增数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String addDataSysRoleModule(SysRoleModule sto) throws Exception {
		String strRet="";
		if(sto.getRoleid()==null||sto.getRoleid().equals(""))
		{
			SysRoleExample ex=new SysRoleExample();
			ex.createCriteria().andRolenameEqualTo(sto.getRolename().trim());
			int count= this.mySysRoleDAO.countByExample(ex);
			if(count>=1) {
				strRet="权限组名称重复!";
				return strRet;
			}
			SysRole newRole=(SysRole) sto;
			this.mySysRoleDAO.insert(newRole);
			sto.setRoleid(newRole.getRoleid());
			this.mySysRoleModuleDAO.insert(sto);
		}else {
			this.mySysRoleModuleDAO.insert(sto);
		}
		
		return strRet;
	}


	/**
	 * DWR函数--更新数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String updateDataSysRoleModule(SysRoleModule sto, String resultOfshowModalDialog) throws Exception {
		String strRet="";

		if(sto.getRolename()!=null&&!"".equalsIgnoreCase(sto.getRolename())) {
			SysRoleExample ex=new SysRoleExample();
			ex.createCriteria().andRolenameEqualTo(sto.getRolename().trim()).andRoleidNotEqualTo(sto.getRoleid());
			int count= this.mySysRoleDAO.countByExample(ex);
			if(count>=1) {
				strRet="权限组名称重复!";
				return strRet;
			}
		}
		this.mySysRoleDAO.updateByPrimaryKeySelective(sto);
		
		
		SysRoleModuleExample srmExToDelete = new SysRoleModuleExample();
		srmExToDelete.createCriteria().andRoleidEqualTo(sto.getRoleid());
		this.mySysRoleModuleDAO.deleteByExample(srmExToDelete);
		
		String [] moduleid = StringUtils.split(sto.getCheckids(), ",");
		for(String s:moduleid) {
			SysRoleModule xi = new SysRoleModule();
			xi.setRoleid(sto.getRoleid());
			xi.setRightid(s);
			this.mySysRoleModuleDAO.insertSelective(xi);
		}
		
		
		if (resultOfshowModalDialog.equals("confirm")){		
			SysUnitRoleExample surExToDelete = new SysUnitRoleExample();
			surExToDelete.createCriteria().andRoleIdEqualTo(sto.getRoleid());
			this.mySysUnitRoleDAO.deleteByExample(surExToDelete);
			
			String [] unitId = StringUtils.split(sto.getPostCheckIds(), ",");
			for(String s:unitId) {
				SysUnitRole xi = new SysUnitRole();
				xi.setRoleId(sto.getRoleid());
				xi.setUnitId(s);
				this.mySysUnitRoleDAO.insertSelective(xi);
			}
		
			SysUserRoleExample sUserrExToDelete = new SysUserRoleExample();
			sUserrExToDelete.createCriteria().andRoleIdEqualTo(sto.getRoleid());
			this.mySysUserRoleDAO.deleteByExample(sUserrExToDelete);
			
			String [] userId = StringUtils.split(sto.getUserCheckIds(), ",");
			for(String s:userId) {
				SysUserRole xi = new SysUserRole();
				xi.setRoleId(sto.getRoleid());
				xi.setUserId(s);
				this.mySysUserRoleDAO.insertSelective(xi);
			}
		}
		return strRet;
	}

    public List selectDataSysRoleModule(SysRoleModuleExample example) throws RuntimeException {
		try {
			return mySysRoleModuleDAO.selectByExample(example);
		} catch (RuntimeException e) {
			logger.info("在" + this.getClass().getSimpleName() + "发生数据异常:" + e.getMessage());
			throw new RuntimeException("数据异常:" + e.getMessage());
		}
    }
	
	/**
	 * DWR函数--删除数据
	 * @param sto
	 * @return 错误提示，字串为""表示正确执行
	 * @throws Exception
	 */
	public String deleteDataSysRoleModule(String roleId) throws Exception {
		String strRet="";

			SysRoleExample srEx=new SysRoleExample();
			srEx.createCriteria().andRoleidEqualTo(roleId);
			this.mySysRoleDAO.deleteByExample(srEx);
			
			SysRoleModuleExample srmEx=new SysRoleModuleExample();
			srmEx.createCriteria().andRoleidEqualTo(roleId);
			this.mySysRoleModuleDAO.deleteByExample(srmEx);
			
			SysUnitRoleExample surExample = new SysUnitRoleExample();
			surExample.createCriteria().andRoleIdEqualTo(roleId);
			this.mySysUnitRoleDAO.deleteByExample(surExample);
			
			SysUserRoleExample suserrExample = new SysUserRoleExample();
			suserrExample.createCriteria().andRoleIdEqualTo(roleId);
			this.mySysUserRoleDAO.deleteByExample(suserrExample);


		return strRet;
	}
	
	public String makeModuleTreeXMLWithType(List nodeList, String roleId) {
		StringBuffer sb = new StringBuffer();
		for (Object obj : nodeList) {
			SysModule model = (SysModule) obj;
			String checkValue="";
			if(roleId!="")
			{
				SysRoleModuleExample example=new SysRoleModuleExample();
				example.createCriteria().andRoleidEqualTo(roleId).andRightidEqualTo(model.getModuleId());
				List<SysRoleModule> list=this.selectDataSysRoleModule(example);
				
				SysModuleExample smEx = new SysModuleExample();
				smEx.createCriteria().andParentModuleidEqualTo(model.getModuleId());
				List<SysModule> smList = this.selectByExample(smEx);
				
				if(list.size()>0)
				{
					if(smList.size()==0)
					{
					    checkValue="1";
					}    
				}
			}
			sb.append("<item child=\"" + model.getChildCount() + "\" text=\"" + model.getModuleName() + "\" id=\"" + model.getModuleId()  + "\" checked=\""+checkValue+"\" >");
			List<SysRoleModule> childrenList=null;
			
			SysModuleExample example=new SysModuleExample();
			example.createCriteria().andParentModuleidEqualTo(model.getModuleId());
			example.setOrderByClause(" Sort_Order");
			
			childrenList = this.selectByExample(example);
			if(!childrenList.isEmpty()) {
				sb.append(makeModuleTreeXMLWithType(childrenList, roleId));
			}
			sb.append("</item>");
		}
		return sb.toString();
	}

	//----------------------------    SysRoleModule end ----------------------------  
	//------------------------------------------------------------------------------
	
	//---------------------------------------------------------------------------- 
	//--------------------------------SysUnitRole begin --------------------------
	
    public List selectDataSysUnitRole(SysUnitRoleExample example) throws RuntimeException {
		try {
			return mySysUnitRoleDAO.selectByExample(example);
		} catch (RuntimeException e) {
			logger.info("在" + this.getClass().getSimpleName() + "发生数据异常:" + e.getMessage());
			throw new RuntimeException("数据异常:" + e.getMessage());
		}
    }	
	

	//--------------------------------SysUnitRole end ----------------------------  
	//------------------------------------------------------------------------------	selectDataSysUserRole
    
	//---------------------------------------------------------------------------- 
	//--------------------------------SysUnitRole begin --------------------------
	
    public List selectDataSysUserRole(SysUserRoleExample example) throws RuntimeException {
		try {
			return mySysUserRoleDAO.selectByExample(example);
		} catch (RuntimeException e) {
			logger.info("在" + this.getClass().getSimpleName() + "发生数据异常:" + e.getMessage());
			throw new RuntimeException("数据异常:" + e.getMessage());
		}
    }	
	

	//--------------------------------SysUnitRole end ----------------------------  
	//------------------------------------------------------------------------------    
	
	public String makeUserUnitTreeWithType(List unitNodeList, List userNodeList, String roleId) {
		StringBuffer sb = new StringBuffer();
		
		if (unitNodeList != null){
			for (Object obj : unitNodeList) {
				SysUnit model = (SysUnit) obj;
				String checkValue="";
				if(roleId!="")
				{
					SysUnitRoleExample example=new SysUnitRoleExample();
					example.createCriteria().andRoleIdEqualTo(roleId).andUnitIdEqualTo(model.getUnitId());
					List<SysUnitRole> list=this.selectDataSysUnitRole(example);
					if(list.size()>0)
					{
						checkValue="1";
					}
				}

				sb.append("<item child=\"" + model.getChildCount() + "\" text=\"" + model.getUnitName() + "\" id=\"" + model.getUnitId() + "|" + model.getUnitType() + "\" checked=\""+checkValue+"\"  >");
				List<SysUnitRole> childrenUnitList=null;
				List<SysUserRole> childrenUserList=null;
				
				SysUnitExample unitExample = new SysUnitExample();
				unitExample.createCriteria().andParentUnitidEqualTo(model.getUnitId()).andIsValidEqualTo("Y");
				unitExample.setOrderByClause(" Sort_Order");			
				childrenUnitList = this.selectByExample(unitExample);

				SysUserUnitExample userUnitExample = new SysUserUnitExample();
				userUnitExample.createCriteria().andUnitIdEqualTo(model.getUnitId());
				childrenUserList = this.selectByExample(userUnitExample);
                
				if((!childrenUnitList.isEmpty())||(!childrenUserList.isEmpty())) {                  //如果组织有下属组织或者下属人员时，继续构造树
					sb.append(makeUserUnitTreeWithType(childrenUnitList, childrenUserList, roleId));
				}
				sb.append("</item>");
			}
		}
		if (userNodeList != null){
			for (Object obj : userNodeList) {
				SysUser model = (SysUser) obj;
				String checkValue="";
				if(roleId!="")
				{
					SysUserRoleExample example=new SysUserRoleExample();
					example.createCriteria().andRoleIdEqualTo(roleId).andUserIdEqualTo(model.getUserId());
					List<SysUserRole> list=this.selectDataSysUserRole(example);
					if(list.size()>0)
					{
						checkValue="1";
					}
				}
				sb.append("<item child=\"" + "0" + "\" text=\"" + model.getUserName()+ "\" id=\"" + model.getUserId() + "|" + "user" + "\" checked=\""+checkValue+"\" >");
				sb.append("</item>");
			}
		}
		return sb.toString();
	}
	
}