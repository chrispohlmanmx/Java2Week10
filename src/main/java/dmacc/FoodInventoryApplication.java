package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.FoodItem;
import dmacc.controller.BeanConfiguration;

@SpringBootApplication
public class FoodInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodInventoryApplication.class, args);
		
	}

}
