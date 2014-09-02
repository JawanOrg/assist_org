package com.free.assist.web.tag;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.free.assist.domain.SuptFace;
import com.free.assist.domain.SuptFaceExample;
import com.free.assist.service.supt.ICheckFaceService;

public class ShowMethod extends TagSupport {


    private String methodId;

    

    public String getMethodId() {
		return methodId;
	}



	public void setMethodId(String methodId) {
		this.methodId = methodId;
	}



	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(pageContext.getServletContext());
		ICheckFaceService checkFaceService = (ICheckFaceService) context.getBean("checkFaceService");
		
		if (methodId != null && !methodId.equalsIgnoreCase("")) {
			SuptFaceExample example = new SuptFaceExample();
			example.createCriteria().andMethodNameEqualTo(methodId);
			List<SuptFace>list = checkFaceService.selectByExample(example);
			try {
				if(list!=null && list.size()>0){
					out.println(list.get(0).getCimpName());
				}				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return SKIP_BODY;
	}


}