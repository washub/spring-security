package com.spring.securityspring;

import com.spring.securityspring.entities.User;
import com.spring.securityspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecuritySpringApplication {// {
//	@Autowired
//	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SecuritySpringApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setUserName("wasique");
//		user.setPassword("user");
//		userRepository.save(user);
//	}
}
