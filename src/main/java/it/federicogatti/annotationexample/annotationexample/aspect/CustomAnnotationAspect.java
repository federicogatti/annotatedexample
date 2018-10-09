package it.federicogatti.annotationexample.annotationexample.aspect;

import it.federicogatti.annotationexample.annotationexample.annotation.CustomAnnotation;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Aspect
@Component
public class CustomAnnotationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StringValueResolver resolver;

    @Before("@annotation(customAnnotation)")
    public String foo(final CustomAnnotation customAnnotation) {
        String foo = customAnnotation.foo();
        String value = resolver.resolveStringValue(foo);
        logger.info(value);
        return value;
    }

}
