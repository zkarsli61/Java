package get_http_request_method;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;

import org.junit.Before;
import org.junit.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test02 {

    public RequestSpecification spec;

    @Before
    public void setup() {
	spec = new RequestSpecBuilder().setBaseUri("http://dummy.restapiexample.com").build();
    }

    @Test
    public void test02() {
	spec.pathParams("first", "api", "second", "v1", "third", "employees");

	// When I send a GET Request to the URL
	Response response = given().spec(spec).get("/{first}/{second}/{third}");

	response.prettyPrint();

	response.then().assertThat().statusCode(200) // Then HTTP Status Code should be 200
		.contentType(ContentType.JSON) // Content Type should be JSON
		.statusLine("HTTP/1.1 200 OK") // Status Line should be HTTP/1.1 200 OK
		.body("data.id", hasSize(24)) // And There are 24 employees in total
		.body("data.id", hasItem(3))
		.body("data.employee_name", hasItems("Doris Wilder", "Jenette Caldwell", "Bradley Greer"))
		.body("message", equalTo("Successfully! All records has been fetched."));
    }

}
