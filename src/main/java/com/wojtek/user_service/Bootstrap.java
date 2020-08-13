package com.wojtek.user_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private final UserRepository userRepository;

    public Bootstrap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        UserEntity userEntity = new UserEntity();
        userEntity.setName("John");
        userEntity.setSurname("Smith");
        userEntity.setLogin("jsmith");
        userEntity.setPassword("qwerty");

        UserEntity userEntity2 = new UserEntity();
        userEntity2.setName("Jane");
        userEntity2.setSurname("Doe");
        userEntity2.setLogin("jdoe");
        userEntity2.setPassword("mySecret");

        userRepository.save(userEntity);
        userRepository.save(userEntity2);

    }
}
