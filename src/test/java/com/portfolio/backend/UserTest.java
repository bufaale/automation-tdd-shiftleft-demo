package com.portfolio.backend;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class UserTest {

    @Test
    public void shouldCreateUser() {
        RestAssured.baseURI = "http://localhost:8080";

        given()
                .contentType("application/json")
                .body("{\"name\": \"León\", \"email\": \"leon@mail.com\"}")
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .body("id", notNullValue());
    }
}
