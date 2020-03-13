package com.shameel.aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/hello")
@RestController
public class HelloController {

    public String Hello(){
        return "Hello youtube";
    }
}
