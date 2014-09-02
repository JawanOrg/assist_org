package com.free.assist.web.tag;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.free.assist.domain.IfaceConfigDeclare;
import com.free.assist.domain.IfaceConfigDeclareExample;
import com.free.assist.domain.IfaceConfigInstance;
import com.free.assist.domain.IfaceConfigInstanceExample;
import com.free.assist.service.iface.IfaceConfigFacade;

public class IfaceSelectDesc extends TagSupport {
    public String value;
    public String iddValue;
    public String applicationId;
    public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIddValue() {
        return iddValue;
    }

    public void setIddValue(String iddValue) {
        this.iddValue = iddValue;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(pageContext.getServletContext());
        IfaceConfigFacade ifaceConfigFacadeService = (IfaceConfigFacade) context.getBean("ifaceConfigFacade");
        String str = "";
        IfaceConfigInstance ifaceConfigInstance=new IfaceConfigInstance();
        if (iddValue != null && !iddValue.equalsIgnoreCase("")) {
        	IfaceConfigDeclareExample ex=new IfaceConfigDeclareExample();
			ex.createCriteria().andApplicationIdEqualTo(applicationId).andDeclareSnEqualTo(iddValue).andAvailableEqualTo("Y");
			List templist = ifaceConfigFacadeService.selectByExample(ex);
		    if(templist!=null&&templist.size()>0){
		    	IfaceConfigDeclare model=(IfaceConfigDeclare)templist.get(0);
		    	IfaceConfigInstanceExample instanceEx=new IfaceConfigInstanceExample();
		    	instanceEx.createCriteria().andDeclareIdEqualTo(model.getDeclareId()).andInstanceSnEqualTo(value);
		        List list=ifaceConfigFacadeService.selectByExample(instanceEx);
		        if (list!=null&&list.size()>0) {
		        	ifaceConfigInstance=(IfaceConfigInstance)list.get(0);
		        }
		    }
                    try {
                    	out.print(ifaceConfigInstance.getInstanceName());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

        }
        return SKIP_BODY;
    }


}
