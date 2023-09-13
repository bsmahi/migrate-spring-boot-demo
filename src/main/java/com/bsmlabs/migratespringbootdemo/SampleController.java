package com.bsmlabs.migratespringbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private static final String base_message = "Spring Boot 3 Migration with OpenRewrite";

    @GetMapping("/message")
    public String getMessage() {
        return base_message;
    }
}
