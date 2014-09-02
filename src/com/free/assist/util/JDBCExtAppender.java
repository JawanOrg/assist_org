package com.free.assist.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.jdbc.JDBCAppender;
import org.apache.log4j.spi.ErrorCode;
import org.apache.log4j.spi.LoggingEvent;

/**
 * 
 * 项目:cursaero 文件:com.cursaero.core.utils.JDBCExtAppender.java
 * 重写log4j的JDBCAppender
 * @author 黄良照
 * @date 2007 2007-11-8 
 * @版权信息 驰天网络科技
 */
public class JDBCExtAppender extends JDBCAppender {

	public JDBCExtAppender() {
		super();
		buffer = new ArrayList(bufferSize);
		removes = new ArrayList(bufferSize);
	}

	/**
	 * Adds the event to the buffer.  When full the buffer is flushed.
	 */
	public void append(LoggingEvent event) {
		buffer.add(event);
		
		if (buffer.size() >= bufferSize)
			flushBuffer();
	}

	/**
	 * loops through the buffer of LoggingEvents, gets a
	 * sql string from getLogStatement() and sends it to execute().
	 * Errors are sent to the errorHandler.
	 *
	 * If a statement fails the LoggingEvent stays in the buffer!
	 */
	public void flushBuffer() {
		//Do the actual logging
		removes.ensureCapacity(buffer.size());
		for (Iterator i = buffer.iterator(); i.hasNext();) {
			try {
				LoggingEvent logEvent = (LoggingEvent)i.next();
				String sql = getLogStatement(logEvent);
				//System.out.println(sql);
				execute(sql);
				removes.add(logEvent);
			}
			catch (SQLException e) {
				errorHandler.error("Failed to excute sql", e,
						ErrorCode.FLUSH_FAILURE);
			}
		}
    
		// remove from the buffer any events that were reported
		buffer.removeAll(removes);
    
		// clear the buffer of reported events
		removes.clear();
	}
	protected String getLogStatement(LoggingEvent event) {
		return getLayout().format(event);
	}
		
}

