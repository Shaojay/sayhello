package com.example.demo.web;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author keda
 */
@RestController
public class IndexController {

    /**
     * 返回的是字符串，不是页面信息，因为RestController注解
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }

    @GetMapping("/indexPage")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("index");
        //List<ServiceInstance>
        return view;
    }

    @PostMapping(value="/what")
    public Map what(@RequestBody Map map){
        System.out.println(map.get("name"));
        return map;
    }
}
