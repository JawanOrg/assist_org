package com.free.assist.service.supt;

import java.lang.reflect.Field;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.assist.dao.SuptQueryItemValueDAO;
import com.free.assist.domain.SuptQueryItemValue;
import com.free.assist.domain.SuptQueryItemValueExample;
import com.free.assist.domain.SuptQueryItemValueExample.Criteria;
import com.free.assist.service.BaseServiceImpl;
import com.free.assist.util.BeanUtils;
import com.free.assist.util.ObjectUtil;

@Service("suptQueryItemValueService")
public class SuptQueryItemValueServiceImpl extends BaseServiceImpl implements ISuptQueryItemValueService {
	 
	@Autowired private SuptQueryItemValueDAO suptQueryItemValueDAO;

	public void setFormQueryItemValue(String userId,String moduleCode,Object form,Class fieldsObjClass) throws Exception
	{
		//delete all item value
		SuptQueryItemValueExample example=new SuptQueryItemValueExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andModuleCodeEqualTo(moduleCode);
		this.suptQueryItemValueDAO.deleteByExample(example);
		
		Field[] fields = ObjectUtil.getAllFields(fieldsObjClass);
		for (Object obj : fields) {
			Field field = (Field) obj;
			String fieldName = field.getName();
			Object valueOfFieldObject;
			String fieldValue="";
			try {
				valueOfFieldObject = "".equalsIgnoreCase((String) BeanUtils.forceGetProperty(form, fieldName )) ? null : BeanUtils.forceGetProperty(form, fieldName );
				if (valueOfFieldObject != null) { 
					fieldValue=(String) valueOfFieldObject;
				}
			} catch (Exception e) {
				continue;
			}
			if (fieldValue.length()>0&&fieldName.length()>0
					&&!fieldName.equals("method")
					&&!fieldName.equals("labletext")
					&&!fieldName.equals("lineName")
					&&!fieldName.equals("maxResults")
					&&!fieldName.equals("pageNumber")
					&&!fieldName.equals("orderByClause")
					&&!fieldName.equals("sortMehtod")	) {
				SuptQueryItemValue recordData=new SuptQueryItemValue();
				recordData.setUserId(userId);
				recordData.setModuleCode(moduleCode);
				recordData.setItemCode(fieldName);
				recordData.setItemValue(fieldValue);
				this.suptQueryItemValueDAO.insert(recordData);
			}
		}
	};
	
	public void getFormQueryItemValue(String userId,String moduleCode,Object form) throws Exception, NoSuchFieldException
	{
		SuptQueryItemValueExample example=new SuptQueryItemValueExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andModuleCodeEqualTo(moduleCode);
		criteria.andItemValueIsNotNull();
		List <SuptQueryItemValue>  list=(List <SuptQueryItemValue>) this.suptQueryItemValueDAO.selectByExample(example);
		for (int i=0;i<list.size();i++) {
			SuptQueryItemValue sqiv=list.get(i);
			try {
				BeanUtils.forceSetProperty(form, sqiv.getItemCode(),sqiv.getItemValue());
			} catch (NoSuchFieldException e) {
				//跳过
			}
		}
	};
}
