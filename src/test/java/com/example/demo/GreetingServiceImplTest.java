package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.example.demo.service.impl.GreetingServiceImpl;
import static org.junit.jupiter.api.Assertions.*;


public class GreetingServiceImplTest {

	@InjectMocks
	private GreetingServiceImpl greetingService;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);  // Initialisation des mocks
	}
	@Test
	void testGetUserInfo_UserExists() {
		assertTrue(greetingService.getGreetingMessage().getContent().contains("content"));
	}
}
