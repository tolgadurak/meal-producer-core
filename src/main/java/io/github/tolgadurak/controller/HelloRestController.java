package io.github.tolgadurak.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.tolgadurak.model.HelloMessage;

@RestController
public class HelloRestController {

	@RequestMapping("hello")
	public HelloMessage hello(@RequestParam(value = "message", defaultValue = "Hello World") String message) {
		HelloMessage helloMessage = new HelloMessage();
		helloMessage.setName("Hello World");
		helloMessage.setDescription("Sample Description");
		helloMessage.setDate(new Date());
		return helloMessage;
	}
}
