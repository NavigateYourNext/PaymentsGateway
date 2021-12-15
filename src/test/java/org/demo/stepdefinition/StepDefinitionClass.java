package org.demo.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import org.demo.baseclass.BaseClass;
import org.json.simple.JSONObject;
import org.junit.Assert;

public class StepDefinitionClass extends BaseClass {

    @Given("Valid transaction id should be available")
    public void valid_transaction_id_should_be_available() {
        uuid = getUUID();
    }

    @Given("Invalid transaction id should be available")
    public void invalid_transaction_id_should_be_available() {
        uuid = getUUID().replaceAll("[\\d]+","x");
    }

    @Given("Valid transaction id should be available on which request already being processed")
    public void valid_transaction_id_should_be_available_on_which_request_already_being_processed() {
        uuid = properties.get("uuid").toString();
    }

    @When("Make a post request")
    public void make_a_post_request() {
        RestAssured.baseURI = properties.get("url").toString();
        httpRequest = RestAssured.given().pathParam("id",uuid);
        httpResponse = httpRequest.request(Method.POST,"/{id}/refund");
    }

    @Then("Response code should be received as {int}")
    public void response_should_be_received(int responseCode) {
        Assert.assertEquals(responseCode,httpResponse.getStatusCode());
    }
}