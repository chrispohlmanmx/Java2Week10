/**
 * @author Christopher Pohlman - cmpolhman
 * CIS175 - Spring 2022
 * Mar 31, 2022
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.FoodItem;

/**
 * 
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public FoodItem foodItem() {
		FoodItem bean = new FoodItem();
		return bean;
	}
}
