package com.cn.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层接口
 * Created by QSJ on 2019/4/28.
 */
@RestController
@RequestMapping(value = "/eurekac")
public class TestController {

  @GetMapping("/getTestInfo")
  public String get() {
    return "试试看可不可以";
  }


}
