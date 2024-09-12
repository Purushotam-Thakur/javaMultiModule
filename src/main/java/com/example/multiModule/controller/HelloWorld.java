package com.example.multiModule.controller;

import com.example.multiModule.dto.TestRequestBody;
import com.example.multiModule.dto.TestResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/")
    String helloWorld(){
        return "Hi this is 1st controller";
    }

    @PostMapping("/test")
    TestResponseBody helloWorldPost(@RequestBody TestRequestBody requestBody){
        TestResponseBody responseBody = new TestResponseBody();
        responseBody.setName(requestBody.getName());
        responseBody.setEmail(requestBody.getEmail());
        responseBody.setMessage("Request received successfully");
        return responseBody;
    }

}
