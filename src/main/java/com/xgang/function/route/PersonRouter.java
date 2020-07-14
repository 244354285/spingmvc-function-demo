package com.xgang.function.route;

import com.xgang.function.handler.PersonHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

/**
 * @author xugang
 * @date 2020/7/13 22:19
 */
@Configuration
public class PersonRouter {

	@Bean
	public RouterFunction<ServerResponse> routes(PersonHandler personHandler) {
		return RouterFunctions.route()
				.GET("/getAllPerson", personHandler::list)
				.GET("/getById/{id}", personHandler::get)
				.build();
	}
}
