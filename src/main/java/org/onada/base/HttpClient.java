package org.onada.base;


import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.response.Response;

public class HttpClient {

    public Response getRequest(final String url) {
        final LogConfig config = new LogConfig().enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.config().logConfig(config);

        return RestAssured.given()
                .when()
                .get(url)
                .then().extract().response();
    }
}
