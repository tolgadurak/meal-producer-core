package io.github.tolgadurak.meal.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.github.tolgadurak.controller.HelloRestController;

@SpringBootApplication
@ComponentScan(basePackageClasses= {HelloRestController.class})
public class MealProducerCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MealProducerCoreApplication.class, args);
	}
}
