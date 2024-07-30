package com.ivoronline.springboot_accessories_threadlocal_filter.filter;

import com.ivoronline.springboot_accessories_threadlocal_filter.context.UserContext;
import jakarta.servlet.*;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class MyFilter implements Filter {

  //=========================================================================================================
  // DO FILTER
  //=========================================================================================================
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    try {
      String user = request.getParameter("user");
      UserContext.setUser(user);
      chain.doFilter(request, response);
    } finally {
      UserContext.clear();
      System.out.println("UserContext.clear()");
    }
  }
  
  @Override
  public void init(FilterConfig filterConfig) throws ServletException { }
  
  @Override
  public void destroy() { }
  
}