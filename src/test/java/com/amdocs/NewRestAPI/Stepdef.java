package com.amdocs.NewRestAPI;

import static org.junit.Assert.assertEquals;

import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {

	String url;
	Double result;
	
	@Given("Rest Api {string}")
	public void rest_Api(String resturl) {
	   url = resturl;
	}

	@When("invoking the given rest api")
	public void invoking_the_given_rest_api() {
		RestTemplate restTemplate = new RestTemplate();
		 result = restTemplate.getForObject(url, Double.class);
	}

	@Then("expected result is {int}")
	public void expected_result_is(Double expected) {
		assertEquals(expected, result, 0.01);
	}
}
