package com.example.studentsdemo;

import com.example.studentsdemo.entities.Student;
import com.example.studentsdemo.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class StudentsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentsDemoApplication.class, args);
    }


    @Bean
    CommandLineRunner init(StudentRepository repository) {

        return args -> {
            repository.save(new Student(null, "John", new Date(),true, 23));
            repository.save(new Student(null, "Jack", new Date(),false, 23));
            repository.save(new Student(null, "Don", new Date(),true, 23));

            repository.findAll().forEach(System.out::println);
        };


    }


}
