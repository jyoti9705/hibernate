package com.example.jpa.jpa;

import com.example.jpa.jpa.entity.User;
import com.example.jpa.jpa.repository.UserRepository;
import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User("Jill", "Admin1");
        User userSaved = userRepository.save(user);
        LOGGER.info("Saved user has id : {}",userSaved.getId());

        List<User> users = userRepository.findAll();
        LOGGER.info("All Users : {}",users.toString());
    }
}
