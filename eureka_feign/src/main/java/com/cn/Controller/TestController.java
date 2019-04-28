package com.cn.Controller;

import com.cn.dao.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层
 * Created by QSJ on 2019/4/28.
 */
@RestController
@RequestMapping(value = "/eurekaf")
public class TestController {

  @Autowired
  private TestInterface testInterface;

  @GetMapping(value = "/getByFeign")
  public String get() {
    return testInterface.getTestInfo();
  }

}
