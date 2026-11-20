package com.dcl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Demo {

	@PostConstruct
	public void init_demo() {
		System.out.println("this is init method");
	}
	
	public void demo() {
		System.out.println("This is a simple method");
	}

	
	@PreDestroy
	public void destroy_demo() {
		System.out.println("this is destroy method");
	}
}
