package org.sofka.config;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ConfigResourceTest {

    @Test
    public void test(){
        Response response = given()
                .when().get("/config/supersonic");

         response.then().statusCode(200);

         Assertions.assertEquals("Mach 3 is 2301,811 mph", response.asString());

    }

}