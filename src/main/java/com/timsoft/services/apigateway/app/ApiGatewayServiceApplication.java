package com.timsoft.services.apigateway.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

@Slf4j
@SpringBootApplication(scanBasePackages = {"com.timsoft.services"})
@EnableZuulProxy
public class ApiGatewayServiceApplication {

	public static void main(String[] args) throws IOException{
		SpringApplication.run(ApiGatewayServiceApplication.class, args);

		log.info(FigletFont.convertOneLine("API Gateway"));
	}
}
