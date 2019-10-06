package com.odyssey.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Example {
	
// Accepts Strings and returns the reverse of the String
	

	
	public String getString(String str) {
		
		
		
		String strreverse = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			
			strreverse = strreverse + str.charAt(i);
		}
		
		return strreverse;
	}
	
	
	// filtering names for a collections of names 
	
	public List<String> getFilterResult(List<String> string){
		
		List<String> names = string.stream()
							.filter(n -> n =="Daniel").
							collect(Collectors.toList());
		
		return names;
		
		
	}
	
	
	public List<Product> getProducts() {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1, "Dell",100f));
		products.add(new Product(2, "Samsung", 200f));
		products.add(new Product(3, "Mac", 400f));
		
		
		
		return products;
	}
	
	
	public void getException( int x) {
		int y = 8 / x;
	}
	
	
// The following method that provides the method execution
	
	

}
