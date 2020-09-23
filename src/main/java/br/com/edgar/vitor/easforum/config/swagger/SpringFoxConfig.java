package br.com.edgar.vitor.easforum.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalTime;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {
		@Bean
		public Docket apiDocket() {
				return new Docket(DocumentationType.SWAGGER_2)
						.useDefaultResponseMessages(false)
						.directModelSubstitute(LocalTime.class, String.class)
						.select()
						.apis(RequestHandlerSelectors.basePackage("br.com.edgar.vitor.easforum.controller"))
						.paths(PathSelectors.any())
						.build();
		}
}
