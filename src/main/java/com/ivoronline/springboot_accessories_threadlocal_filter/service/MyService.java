package com.ivoronline.springboot_accessories_threadlocal_filter.service;

import com.ivoronline.springboot_accessories_threadlocal_filter.context.UserContext;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  //=========================================================================================================
  // WITH THREAD LOCAL
  //=========================================================================================================
  public String withThreadLocal() { // No Input Parameter Needed
    String user = UserContext.getUser();
    return "Hello " + user;
  }

  //=========================================================================================================
  // WITHOUT THREAD LOCAL
  //=========================================================================================================
  public String withoutThreadLocal(String user) {
    return "Hello " + user;
  }
  
}
