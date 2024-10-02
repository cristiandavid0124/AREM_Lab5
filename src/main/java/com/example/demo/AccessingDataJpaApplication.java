package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Optional;

import com.example.demo.model.Property;
import com.example.demo.repository.PropertyRepository;

/**
 * Main application class for the Spring Boot application.
 * This class serves as the entry point for the application and
 * contains the main method to launch the application.
 */
@SpringBootApplication
public class AccessingDataJpaApplication {

    /** Logger instance for this class. */
    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    /**
     * The main method that serves as the entry point for the Spring Boot application.
     *
     * @param args command line arguments passed during the application startup
     */
    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }
}
