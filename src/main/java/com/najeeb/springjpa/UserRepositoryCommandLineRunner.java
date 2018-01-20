package com.najeeb.springjpa;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.najeeb.springjpa.entity.User;
import com.najeeb.springjpa.service.UserDAOService;
import com.najeeb.springjpa.service.UserRepository;

import antlr.collections.List;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		User user = new User("jill", "Admin");
		//New User is created : User  [id=1, name=Jack, role=Admin]
		userRepository.save(user);
		log.info("New User is created : " + user);
		
		Optional<User> userWithIdOne = 
				userRepository.findById(1L);
		log.info("user is retrived : " + userWithIdOne);
		
		java.util.List<User> users = userRepository.findAll();
		log.info("All Users : " + users);
	}
}