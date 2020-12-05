package com.example.validate.exvalidate.controller;

import javax.validation.Valid;

import com.example.validate.exvalidate.domain.SearchDto;
import com.example.validate.exvalidate.result.BindingResultHelper;
import com.example.validate.exvalidate.result.CustomInvalidParameterException;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example/validate")
public class TestController {

    // @PostMapping
    // public ResponseEntity<String> searchWithinPeriod(@RequestBody @Valid
    // SearchDto dto, BindingResult bindingResult)
    // throws CustomInvalidParameterException {
    // if (bindingResult.hasErrors()) {
    // BindingResultHelper.throwCustomInvalidParameterException(bindingResult);
    // }
    // return ResponseEntity.ok("잘된다.");
    // }

    @PostMapping
    public void setAnimation(@RequestBody @Valid SearchDto parms, BindingResult bindingResult)
            throws CustomInvalidParameterException {
        System.out.println(parms.toString());
        if (bindingResult.hasErrors()) {
            BindingResultHelper.throwCustomInvalidParameterException(bindingResult);
        }
        // return ResponseEntity.ok("잘된다.");
    }
}
