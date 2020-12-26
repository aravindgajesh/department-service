package com.ecofreeze.department.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ecofreeze.department.entity.Department;
import com.ecofreeze.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	Logger log = LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department dept) {
		log.info("Inside Save dept of Department Service");
		log.info("Address is "+dept.getDepartmentAddress());
		return departmentRepository.save(dept);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside findDepartmentById of Department Service");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
