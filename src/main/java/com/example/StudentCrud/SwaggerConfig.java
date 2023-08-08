package com.example.StudentCrud;

//The static import is used for the regex(..) method.
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//This annotation enables the Swagger support in the application.
@EnableSwagger2
public class SwaggerConfig {

	// The select() method called on Docket bean returns an "ApiSelectorBuilder".
	// This provides "apis()" and "paths()" methods to filter the controllers and
	// methods being documented using string predicates.
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(metadata()).select().paths(regex("/api.*")).build();
	}

	private ApiInfo metadata() {
		return new ApiInfoBuilder().title("Varshith's Swagger API's")
				.license("Click here to Relax")
				.licenseUrl("https://www.youtube.com/watch?v=EZP9T__5vHQ")
				.description("These API's are developed by Varshith Reddy").version("0.2").build();
	}
}