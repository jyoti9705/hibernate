package com.example.jpa.jpa;

import com.example.jpa.jpa.entity.User;
import com.example.jpa.jpa.service.UserDaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoCommandLineRunner implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoCommandLineRunner.class);

    @Autowired
    private UserDaoService userDaoService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        Long valueInserted = userDaoService.insert(user);
        LOGGER.info("Id of inserted user is : {}", valueInserted);

    }
}
