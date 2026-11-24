package com.dcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllere {

	@GetMapping("/demo")
	public String demo() {
		return "Welcome tothe world of SpringBoot";
	}
}
