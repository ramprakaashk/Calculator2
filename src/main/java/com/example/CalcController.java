package com.example;


import java.util.Arrays;
import java.util.List;

import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Results;

@RestController
public class CalcController {

	@GetMapping(path="/calc/add/{int1}/{int2}")
	public List<Results> getAddResults(@PathVariable int int1, @PathVariable int int2 ) {
		return Arrays.asList(
				new Results(int1+int2, "Addition"));
	}
	@GetMapping(path="/calc/sub/{int1}/{int2}")
	public List<Results> getSubResults(@PathVariable int int1, @PathVariable int int2) {
		return Arrays.asList(
				new Results((int1-int2), "Subraction"));
	}
	@GetMapping(path="/calc/mul/{int1}/{int2}")
	public List<Results> getMulResults(@PathVariable int int1, @PathVariable int int2) {
		return Arrays.asList(
				new Results(int1*int2, "Multiplication"));
	}
	@GetMapping(path="/calc/div/{int1}/{int2}")
	public List<Results> getDivResults(@PathVariable int int1, @PathVariable int int2) {
		return Arrays.asList(
				new Results(int1/int2, "Division"));
	}
	@GetMapping(path="/calc/test")
	public List<Results> getTestResults() {
		return Arrays.asList(
				new Results(101, "Testing"));
	}
	@GetMapping(path="/calc/text/{str1}")
	public List<Results> getTestResults(@PathVariable String str1) {
		return Arrays.asList(
				new Results(101, str1));
	}
	
}
