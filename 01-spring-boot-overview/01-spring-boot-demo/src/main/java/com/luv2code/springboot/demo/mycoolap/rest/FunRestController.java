package com.luv2code.springboot.demo.mycoolap.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // EXPOSE "/" that return "Hello Wolrd"

@GetMapping("/")
    public String sayHello(){
    return "Hello world!";
}




}
