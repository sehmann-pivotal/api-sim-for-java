package com.example.apisimforjava;

import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApiSimForJavaApplicationTests {

	@LocalServerPort
	int port;

	@Test
	public void contextLoads() {

		when().get("http://localhost:" + port + "/endpoint")
				.then()
				.statusCode(200)
				.body("field", IsEqual.equalTo("value"));
	}

}
