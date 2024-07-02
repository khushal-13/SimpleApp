package com.khushal.SimpleApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String greet() {
        return "Hello World";
    }

    @GetMapping("/info")
    public String info() {
        String os = System.getProperty("os.name");
        String version = System.getProperty("os.version");
        String architecture = System.getProperty("os.arch");
        String javaVersion = System.getProperty("java.version");
        String user = System.getProperty("user.name");

        return "OS : "+os+" Version : "+version+" Architecture : "+architecture+" Java version : "+javaVersion+" User name : "+user;
    }
}
