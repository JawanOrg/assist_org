package com.free.assist.web.tag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.free.assist.domain.SysDicConfig;
import com.free.assist.domain.SysDicConfigExample;
import com.free.assist.domain.SysDicItem;
import com.free.assist.domain.SysDicItemExample;
import com.free.assist.service.sys.ISysDicService;

public class SysDicDis extends TagSupport {

    private static final long serialVersionUID = 8905101188139458512L;

    private String value;

    private String iddValue;

    private Boolean hasNull;

    private String stylename;

    private String except;

    private String dicItemIn;

    private String onClick;

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

    public String getExcept() {
        return except;
    }

    public void setExcept(String except) {
        this.except = except;
    }

    public String getDicItemIn() {
        return dicItemIn;
    }

    public void setDicItemIn(String dicItemIn) {
        this.dicItemIn = dicItemIn;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        ApplicationContext context =
                WebApplicationContextUtils.getWebApplicationContext(pageContext.getServletContext());
        ISysDicService sysDicService = (ISysDicService) context.getBean("sysDicService");

        String select = "";
        dicItemIn = dicItemIn == null ? "" : dicItemIn;
        if (iddValue != null && !iddValue.equalsIgnoreCase("")) {
            List<SysDicConfig> list = new ArrayList<SysDicConfig>();
            List<SysDicItem> itemList = new ArrayList<SysDicItem>();
            SysDicItemExample example = new SysDicItemExample();
            SysDicConfigExample example1 = new SysDicConfigExample();
            example1.createCriteria().andDictionaryCodeEqualTo(iddValue).andIsValidEqualTo("Y");
            list = sysDicService.selectByExample(example1);
            try {
                stylename = stylename == null ? "" : stylename;
                onClick = onClick == null ? "" : onClick;
                out.println("<select id='" + value + "' name='" + value + "' class='" + stylename + "' onClick='"
                        + onClick + "'> ");
                if (hasNull != null && hasNull) {
                    out.println("<option value=''>" + " " + "</option>");
                }
                if (list != null && list.size() > 0) {
                    for (SysDicConfig model : list) {
                        String[] ev = null;
                        boolean b = false;
                        if (this.getExcept() != null) {
                            ev = org.apache.commons.lang.StringUtils.split(this.getExcept(), ",");
                        }
                        if (ev != null)
                            for (String v : ev) {
                                if ((model.getDictionaryCode()).equalsIgnoreCase(v)) {
                                    b = true;
                                    continue;
                                }
                            }
                        if (!b) {
                            example.createCriteria().andDictionaryIdEqualTo(model.getDictionaryId());
                            itemList = sysDicService.selectByExample(example);
                            if (itemList != null && itemList.size() > 0) {
                                for (SysDicItem sdi : itemList) {
                                    select = dicItemIn.equalsIgnoreCase(sdi.getItemCode()) ? "selected" : "";
                                    out.println("<option value='" + sdi.getItemCode() + "'" + select + ">");
                                    out.println(sdi.getItemValue());
                                    out.println("</option>");
                                }
                            }
                        }
                    }
                }
                out.println("</select>");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return SKIP_BODY;
    }

    public String getOnClick() {
        return onClick;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }

}
