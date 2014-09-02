/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.dao;

import com.free.assist.domain.SysUserRole;
import com.free.assist.domain.SysUserRoleExample;
import com.free.assist.domain.SysUserRoleKey;

/**
 * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href="http://ibatis.apache.org">Ibator Documentation</a>。<p>
 * <p>SQL映射文件路径为：com.regaltec.blocimp.dao.xml.T_SYS_USER_ROLE_SqlMap.xml。</p>
 * @see：com.regaltec.blocimp.domain.SysUserRoleKey
 * @see：com.regaltec.blocimp.domain.SysUserRoleExample
 * @autor ibator
 * @version 1.2.1
 * @date 2009-09-27 14:10:08 
 */
public class SysUserRoleDAOImpl extends SpringBaseDAO<SysUserRoleKey, SysUserRole, SysUserRoleExample> implements SysUserRoleDAO {

    public SysUserRoleDAOImpl() {
        super();
    }

    public int updateByExampleSelective(SysUserRole record, SysUserRoleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysUserRole.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysUserRole record, SysUserRoleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysUserRole.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends SysUserRoleExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysUserRoleExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}