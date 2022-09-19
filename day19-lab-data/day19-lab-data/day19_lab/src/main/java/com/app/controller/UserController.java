package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.User;
import com.app.service.IUserService;

@RestController // @Controller + @ResponseBody : added on ret types of req handling methods
@RequestMapping("/users")
public class UserController {
	//dep : user service i/f
	@Autowired
	private IUserService userService;
	public UserController() {
		System.out.println("in ctor of "+getClass());
	}
	//add REST API end point to serve list of users
	@GetMapping
	public List<User> fetchAllUsers()
	{
		System.out.println("in get all users");
		return userService.getAllUsers();
	}
	

}
