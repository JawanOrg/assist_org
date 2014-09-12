package com.free.assist.service.sys;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.assist.dao.SysUnitDAO;
import com.free.assist.dao.SysUnitRoleDAO;
import com.free.assist.dao.SysUserDAO;
import com.free.assist.dao.SysUserRoleDAO;
import com.free.assist.dao.SysUserUnitDAO;
import com.free.assist.domain.SysUnit;
import com.free.assist.domain.SysUnitExample;
import com.free.assist.domain.SysUnitRoleExample;
import com.free.assist.domain.SysUser;
import com.free.assist.domain.SysUserExample;
import com.free.assist.domain.SysUserRoleExample;
import com.free.assist.domain.SysUserUnit;
import com.free.assist.domain.SysUserUnitExample;
import com.free.assist.service.BaseServiceImpl;
import com.free.assist.util.MD5;

@Service("sysUnitService")
public class SysUnitServiceImpl extends BaseServiceImpl implements ISysUnitService {

    @Autowired
    private SysUnitDAO mySysUnitDAO;
    @Autowired
    private SysUserDAO mySysUserDAO;
    @Autowired
    private SysUserUnitDAO mySysUserUnitDAO;
    @Autowired
    private SysUserRoleDAO mySysUserRoleDAO;
    @Autowired
    private SysUnitRoleDAO mySysUnitRoleDAO;

    // -------------------------------------------------------------------------
    // ---------------------------- SysUnit begin ----------------------------
    /**
     * DWR函数--新增数据
     * @param sto
     * @return 错误提示，字串为""表示正确执行
     * @throws Exception
     */
    public String addDataSysUnit(SysUnit sto) throws Exception {
        String strRet = "";
        if (sto.getUnitName() != null && !"".equalsIgnoreCase(sto.getUnitName())) {
            SysUnitExample ex = new SysUnitExample();
            ex.createCriteria().andUnitNameEqualTo(sto.getUnitName().trim());
            int count = this.mySysUnitDAO.countByExample(ex);
            if (count >= 1) {
                strRet = "组织名称重复!";
                return strRet;
            }
        }
        this.mySysUnitDAO.insert(sto);
        return strRet;
    }

    /**
     * DWR函数--更新数据
     * @param sto
     * @return 错误提示，字串为""表示正确执行
     * @throws Exception
     */
    public String updateDataSysUnit(SysUnit sto) throws Exception {
        String strRet = "";
        if (sto.getUnitName() != null && !"".equalsIgnoreCase(sto.getUnitName())) {
            SysUnitExample ex = new SysUnitExample();
            ex.createCriteria().andUnitNameEqualTo(sto.getUnitName().trim()).andUnitIdNotEqualTo(sto.getUnitId());
            int count = this.mySysUnitDAO.countByExample(ex);
            if (count >= 1) {
                strRet = "组织名称重复!";
                return strRet;
            }
        }
        this.mySysUnitDAO.updateByPrimaryKeySelective(sto);
        return strRet;
    };

    /**
     * DWR函数--删除数据
     * @param sto
     * @return 错误提示，字串为""表示正确执行
     * @throws Exception
     */
    public String deleteDataSysUnit(String ids) throws Exception {
        String strRet = "";
        String[] id = StringUtils.split(ids, "|");
        for (String s : id) {

            SysUserUnitExample suuExample = new SysUserUnitExample();
            suuExample.createCriteria().andUnitIdEqualTo(s);
            if (this.mySysUserUnitDAO.countByExample(suuExample) > 0) {
                strRet = "请先删除本组织人员";
            } else {
                SysUnitExample heomaEx = new SysUnitExample();
                heomaEx.createCriteria().andUnitIdEqualTo(s);
                this.mySysUnitDAO.deleteByExample(heomaEx);

                SysUnitRoleExample surExample = new SysUnitRoleExample();
                surExample.createCriteria().andUnitIdEqualTo(s);
                if (this.mySysUnitRoleDAO.countByExample(surExample) > 0) {
                    this.mySysUnitRoleDAO.deleteByExample(surExample);
                    strRet = "相关权限组信息已被同时删除";
                }
            }
        }
        return strRet;
    }

    // ---------------------------- SysUnit end ----------------------------
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // ---------------------------- SysUser begin ----------------------------
    /**
     * DWR函数--新增数据
     * @param sto
     * @return 错误提示，字串为""表示正确执行
     * @throws Exception
     */
    public String addDataSysUser(SysUser sto) throws Exception {
        String strRet = "";
        if (sto.getUserName() != null && !"".equalsIgnoreCase(sto.getUserName())) {
            SysUserExample ex = new SysUserExample();
            ex.createCriteria().andUserNameEqualTo(sto.getUserName().trim());
            int count = this.mySysUserDAO.countByExample(ex);
            if (count >= 1) {
                strRet = "用户名称重复!";
                return strRet;
            }
        }
        sto.setLoginPassword(MD5.encode(sto.getLoginPassword()));
        this.mySysUserDAO.insert(sto);
        return strRet;
    }

    /**
     * DWR函数--更新数据
     * @param sto
     * @return 错误提示，字串为""表示正确执行
     * @throws Exception
     */
    public String updateDataSysUser(SysUser sto) throws Exception {
        String strRet = "";
        if (sto.getUserName() != null && !"".equalsIgnoreCase(sto.getUserName())) {
            SysUserExample ex = new SysUserExample();
            ex.createCriteria().andUserNameEqualTo(sto.getUserName().trim()).andUserIdNotEqualTo(sto.getUserId());
            int count = this.mySysUserDAO.countByExample(ex);
            if (count >= 1) {
                strRet = "用户名称重复!";
                return strRet;
            }
        }
        sto.setLoginPassword(MD5.encode(sto.getLoginPassword()));
        this.mySysUserDAO.updateByPrimaryKeySelective(sto);
        return strRet;
    };

    /**
     * DWR函数--删除数据
     * @param sto
     * @return 错误提示，字串为""表示正确执行
     * @throws Exception
     */
    public String deleteDataSysUser(String ids) throws Exception {
        String strRet = "";
        String[] id = StringUtils.split(ids, "|");
        for (String s : id) {
            SysUserExample heomaEx = new SysUserExample();
            heomaEx.createCriteria().andUserIdEqualTo(s);
            this.mySysUserDAO.deleteByExample(heomaEx);
        }
        return strRet;
    }

    // ---------------------------- SysUser end ----------------------------
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // ---------------------------- SysUserUnit begin ----------------------------
    /**
     * DWR函数--新增数据
     * @param sto
     * @return 错误提示，字串为""表示正确执行
     * @throws Exception
     */
    public String addDataSysUserUnit(SysUserUnit sto) throws Exception {
        String strRet = "";
        if (sto.getUserId() == null || sto.getUserId().equals("")) {
            SysUserExample ex = new SysUserExample();
            ex.createCriteria().andLoginNameEqualTo(sto.getLoginName().trim());
            int count = this.mySysUserDAO.countByExample(ex);
            if (count >= 1) {
                strRet = "登陆账号重复!";
                return strRet;
            }
            SysUser newUser = (SysUser) sto;
            sto.setLoginPassword(MD5.encode(sto.getLoginPassword()));
            this.mySysUserDAO.insert(newUser);
            sto.setUserId(newUser.getUserId());
            this.mySysUserUnitDAO.insert(sto);
        } else {
            this.mySysUserUnitDAO.insert(sto);
        }

        return strRet;
    }

    /**
     * DWR函数--更新数据
     * @param sto
     * @return 错误提示，字串为""表示正确执行
     * @throws Exception
     */
    public String updateDataSysUserUnit(SysUserUnit sto) throws Exception {
        String strRet = "";

        this.mySysUserUnitDAO.updateByPrimaryKeySelective(sto);
        return strRet;
    };

    /**
     * DWR函数--删除数据
     * @param sto
     * @return 错误提示，字串为""表示正确执行
     * @throws Exception
     */
    public String deleteDataSysUserUnit(String unitId, String ids) throws Exception {
        String strRet = "";
        String[] id = StringUtils.split(ids, "|");
        int deleteRoleInfo = 0;
        for (String s : id) {

            SysUserExample suEx = new SysUserExample();
            suEx.createCriteria().andUserIdEqualTo(s);
            this.mySysUserDAO.deleteByExample(suEx);

            SysUserUnitExample heomaEx = new SysUserUnitExample();
            heomaEx.createCriteria().andUnitIdEqualTo(unitId).andUserIdEqualTo(s);
            this.mySysUserUnitDAO.deleteByExample(heomaEx);

            SysUserRoleExample surEx = new SysUserRoleExample();
            surEx.createCriteria().andUserIdEqualTo(s);
            if (this.mySysUserRoleDAO.countByExample(surEx) > 0) {
                this.mySysUserRoleDAO.deleteByExample(surEx);
                deleteRoleInfo = 1;
            }
        }
        if (deleteRoleInfo == 1) {
            strRet = "相关权限组信息已被同时删除";
        }
        return strRet;
    }

}
