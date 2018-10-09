package it.federicogatti.annotationexample.annotationexample;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.EmbeddedValueResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.util.StringValueResolver;

@SpringBootApplication
public class AnnotationexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationexampleApplication.class, args);
	}

	@Bean
	public StringValueResolver getStringValueResolver(ConfigurableBeanFactory factory) {
		return new EmbeddedValueResolver(factory);
	}
}
