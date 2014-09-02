/*
 * <p>标题: 综合运营支撑系统支撑系统</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2009</p>
 * <p>公司: free</p>
 * <p>网址：http://www.free.cn/
 */
package com.free.assist.service.iface;

import java.util.List;

import com.free.assist.domain.IfaceDaemonDocument;
import com.free.assist.domain.IfaceLogRepairKey;
import com.free.assist.domain.IfaceLogRepairMixedExample;
import com.free.assist.domain.IfaceLogRepairMixedWithBLOBs;
import com.free.assist.domain.IfaceLogRepairWithBLOBs;
import com.free.assist.domain.IfaceLogRepository;
import com.free.assist.domain.IfaceLogRepositoryExample;
import com.free.assist.domain.IfaceLogRepositoryHis;
import com.free.assist.domain.IfaceLogRepositoryHisKey;
import com.free.assist.domain.IfaceLogRepositoryKey;
import com.free.assist.domain.vo.TraceRecordDTO;
import com.free.assist.service.BaseService;

/**
 * <p>该功能提供日志的功能，public修饰的为外部接口，否则为功能模型包使用。</p>
 * @author 李猛
 * @version 1
 * @date 2009-09-24 10:01:09
 */
public interface IfaceLogFacade extends BaseService {

	public static final String IFACE_LOG_CATEGORY_TRACE = "TRACE";
	
	public static final String IFACE_LOG_CATEGORY_ERROR = "ERROR";
	
	public static final String TRACE_INDICATOR_REQUEST  = "REQUEST";   //日志，请求
	
	public static final String TRACE_INDICATOR_RESPONSE = "RESPONSE";  //日志，返回

	/**
	 * <p>记录正常日志，异常的日志使用error签名。</p>
	 * @author 李猛
	 * @date 2009-09-24 10:06:48
	 * @param applicationId，应用程序标识
	 * @param portName，接口的方法名，如回单
	 * @param billDcument，工单内容
	 * @param noteText，日志信息
	 */
	public TraceRecordDTO trace(TraceRecordDTO traceRecordDTO);
	
	/**
	 * <p>记录异常日志</p>
	 * @author 李猛
	 * @date 2009-09-24 10:14:50
	 * @param applicationId，应用程序标识
	 * @param portName，接口的方法名，如回单
	 * @param billDcument，工单内容
	 * @param errorText，错误信息
	 */
	public TraceRecordDTO error(TraceRecordDTO traceRecordDTO);

	/**
	 * <p>日志查询，该方法应该只供iface包使用，不需要暴露到其他功能模块。</p>
	 * @param example
	 * @return 满足条件的日志列表。
	 */
	//List<IfaceLogRepository> findRepository(IfaceLogRepositoryExample example);
	
	/**
	 * <p>日志检索，返回同一个流程的所有日志，当然使用findRepository(IfaceLogRepositoryMixedExample)签名，
	 * 设定parentId是可以满足的（事实上该接口的代码就是这样实现的），但该接口不宜暴露给其他功能模块。</p>
	 * @param parentId
	 * @return 满足条件的日志列表。
	 */
	public List<IfaceLogRepository> findRepository(String parentId);

	/**
	 * <p>加载日志模型</p>
	 * @param ifaceLogRepositoryKey
	 * @return IfaceLogRepositoryMixedWithBLOBs，日志模型复合对象
	 */
	public IfaceLogRepository getRepository(IfaceLogRepositoryKey ifaceLogRepositoryKey);
	
	/**
	 * <p>加载日志模型</p>
	 * @param ifaceLogRepositoryHisKey
	 * @return IfaceLogRepositoryMixedWithBLOBs，日志模型复合对象
	 */
	public IfaceLogRepositoryHis getRepositoryHis(IfaceLogRepositoryHisKey ifaceLogRepositoryHisKey);

	/**
	 * <p>获取系统失败的日志，实际上是获取工单内容，在IfaceLogRepositoryWithBLOBs#billDocument字段里。</p>
	 * @param maxResults，限制数量，一次取最大的记录数，如果为负数则表示不限制。
	 * @return 满足条件的日志列表。
	 */
	List<IfaceDaemonDocument> getDocumentTaskList(int maxResults);
	
	public void updateDocumentTask(IfaceDaemonDocument ifaceDaemonDocument);

	/**
	 * <p>检索修复工单记录。</p>
	 * @param IfaceLogRepositoryMixedExample
	 * @return
	 */
	public List<IfaceLogRepairMixedWithBLOBs> findRepair(IfaceLogRepairMixedExample example);

	/**
	 * <p>加载修复</p>
	 * @param ifaceLogRepairKey
	 * @return
	 */
	public IfaceLogRepairMixedWithBLOBs getRepair(IfaceLogRepairKey ifaceLogRepairKey);
	/**
	 * <p>工单管理，即记录修复原因，积累错误原因库。</p>
	 * @param ifaceLogRepairKey，日志记录模型主键。
	 */
	public void repair(IfaceLogRepairWithBLOBs ifaceLogRepairWithBLOBs);

}
