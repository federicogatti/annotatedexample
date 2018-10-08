package it.federicogatti.annotationexample.annotationexample.controller;

import it.federicogatti.annotationexample.annotationexample.annotation.CustomAnnotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping(path = "/foo")
    public void foo()  {
        CustomAnnotation customAnnotation = AnnotatedClass.class.getAnnotation(CustomAnnotation.class);
        logger.info(customAnnotation.foo());
    }
}