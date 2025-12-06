package com.nametag.nametagservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameTagController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}
}
