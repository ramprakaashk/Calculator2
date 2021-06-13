package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.*;


@SpringBootApplication
public class Calculator2Application {

	public static void main(String[] args) {
		//SpringApplication.run(Calcualtor1Application.class, args);
				CalculatorServices calServ = new CalculatorServices();
				//System.out.println();
				//System.out.println("The addition of 2 numbers are "+calServ.add(3, 4));
				
				ApplicationContext applicationContext = 
						SpringApplication.run(Calculator2Application.class, args);
				CalculatorServices calServ1 = applicationContext.getBean(CalculatorServices.class);
				System.out.println("HIiiiiiiiddd  ===>");
	}

}
