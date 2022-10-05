package com.joseph.ShoeBoot.ShoeListServicePackage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ShoeListService {
	private static List<Shoe> shoes = new ArrayList<>();
	
	static {
		shoes.add(new Shoe(1, "Shoe1", "Shoe1Desc", 1.11));
		shoes.add(new Shoe(2, "Shoe2", "Shoe2Desc", 2.22));
		shoes.add(new Shoe(3, "Shoe3", "Shoe3Desc", 3.33));
	}
	
	public List<Shoe> returnList(){
		return shoes;
	}
}
