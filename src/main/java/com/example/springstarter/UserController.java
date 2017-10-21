package com.example.springstarter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private ApplicationUserRepository applicationUserRepository;

	@GetMapping("/get-dummy-data")
	public List<ApplicationUser> getDummyData() {
		return applicationUserRepository.findAll();
	}

	@GetMapping("/login")
	public String getHelloData() {
		return "Success accessing unauthenticated URL !!!";
	}
}