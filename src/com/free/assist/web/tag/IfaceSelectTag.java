package com.free.assist.web.tag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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


public class IfaceSelectTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	public String value;

	public String iddValue;

	public String nullText;

	public Boolean reLoad;

	public String dataType;

	public String msg;

	public String stylename;

	public Boolean hasNull;

	public String onChange;

	public String except;

	public String selectValue;

	public String style;

	public String applicationId;

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getSelectValue() {
		return selectValue;
	}

	public void setSelectValue(String selectValue) {
		this.selectValue = selectValue;
	}

	public String getExcept() {
		return except;
	}

	public String getNullText() {
		return nullText;
	}

	public void setNullText(String nullText) {
		this.nullText = nullText;
	}

	public String getOnChange() {
		return onChange;
	}

	public void setOnChange(String onChange) {
		this.onChange = onChange;
	}

	public Boolean getHasNull() {
		return hasNull;
	}

	public void setHasNull(Boolean hasNull) {
		this.hasNull = hasNull;
	}

	public String getStylename() {
		return stylename;
	}

	public void setStylename(String stylename) {
		this.stylename = stylename;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isReLoad() {
		return reLoad;
	}

	public void setReLoad(boolean reLoad) {
		this.reLoad = reLoad;
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

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(pageContext.getServletContext());
		IfaceConfigFacade ifaceConfigFacadeService = (IfaceConfigFacade) context.getBean("ifaceConfigFacade");
		String str = selectValue == null ? "" : selectValue;

		List<IfaceConfigInstance> list = new ArrayList();
		String select = "";
		if (iddValue != null && !iddValue.equalsIgnoreCase("")) {
			IfaceConfigDeclareExample ex=new IfaceConfigDeclareExample();
			ex.createCriteria().andApplicationIdEqualTo(applicationId).andDeclareSnEqualTo(iddValue).andAvailableEqualTo("Y");
			List templist = ifaceConfigFacadeService.selectByExample(ex);
		    if(templist!=null&&templist.size()>0){
		    	IfaceConfigDeclare model=(IfaceConfigDeclare)templist.get(0);
		    	IfaceConfigInstanceExample instanceEx=new IfaceConfigInstanceExample();
		    	instanceEx.createCriteria().andDeclareIdEqualTo(model.getDeclareId());
		        list=ifaceConfigFacadeService.selectByExample(instanceEx);
		    }
			try {
				dataType = dataType == null ? "" : dataType;
				msg = msg == null ? "" : msg;
				stylename = stylename == null ? "" : stylename;
				nullText = nullText == null ? "" : nullText;
				dataType = dataType == null ? "" : dataType;
				onChange = onChange == null ? "" : onChange;
				out.println("<select  id='" + value + "' name='" + value + "' onChange=\"" + onChange + "\" dataType='" + dataType + "' msg='" + msg + "' class='" + stylename + "' style='" + style + "'> ");
				if (hasNull != null && hasNull) {
					out.println("<option value=''>" + nullText + "</option>");
				}
				if (list != null && list.size() > 0)
					for (IfaceConfigInstance model : list) {
						String[] ev = null;
						boolean b = false;
						if (this.getExcept() != null) {
							ev = org.apache.commons.lang.StringUtils.split(this.getExcept(), ",");
						}
						if (ev != null)
							for (String v : ev) {
								if ((model.getInstanceSn()).equalsIgnoreCase(v)) {
									b = true;
									continue;
								}
							}
						if (!b) {
							select = str.equalsIgnoreCase(model.getInstanceSn()) ? "selected" : "";
							out.println("<option value='" + model.getInstanceSn() + "'" + select + ">");
							out.println(model.getInstanceName());
							out.println("</option>");
						}
					}
				out.println("</select>");
				if (dataType.equalsIgnoreCase("require")) {
					out.print(" <font color='red'>*</font>");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return SKIP_BODY;
	}

	public void setExcept(String except) {
		this.except = except;
	}

}
