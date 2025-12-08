package com.nametag.nametagservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameTagController {

	@GetMapping("/getVersion")
	public String getVersion() {
		return "Hello this is the release/3.1.0 branch";
	}
}
