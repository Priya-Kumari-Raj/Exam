package com.exam.examserver;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.exam.examserver.model.Category;
import com.exam.examserver.model.User;
import com.exam.examserver.repository.CategoryRepository;
import com.exam.examserver.repository.UserRepository;
import com.exam.examserver.service.CategoryService;
import com.exam.examserver.service.UserService;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.description;






@SpringBootTest(classes= ExamserverApplication.class)
class ExamserverApplicationTests {
    
	@Autowired
	private CategoryService categoryService;
	private CategoryRepository categoryRepo;
	
	@Test
    public void contextLoads() {
	User user = new User();
    user.setUsername("Priya123");
    user.setPassword("abc1");

	}
	//@Test
   //  public void testsaveCategory() {
   // 	 Category category = new Category();
    //	    category.setCid(42L);
    	//    category.setTitle("Programming");
    	  //  category.setDescription("This contains programming");
    	   
   // 	 categoryRepo.save(category);
    //	 assertNotNull(categoryRepo.findById(40L).get());
     //}
	@Test
	public void testgetCategory() {
		Category category = new Category();
		category.setCid(42L);
	

		
	}
	
     
     
}
