package com.example.customuserdetailsservice;

import com.example.customuserdetailsservice.dao.UserDao;
import com.example.customuserdetailsservice.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@RequiredArgsConstructor
public class CustomUserdetailsServiceApplication {
    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;

    // @Bean
    public ApplicationRunner runner(){
        return r ->{
            User user1=new User();
            user1.setAuthority("read");
            user1.setUsername("mary");
            user1.setPassword(passwordEncoder.encode("12345"));
            userDao.save(user1);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomUserdetailsServiceApplication.class, args);
    }

}
