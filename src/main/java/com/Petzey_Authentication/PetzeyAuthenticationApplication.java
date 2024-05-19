package com.Petzey_Authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@CrossOrigin("*")
@SpringBootApplication
@EnableEurekaClient
//@OpenAPIDefinition(info = @Info(title = "Petzey", version = "1.0", description = "Swagger for Account Service")
//,servers = {
//        @Server(url = "https://account.bt.skillassure.com", description = "Default Server URL")})
public class PetzeyAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetzeyAuthenticationApplication.class, args);
	}
	

}
