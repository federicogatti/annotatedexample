package it.federicogatti.annotationexample.annotationexample.controller;

import it.federicogatti.annotationexample.annotationexample.annotation.CustomAnnotation;

@CustomAnnotation(foo = "${my.value}")
public class AnnotatedClass {
}
