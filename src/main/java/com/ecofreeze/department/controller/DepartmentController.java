package com.ecofreeze.department.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecofreeze.department.entity.Department;
import com.ecofreeze.department.service.DepartmentService;


import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	Logger log = LoggerFactory.getLogger(DepartmentController.class);
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department dept) {
		log.info("Inside Department Controller saveDepartment");
		return departmentService.saveDepartment(dept);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long id) {
		log.info("Inside Department Controller findDepartmentById");
		return departmentService.findDepartmentById(id);
	}
}
