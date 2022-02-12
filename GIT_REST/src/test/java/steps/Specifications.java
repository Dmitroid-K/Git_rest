package steps;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {

    public static RequestSpecification requestSpec(String url){
        return new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(ContentType.JSON)
                .build();
    }
    public static RequestSpecification requestSpecAuthorized(String url){
        return new RequestSpecBuilder()
                .addHeader("Authorization", " token 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")
                .setBaseUri(url)
                .setContentType(ContentType.JSON)
                .build();
    }

    public static ResponseSpecification responseSpec(int status){
        return new ResponseSpecBuilder()
                .expectStatusCode(status)
                .build();
    }
}
