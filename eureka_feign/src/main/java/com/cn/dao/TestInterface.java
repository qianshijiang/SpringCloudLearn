package com.cn.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by QSJ on 2019/4/28.
 */
@FeignClient(name= "eureka-client")
public interface TestInterface {

  @GetMapping(value = "/eurekac/getTestInfo")
  String getTestInfo();

}
