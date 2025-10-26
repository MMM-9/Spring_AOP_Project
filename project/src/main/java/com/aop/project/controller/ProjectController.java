package com.aop.project.controller;

import com.aop.project.annotation.RequestValidation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class ProjectController {

    @RequestValidation
    @GetMapping(value={"","/"})
    public ResponseEntity<Boolean> testingAspect(@RequestParam String name, @RequestParam int age){
        return ResponseEntity.ok(true);
    }
}
