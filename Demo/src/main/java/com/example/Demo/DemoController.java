package com.example.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "welcome to spring boot application";
	}
}
