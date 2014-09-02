package com.free.assist.web.tag;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.free.assist.domain.SysUser;
import com.free.assist.domain.SysUserExample;
import com.free.assist.service.sys.ISysLoginService;

public class SysOrganization extends TagSupport {
    private static final long serialVersionUID = 1695016026335692575L;
    private String objectId;
    private String objectType;

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        ApplicationContext context =
                WebApplicationContextUtils.getWebApplicationContext(pageContext.getServletContext());
        ISysLoginService sysLoginService = (ISysLoginService) context.getBean("sysLoginService");

        if (objectId != null && !objectId.equalsIgnoreCase("")) {
            try {
                SysUserExample ex = new SysUserExample();
                ex.createCriteria().andUserIdEqualTo(objectId);
                List list = sysLoginService.selectByExample(ex);
                if (list != null && list.size() != 0) {
                    SysUser user = (SysUser) list.get(0);
                    out.println(user.getUserName());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return SKIP_BODY;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }
}
