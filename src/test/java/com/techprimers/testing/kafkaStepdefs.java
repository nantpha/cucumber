package com.techprimers.testing;

import com.example.testing.KafkaSender;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
public class kafkaStepdefs {
	

	KafkaSender kafka;

    @Given("^Create a send method$")
    public void createsendMathod() throws Throwable {
    	kafka = new KafkaSender();
    }

    @When("^I send a information  \"([^\"]*)\"$")
    public void kafkaInfo(String number) throws Throwable {
    	kafka.sendData(number);
    }

   
}
