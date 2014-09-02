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

public class SysDicDisName extends TagSupport {


	private String dictionaryCodeIn;

    private String itemCodeIn;

	public String getDictionaryCodeIn() {
		return dictionaryCodeIn;
	}

	public void setDictionaryCodeIn(String dictionaryCodeIn) {
		this.dictionaryCodeIn = dictionaryCodeIn;
	}

	public String getItemCodeIn() {
		return itemCodeIn;
	}

	public void setItemCodeIn(String itemCodeIn) {
		this.itemCodeIn = itemCodeIn;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(pageContext.getServletContext());
		ISysDicService sysDicService = (ISysDicService) context.getBean("sysDicService");
		
		dictionaryCodeIn = dictionaryCodeIn == null ? "" : dictionaryCodeIn;
		itemCodeIn = itemCodeIn == null ? "" : itemCodeIn;
		if (dictionaryCodeIn != null && !dictionaryCodeIn.equalsIgnoreCase("") && 
				itemCodeIn != null && !itemCodeIn.equalsIgnoreCase("")) {
			try {
				List<SysDicItem> list = new ArrayList<SysDicItem>();
				List<SysDicConfig> configList = new ArrayList<SysDicConfig>();
				SysDicConfigExample example1 = new SysDicConfigExample();
				example1.createCriteria().andDictionaryCodeEqualTo(dictionaryCodeIn).andIsValidEqualTo("Y");
				configList = sysDicService.selectByExample(example1);
				SysDicItemExample example2 = new SysDicItemExample();
				if(configList!=null && configList.size()>0) {
					for(SysDicConfig sdc : configList) {
						example2.createCriteria().andDictionaryIdEqualTo(sdc.getDictionaryId().trim());
						list = sysDicService.selectByExample(example2);
						if(list!=null && list.size()>0) {
							for(SysDicItem sdi : list) {
								if(sdi.getItemCode().equals(itemCodeIn)) {
									out.println(sdi.getItemValue());
									break;
								}
							}
						}
					}
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		} 
		return SKIP_BODY;
	}

}