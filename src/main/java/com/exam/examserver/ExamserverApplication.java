package com.exam.examserver;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.exam.examserver.model.Role;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;
import com.exam.examserver.service.UserService;

@SpringBootApplication
public class ExamserverApplication{
    
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
		System.out.println("Started Running");
	}

	//@Override
	//public void run(String... args) throws Exception {
		

		// TODO Auto-generated method stub
	//	System.out.println("starting code");
	    
	//User user = new User();
		
	//user.setFirstName("Bhoome");
	//	user.setLastName("Harthika");
	//	user.setUsername("Harthika12");
	//	user.setPassword("abc");
	//	user.setEmail("abc@gmail.com");
		
	//	user.setProfile("default.png");
	//	
	//	Role role1 = new Role();
	//	
	//	role1.setRoleName("ADMIN");
	//	
		
	//	Set<UserRole> userRoleSet = new HashSet<>();
	//	UserRole userRole = new UserRole();
	//	userRole.setRole(role1);
	//	userRole.setUser(user);
		
	//	userRoleSet.add(userRole);
	
	//	User user1 = this.userService.createUser(user,  userRoleSet);
	 //   System.out.println(user1.getUsername());
	//}

}
