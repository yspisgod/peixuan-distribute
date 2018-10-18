package com.px.controller;



import com.px.admin.api.TestAdminService;
import com.px.person.api.TestService;
import com.px.train.api.TestTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
   @Autowired
   TestService testService;

   @Autowired
    TestTrainService testTrainService;

   @Autowired
    TestAdminService testAdminService;


    @RequestMapping("/test")
    public @ResponseBody
    String test(){
        return testService.sayHello();
    }

    @RequestMapping("/testtrain")
    public @ResponseBody
    String testtrain(){
        return testTrainService.train();
    }

    @RequestMapping("/testadmin")
    public @ResponseBody
    String testadmin(){
        return testAdminService.admin();
    }
}
