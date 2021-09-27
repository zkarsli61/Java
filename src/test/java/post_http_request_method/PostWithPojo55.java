package post_http_request_method;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.JsonPlaceHolderPojo;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

public class PostWithPojo55 extends JsonPlaceHolderBaseUrl {
    /*
    Given
            https://jsonplaceholder.typicode.com/todos
            {
            "userId": 55,
            "title": "Tidy your room",
            "completed": false
            }
    When
            I send POST Request to the Url
    Then
            Status code is 201
    And
        response body is like {
                "userId": 55,
                "title": "Tidy your room",
                "completed": false,
                "id": 201
                }
 */

    @Test
    public void post55() {
	spec.pathParam("1","todos");
	
	JsonPlaceHolderPojo requestBody = new JsonPlaceHolderPojo(55,"Tidy your room",false);
	Response response = given().spec(spec).contentType(ContentType.JSON).body(requestBody).when().post("/{1}");
	
	response.then().assertThat().statusCode(201)
	.body("userId", equalTo(requestBody.getUserId())
		,"title", equalTo(requestBody.getTitle())
		,"completed", equalTo(requestBody.getCompleted())
	);
	
	JsonPlaceHolderPojo actualData = response.as(JsonPlaceHolderPojo.class);
	assertEquals(requestBody.getUserId(), actualData.getUserId());
	assertEquals(requestBody.getTitle(), actualData.getTitle());
	assertEquals(requestBody.getCompleted(), actualData.getCompleted());
    
    }
}