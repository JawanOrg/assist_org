package com.free.struts;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>权限、字符集的控制</p>
 * @author 李猛
 * @date 2009-07-15 10:02:26
 */
public class StrutsInterceptor implements Filter {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private String encoding;

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	public void destroy() {
		this.encoding = null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		if (!(servletRequest instanceof HttpServletRequest) || !(servletResponse instanceof HttpServletResponse)) {
			throw new IllegalStateException("请求及响应无效，请检查HttpServlet是否为有效的HTTP通信协议。");
		}
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		if (encoding != null) {
				if (logger.isDebugEnabled()) {
					logger.debug("ServletRequest被过滤器{}设置了{}字符集。", this.getClass().getSimpleName(), this.encoding);
				}
				String className = servletRequest.getClass().getName();
				if ("GET".equalsIgnoreCase(request.getMethod()) && "org.apache.catalina.connector.RequestFacade".equals(className)) {
					request = new CoyoteRequestDecorate(request, encoding);
				} else {
					servletRequest.setCharacterEncoding(encoding);
				}
		}
		filterChain.doFilter(request, response);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	public void init(FilterConfig filterConfig) throws ServletException {
		encoding = filterConfig.getInitParameter("encoding");
	}
	
	class CoyoteRequestDecorate extends HttpServletRequestWrapper {

		private String encoding;

		public CoyoteRequestDecorate(HttpServletRequest request, String encoding) {
			super(request);
			this.encoding = encoding;
		}

		@Override
		public String getParameter(String name) {
			String parameter = super.getParameter(name);
			return decode(parameter);
		}
		
		@Override
		public String[] getParameterValues(String name) {
			String[] resultParameter = super.getParameterValues(name);
			if (resultParameter.length == 0) {
				return null;
			}
			String[] returnParameter = new String[resultParameter.length];
			for (int i=0; i<resultParameter.length; i++) {
				returnParameter[i] = decode(resultParameter[i]);
			}
			return returnParameter;
		}

		private String decode(String parameter) {
			if (parameter == null) {
				return null;
			}
			try {
				byte[] bytes = parameter.getBytes("ISO8859-1");
				return new String(bytes, this.encoding);
			} catch (Exception e) {
				return parameter;
			}
		}
	}
}
