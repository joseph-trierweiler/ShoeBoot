package com.joseph.ShoeBoot.ShoeBootControllerPackage;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joseph.ShoeBoot.ShoeListServicePackage.Shoe;
import com.joseph.ShoeBoot.ShoeListServicePackage.ShoeListService;

@Controller
public class ShoeBootControllerClass {
	
	private ShoeListService shoeListService;
	
	@RequestMapping("sayHello")
	public String helloJSP() {
		return "sayHello";
	}
	
	public ShoeBootControllerClass(ShoeListService shoeListService) {
		super();
		this.shoeListService = shoeListService;
	}
	
	@RequestMapping("shoeList")
	public String shoeList(ModelMap model) {
		List<Shoe> shoes = shoeListService.returnList();
		model.addAttribute("shoes", shoes);
		return "shoeList";
	}
}
