package com.xpadro.webci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebCiApplication {

	private final HelloService helloService;

	public WebCiApplication(HelloService helloService) {
		this.helloService = helloService;
	}

	public static void main(String[] args) {
		SpringApplication.run(WebCiApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return helloService.hello();
	}

}