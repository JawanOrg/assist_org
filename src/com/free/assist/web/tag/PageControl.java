/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.web.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.free.assist.util.Pager;

/**
 * @author 李猛
 * @version 1
 * @date 2009-10-09 10:13:14
 */
public class PageControl extends SimpleTagSupport {

    public PageControl() {
        super();
        this.declareName = "pageList";
    }

    @Override
    public void doTag() throws JspException, IOException {
        try {
            Object pageObject = getJspContext().getAttribute(declareName, PageContext.REQUEST_SCOPE);
            if (pageObject instanceof Pager) {
                Pager<?> pageList = (Pager<?>) pageObject;
                StringBuilder sb = new StringBuilder();
                if (pageList.isNotEmpty()) {
                    sb.append("<form action=\"\" style=\"padding: 0; margin:0;\"><font style='font-weight:bold;font-size:14px;face:Arial'>");
                    if (pageList.isFirstPage()) {
                        sb.append("<a>首页</a>");
                    } else {
                        sb.append(String.format("<a href=\"#\" onclick=\"jumpTo('%s', 1)\">首页</a>", formId));
                    }
                    sb.append("\n");
                    if (pageList.hasPreviousPage()) {
                        sb.append(String.format("<a href=\"#\" onclick=\"jumpTo('%s', %s)\">上页</a>", formId,
                                pageList.getPageNumber() - 1));
                    } else {
                        sb.append("<a>上页</a>");
                    }
                    sb.append("\n");
                    if (pageList.hasNextPage()) {
                        sb.append(String.format("<a href=\"#\" onclick=\"jumpTo('%s', %s)\">下页</a>", formId,
                                pageList.getPageNumber() + 1));
                    } else {
                        sb.append("<a>下页</a>");
                    }
                    sb.append("\n");
                    if (pageList.isLastPage()) {
                        sb.append("末页");
                    } else {
                        sb.append(String.format("<a href=\"#\" onclick=\"jumpTo('%s', %s)\">末页</a>", formId,
                                pageList.getTotalPages()));
                    }
                    sb.append("\n");
                    sb.append(String.format("第%s/%s页&nbsp;共%s条&nbsp;每页%s条", pageList.getPageNumber(),
                            pageList.getTotalPages(), pageList.getTotalRecords(), pageList.getMaxResults()));
                    sb.append(String.format(
                            "&nbsp;<select onchange=\"jumpTo('%s', this.options[this.selectedIndex].value)\">", formId));

                    for (int i = 1; i <= pageList.getTotalPages(); i++) {
                        String selected = "";
                        if (pageList.getPageNumber() == i) {
                            selected = "selected=\"selected\"";
                        }
                        sb.append(String.format("<option value=\"%s\"%s>%s</option>\n", i, selected, i));
                    }
                    sb.append("</select>\n");
                    sb.append("</font></form>\n");
                    sb.append("\n<script type=\"text/javascript\" defer=\"defer\">");
                    sb.append("\nfunction jumpTo(formId, pageNo) {");
                    sb.append("\n\tvar formEl = document.getElementById(formId);");
                    sb.append("\n\tif (!formEl) {");
                    sb.append("\n\t\talert(\"不存在\" + formId + \"表单\");");
                    sb.append("\n\t\treturn;");
                    sb.append("\n\t}");
                    sb.append("\n\tformEl[\"skipResults\"].value = (pageNo - 1) * formEl[\"maxResults\"].value;");
                    if (StringUtils.isBlank(jsFunction)) {
                        sb.append("\n\tformEl.submit();");
                    } else {
                        sb.append("\n\t").append(jsFunction).append("();");
                    }
                    sb.append("\n}");
                    sb.append("\n</script>");
                } else {
                    sb.append("N/A");
                }
                JspWriter out = getJspContext().getOut();
                out.println(sb.toString());
            } else {
                logger.error("request里没有Pager实例，请检查变量{}。", declareName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDeclareName(String declareName) {
        this.declareName = declareName;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public void setJsFunction(String jsFunction) {
        this.jsFunction = jsFunction;
    }

    private String declareName;

    private String formId;

    private String jsFunction;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
}
