package base_urls;

import org.junit.Before;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class DummyAPi3BaseUrl {

    protected RequestSpecification spec;

    @Before
    public void setup() {
	spec = new RequestSpecBuilder().setBaseUri("http://dummy.restapiexample.com").build();
    }
}
