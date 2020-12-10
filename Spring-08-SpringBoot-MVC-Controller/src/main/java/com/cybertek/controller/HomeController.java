package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping1(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/ozzy")
    public String getRequestMapping2(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cybertek")
    public String getRequestMapping3(){
        return "home";
    }

    @GetMapping("/spring")
    public String getMapingEx1(){
        return  "home";
    }

    @PostMapping("/spring")
    public String getMapingEx2(){
        return  "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariable1(@PathVariable("name") String name){
        System.out.println(" name is " + name);
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariable2(@PathVariable("name") String name, @PathVariable("email") String email){
        System.out.println(" name is " + name);
        System.out.println("email is " +email);
        return "home";
    }

    @GetMapping("home/course")
    public String requestParamEx1(@RequestParam("course") String course){
        System.out.println("name is " +course);
        return "home";
    }

    @GetMapping(value="/course")
    public String requestParamEx2(@RequestParam(value="name", required = false, defaultValue = "Cybertek") String name){
        System.out.println("name is " +name);
        return "home";
    }
}