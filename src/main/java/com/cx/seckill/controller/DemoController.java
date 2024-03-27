package com.cx.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>项目名称: seckill </p>
 * <p>文件名称: DemoController.java </p>
 * <p>描述: 测试controller </p>
 * <p>创建时间: 2024-03-20 22:15:40 </p>
 * <p>公司信息: 公司 部</p>
 *
 * @author <a href="mailto:cx525606@163.com">辰晓</a>
 * @version v1.0
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","hi,bingo");
        return "hello";
    }


}

