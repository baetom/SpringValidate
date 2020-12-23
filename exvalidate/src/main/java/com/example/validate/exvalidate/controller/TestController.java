package com.example.validate.exvalidate.controller;

import javax.validation.Valid;

import com.example.validate.exvalidate.domain.SearchDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example/validate")
public class TestController {

    @PostMapping
    public void setAnimation(@RequestBody @Valid SearchDto parms) {
        System.out.println(parms.toString());
        // if (bindingResult.hasErrors()) {
        // BindingResultHelper.throwCustomInvalidParameterException(bindingResult);
        // }
        // return ResponseEntity.ok("잘된다.");
    }
}
