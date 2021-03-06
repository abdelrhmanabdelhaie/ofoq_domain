package com.github.arocketman;

import com.github.arocketman.entities.Role;
import com.github.arocketman.entities.User;
import com.github.arocketman.services.UserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class VanillaApplication {
    

//    @Bean
//    public CommandLineRunner setupDefaultUser(UserService service) {
//        return args -> {
//            service.save(new User(
//                    "7mada", //username
//                    "user", //password
//Arrays.asList(new Role("USER"), new Role("ACTUATOR")),//roles 
//                    true//Active
//            ));
//        };
//    }
    

	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder application) { return
	 * application.sources(Vanilla`Application.class); }
	 */
	
    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }    

    public static void main(String[] args) {
        SpringApplication.run(VanillaApplication.class, args);
    }

}
