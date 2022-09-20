package com.exam.examserver.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.examserver.exception.UsernameNotFoundException;
import com.exam.examserver.model.Role;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;
import com.exam.examserver.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService userService;
	
	//creating user
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		user.setProfile("default.png");
		Set<UserRole> roles = new HashSet<>();
		Role role = new Role();
		
		role.setRoleName("NORMAL");
		
		UserRole userRole = new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		
		
		
		roles.add(userRole);
		
		
		
		
		return this.userService.createUser(user, roles);
	}
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
		
		
	}
	
	//delete the user by id
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
	this.userService.deleteUser(userId);
	
}
	
//	@ExceptionHandler(UsernameNotFoundException.class)
//	public ResponseEntity<?> exceptionHandler(UsernameNotFoundException ex){
//		return null;
//	}

	
}