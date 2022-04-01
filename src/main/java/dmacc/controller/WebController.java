/**
 * @author Christopher Pohlman - cmpolhman
 * CIS175 - Spring 2022
 * Mar 31, 2022
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import dmacc.beans.FoodItem;
import dmacc.repository.FoodItemRepository;


@Controller
public class WebController {
	@Autowired
	FoodItemRepository repo;
	
	@GetMapping({"/", "/viewAll"})
	public String viewAllFoodItems(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewFoodItem(model);
		}
		model.addAttribute("foods", repo.findAll());
		return "results";
	}
	
	
	@GetMapping("/inputFoodItem")
	public String addNewFoodItem(Model model) {
		FoodItem fi = new FoodItem();
		model.addAttribute("newFoodItem", fi);
		return "newItem";
	}
	
	@PostMapping("/inputFoodItem")
	public String addNewFoodItem(@ModelAttribute FoodItem fi, Model model) {
		repo.save(fi);
		return viewAllFoodItems(model);
	}
		
	@GetMapping("/edit/{id}")
	public String showUpdateFoodItem(@PathVariable("id") long id, Model model) {
		FoodItem fi = repo.findById(id).orElse(null);
		model.addAttribute("newFoodItem", fi);
		return "newItem";
	}
	
	@PostMapping("/update/{id}")
	public String reviseFoodItem(FoodItem fi, Model model) {
		repo.save(fi);
		return viewAllFoodItems(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		FoodItem fi = repo.findById(id).orElse(null);
		repo.delete(fi);
		return viewAllFoodItems(model);
	}
	
}
