package com.app;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet Filter implementation class MyFilters
 */
public class MyFilters extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public MyFilters() {
        super();
       System.out.println("MyFilters");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("Destroy");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("In DoFilter");
		PrintWriter pw = response.getWriter();
		pw.write("Pre-processing ==== Filter Invoke Before <br> ");

		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		pw.write("Post-processing ==== Filter Invoke After <br>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
