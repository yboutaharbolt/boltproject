package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.pojo.Greeting;
import com.example.demo.service.GreetingService;

@RestController
public class GreetingController {
	@Autowired
	private GreetingService greetingService;

	/**
	 *
	 * @param name
	 * @return
	 */
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return greetingService.getGreetingMessage();
	}

}
