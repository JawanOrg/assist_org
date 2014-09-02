/*
 * <p>标题: 协作管理系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.service.supt;

import java.io.ByteArrayInputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.apache.commons.lang.StringUtils;

import com.free.assist.domain.SuptCheckOut;
import com.free.assist.domain.SuptFace;
import com.free.assist.domain.SuptFaceExample;
import com.free.assist.service.BaseService;

/**
 * @author 李猛
 * @version 1
 * @date 2009-11-12 下午05:05:41
 */
public class SuptCheckFaceRO {

	static {
		System.setProperty("javax.xml.parsers.DocumentBuilderFactory", "org.apache.xerces.jaxp.DocumentBuilderFactoryImpl");
		System.setProperty("javax.xml.parsers.SAXParserFactory", "org.apache.xerces.jaxp.SAXParserFactoryImpl");
	}

	public SuptCheckFaceRO() throws Exception {
		
	}
	
	public void interpret(String faceId, String inputXML) throws Exception {
		XMLInputFactory xmlif = XMLInputFactory.newInstance();
		xmlif.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES, Boolean.TRUE);
		xmlif.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, Boolean.FALSE);
        //set the IS_COALESCING property to true , if application desires to
        //get whole text data as one event.            
		xmlif.setProperty(XMLInputFactory.IS_COALESCING, Boolean.FALSE);
		XMLStreamReader streamReader = xmlif.createXMLStreamReader(new ByteArrayInputStream(inputXML.getBytes()));
		String previous = "";
		for(int i=1; streamReader.hasNext();) {
			streamReader.next();
			SuptCheckOut suptCheckOut = new SuptCheckOut();
			suptCheckOut.setCimpFaceId(faceId);
			if (streamReader.isStartElement()) {
				suptCheckOut.setOutNode(streamReader.getName().getLocalPart());
				suptCheckOut.setOutChidnodeOver("N");
	        } else if (streamReader.isEndElement()) {
	        	suptCheckOut.setOutNode(streamReader.getName().getLocalPart());
	        	suptCheckOut.setOutChidnodeOver("Y");
	        }
			//suptCheckOut.setIsValid("Y");
			suptCheckOut.setOrderId((float)i);
			if (StringUtils.isNotBlank(suptCheckOut.getOutNode())) {
				if (!StringUtils.equals(suptCheckOut.getOutNode(), previous)) {
					i++;
					baseService.insert(suptCheckOut);
				}
				previous = suptCheckOut.getOutNode();
			}
		}
	}
	
	public List<SuptFace> getSuptFaceList() {
		SuptFaceExample example = new SuptFaceExample();
		List<SuptFace> result = baseService.selectByExample(example);
		return result;
	}
	
	@Resource private BaseService baseService;
}
