package stepdefinitions.Util;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RSpecification {

    public static RequestSpecification getRSpecification()
    {
        return new RequestSpecBuilder()
                .setBaseUri("https://gorest.co.in/")
                .setContentType("application/json")
                .addHeader("Authorization","Bearer b6937dfecc6168181b06cde7d79fc22a46f97cc743642ccfe11f93ec68a310f3")
                .build();
    }
}
