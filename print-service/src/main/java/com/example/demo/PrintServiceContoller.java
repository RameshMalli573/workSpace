package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/print")
public class PrintServiceContoller {
	
	@GetMapping("/**")
	String print() {
		return "print service called";
	}
	@PostMapping
	String postPrint(@RequestParam String content) {
		return content + "recieved";
	}
}