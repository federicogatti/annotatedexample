package it.federicogatti.annotationexample.annotationexample.controller;

import it.federicogatti.annotationexample.annotationexample.annotation.CustomAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyController {


    @GetMapping(path = "/foo")
    @CustomAnnotation(foo = "${my.value}")
    public void foo()  {
    }
}
