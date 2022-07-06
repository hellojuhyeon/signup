package web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/*")
public class CharacterEncodingFilter extends HttpFilter implements Filter {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public CharacterEncodingFilter() {
			super();
		}

	public void destroy() {

	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
			//전처리	
//		System.out.println("전처리");
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		if(!httpRequest.getMethod().equalsIgnoreCase("get")) {//잇골이그노어케이스-문자대소문자구분안함
			request.setCharacterEncoding("UTF-8");//무조건 UTF=8인코딩이 적용됨
//			System.out.println("인코딩됨!");
		}
		chain.doFilter(request, response);//서블릿
		//후처리
//		System.out.println("후처리");	
	}


	public void init(FilterConfig fConfig) throws ServletException {

	}

}
