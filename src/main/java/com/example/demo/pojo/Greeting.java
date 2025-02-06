package com.example.demo.pojo;

public class Greeting {

	private Long id;
	private String content;

	public Greeting(final Long id, final String content) {
		this.id = id;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(final String content) {
		this.content = content;
	}
}
