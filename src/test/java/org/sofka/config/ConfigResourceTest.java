package org.sofka.config;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ConfigResourceTest {

    @Test
    public void test(){
        given()
                .when().get("/config/supersonic")
                .then()
                .statusCode(200)
                .body(is("Mach 3 is 2301,811 mph"));

    }

}