package com.department.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

	@GetMapping("/department")
	public String getDepartmentDetails() {
		return "Department";
	}
}
