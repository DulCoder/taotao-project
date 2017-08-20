package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhengxianyou on 2017/8/19 0019.
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    /**
     * 展示其他页面
     * <p>Title: showpage</p>
     * <p>Description: </p>
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showpage(@PathVariable String page) {
        return page;
    }

}
