package StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;
public class GetRequestTest {
    @Given("I make a call {string}")
    public void i_make_a_call(String string) {

    }

    @Given("http method {string}")
    public void http_method(String string) {
        String.format("%s", string);
    }

    @Then("I get the response")
    public void i_get_the_response() {

    }


    ///////////////////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Given("I perform Get operation for {string}")
    public void i_perform_get_operation_for(String baseURI) {
        given().contentType(ContentType.JSON).baseUri(baseURI);
    }

    @Given("I perform a post number {string}")
    public void i_perform_a_post_number(String postNum) {
        when().get(String.format("posts/%s", postNum))
                .then().body("author", is("typicode"));
    }

    @Then("I should see the author name {string}")
    public void i_should_see_the_author_name(String string) {

    }

}
