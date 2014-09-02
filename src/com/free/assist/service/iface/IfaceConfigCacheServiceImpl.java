package com.free.assist.service.iface;

import java.io.CharArrayReader;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.assist.dao.IfaceConfCacheDAO;
import com.free.assist.dao.IfaceConfigInstanceDAO;
import com.free.assist.domain.IfaceConfCache;
import com.free.assist.domain.IfaceConfCacheExample;
import com.free.assist.domain.IfaceConfigInstance;
import com.free.assist.domain.IfaceConfigInstanceKey;
import com.free.assist.service.BaseServiceImpl;

@Service("externalIfaceConfigService")
public class IfaceConfigCacheServiceImpl extends BaseServiceImpl implements IfaceConfigCacheService {
	
	private IfaceConfCacheDAO ifaceConfCacheDAO;
	
	private IfaceConfigInstanceDAO ifaceConfigInstanceDAO;
	
	@Autowired
	public void setIfaceConfCacheDAO(IfaceConfCacheDAO ifaceConfCacheDAO) {
		this.ifaceConfCacheDAO = ifaceConfCacheDAO;
	}
	
	@Autowired
	public void setIfaceConfigInstanceDAO(IfaceConfigInstanceDAO ifaceConfigInstanceDAO) {
		this.ifaceConfigInstanceDAO = ifaceConfigInstanceDAO;
	}
	
	public List selectByExample(IfaceConfCacheExample example) {
		return this.ifaceConfCacheDAO.selectByExample(example);
	}
	
	/* EXAMPLE:
	<?xml version="1.0" encoding="GB2312"?>
	<ROOT>
		<DATA>
			<RESPONSEDATA>
				<RESPONSE_CODE>0</RESPONSE_CODE>
				<RESPONSE_INFO></RESPONSE_INFO>
			</RESPONSEDATA>
			<LOOP_DATA>
				<SYS_CODE>FAULT_POSITION_TYPE_ID</SYS_CODE>
				<SYS_CODENAME>业务类型与故障部位关系表</SYS_CODENAME>
				<ITEM_ID>391</ITEM_ID>
				<ITEM_NAME>工单编号2</ITEM_NAME>
				<PARENT_ITEM_ID>102008</PARENT_ITEM_ID>
				<CHANGETYPE>DELETE</CHANGETYPE>
				<SERIAL_NUMBER>2</SERIAL_NUMBER>
			</LOOP_DATA>
			<LOOP_DATA>
				<SYS_CODE>FAULT_POSITION_TYPE_ID</SYS_CODE>
				<SYS_CODENAME>业务类型与故障部位关系表</SYS_CODENAME>
				<ITEM_ID>488</ITEM_ID>
				<ITEM_NAME>名称</ITEM_NAME>
				<PARENT_ITEM_ID>102008</PARENT_ITEM_ID>
				<CHANGETYPE>INSERT</CHANGETYPE>
				<SERIAL_NUMBER>2</SERIAL_NUMBER>
			</LOOP_DATA>
		</DATA>
	</ROOT>*/
	public void paserXML(String xmlStr) {
		try {
			SAXReader saxReader = new SAXReader();
			Document document = saxReader.read(new CharArrayReader(xmlStr.toCharArray()));
			Node responseCodeNode = document.selectSingleNode("/ROOT/DATA/RESPONSEDATA/RESPONSE_CODE");
			//1.1返回数据正常的情况--有N条记录
			if(responseCodeNode.getText().equals("0")) {
				List loopData = document.selectNodes("/ROOT/DATA/LOOP_DATA");
				Iterator iter = loopData.iterator();
				while(iter.hasNext()) {
					IfaceConfCache wxtogpeoms = new IfaceConfCache();
					wxtogpeoms.setResponseCode(responseCodeNode.getText().trim());
					Element element = (Element)iter.next();
					//静态数据ID--只有一条记录
					List list = element.selectNodes("SYS_CODE");
					if(list!=null && list.size()==1) {
						Node sysCodeNode = (Node)list.get(0);
						if(sysCodeNode!=null && !"".equals(sysCodeNode.getText())) {
							wxtogpeoms.setSysCode(sysCodeNode.getText().trim());
						}
					}
					//静态数据编码名称--只有一条记录
					list.clear();
					list = element.selectNodes("SYS_CODENAME");
					if(list!=null && list.size()==1) {
						Node sysCodeNameNode = (Node)list.get(0);
						if(sysCodeNameNode!=null && !"".equals(sysCodeNameNode.getText())) {
							wxtogpeoms.setSysCodename(sysCodeNameNode.getText().trim());
						}
					}
					//实例ID--只有一条记录
					list.clear();
					list = element.selectNodes("ITEM_ID");
					if(list!=null && list.size()==1) {
						Node itemIdNode = (Node)list.get(0);
						if(itemIdNode!=null && !"".equals(itemIdNode.getText())) {
							wxtogpeoms.setItemId(itemIdNode.getText().trim());
						}
					}
					//实例名称--只有一条记录
					list.clear();
					list = element.selectNodes("ITEM_NAME");
					if(list!=null && list.size()==1) {
						Node itemNameNode = (Node)list.get(0);
						if(itemNameNode!=null && !"".equals(itemNameNode.getText())) {
							wxtogpeoms.setItemName(itemNameNode.getText().trim());
						}
					}
					//实例父类ID--只有一条记录
					list.clear();
					list = element.selectNodes("PARENT_ITEM_ID");
					if(list!=null && list.size()==1) {
						Node parentItemIdNode = (Node)list.get(0);
						if(parentItemIdNode!=null && !"".equals(parentItemIdNode.getText())) {
							wxtogpeoms.setParentItemId(parentItemIdNode.getText().trim());
						}
					}
					//操作类型--只有一条记录
					list.clear();
					list = element.selectNodes("CHANGETYPE");
					if(list!=null && list.size()==1) {
						Node changeTypeNode = (Node)list.get(0);
						if(changeTypeNode!=null && !"".equals(changeTypeNode.getText())) {
							wxtogpeoms.setChangetype(changeTypeNode.getText().trim());
						}
					}
					//系列码--只有一条记录
					list.clear();
					list = element.selectNodes("SERIAL_NUMBER");
					if(list!=null && list.size()==1) {
						Node serialNumberNode = (Node)list.get(0);
						if(serialNumberNode!=null && !"".equals(serialNumberNode.getText())) {
							wxtogpeoms.setSerialNumber(serialNumberNode.getText().trim());
						}
					}
					wxtogpeoms.setIsAvailable("Y");
					ifaceConfCacheDAO.insertSelective(wxtogpeoms);
				}
			} 
			//1.2返回数据异常的情况--只有一条记录
			else {
				IfaceConfCache wxtogpeoms = new IfaceConfCache();
				Node responseInfoNode = document.selectSingleNode("/ROOT/DATA/RESPONSEDATA/RESPONSE_INFO");
				if(!"".equals(responseInfoNode.getText())){
					wxtogpeoms.setResponseCode(responseCodeNode.getText().trim());
					wxtogpeoms.setResponseInfo(responseInfoNode.getText().trim());
				}
				//ifaceConfCacheDAO.insertSelective(wxtogpeoms);
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void insertIfaceConfigInstanceBySelective(IfaceConfigInstance ifaceConfigInstance) {
		ifaceConfigInstanceDAO.insertSelective(ifaceConfigInstance);
	}
	
	public int deleteIfaceConfigInstance(IfaceConfigInstanceKey key) {
		return ifaceConfigInstanceDAO.deleteByPrimaryKey(key);
	}

}
