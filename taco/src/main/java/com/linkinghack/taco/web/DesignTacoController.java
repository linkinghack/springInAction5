package com.linkinghack.taco.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.linkinghack.taco.pojo.*;
import com.linkinghack.taco.pojo.Ingredient.Type;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {
	
	public String showDesignForm(Model model) {
		List<Ingredient> ingredients = Arrays.asList(
				new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
				new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
				new Ingredient("GRBF", "Ground Beef", Type.WRAP),
				new Ingredient("CARN", "Carnitas", Type.WRAP),
				new Ingredient("TMTO", "Diced Tomatoes", Type.WRAP),
				new Ingredient("LETC", "Lettuce", Type.WRAP),
				new Ingredient("CHED", "Cheddar", Type.WRAP),
				new Ingredient("JACK", "Monterrey", Type.WRAP),
				new Ingredient("SLSA", "Salsa", Type.WRAP),
				new Ingredient("SRCR", "Sour Crem", Type.WRAP)
				);
		
		Type[] types = Ingredient.Type.values();
		for(Type type : types) {
			model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients,type));
		}
		
		model.addAttribute("design", new Taco());
		
		return "design";
	}
	
}
