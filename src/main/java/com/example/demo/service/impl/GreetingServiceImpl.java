package com.example.demo.service.impl;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import com.example.demo.pojo.Greeting;
import com.example.demo.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Override
	public Greeting getGreetingMessage() {
		return new Greeting(counter.incrementAndGet(), String.format(template, "content"));
	}
}
