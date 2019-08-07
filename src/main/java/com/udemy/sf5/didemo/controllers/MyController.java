package com.udemy.sf5.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by hwells on 2019-08-07
 * Package: com.udemy.sf5.didemo.controllers
 * Description:
 */

@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!!");

        return "foo";
    }
}
