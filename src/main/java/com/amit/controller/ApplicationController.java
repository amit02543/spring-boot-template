package com.amit.controller;

import com.amit.service.ApplicationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Application Controller", description = "Default controller to test swagger end point")
@CrossOrigin
@Slf4j
@RequestMapping("/v1/app")
public class ApplicationController {


    @Autowired
    private ApplicationService service;


    @RequestMapping(
            value = "/dummy",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> testEndpoint() {
        return new ResponseEntity<>(service.testEndpoint(), HttpStatus.OK);
    }



}
