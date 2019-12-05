package com.misterfifi.springbootdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> getHome(final HttpServletRequest request){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
