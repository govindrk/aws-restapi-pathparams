package com.amazonaws.lambda.streamlambdapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataObject {
	@JsonProperty("number1")
	int number1;
	@JsonProperty("number2")
	int number2;
	int sum;
	int product;
	int difference;
	float quotient;
	
	public void calculateResult() {
		sum = number1 + number2;
		difference = Math.abs(number1 - number2);
		product = number1 * number2;
		quotient = (float) number1 / (float) number2;
	}
}
