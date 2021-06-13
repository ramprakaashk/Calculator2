package com.example;

import org.springframework.stereotype.Component;;;

@Component
public class CalculatorServices {

	public int add(int x,int y){
		int z = x+y;
		return z;
	}
	
	public int subract(int x,int y){
		int z = x-y;
		return z;
	}

	public int multiply(int x,int y){
		int z = x*y;
		return z;
	}
}
