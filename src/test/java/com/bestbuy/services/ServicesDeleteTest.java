package com.bestbuy.services;

import com.bestbuy.testbase.TestBaseForServices;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * @author Vimal Vithalpura
 * @project BestBuy-API-RestAssured-HW18
 * @created 02/01/2022
 */
public class ServicesDeleteTest extends TestBaseForServices {

    @Test
    public void deleteSingleService() {
        Response response = given()
                .pathParam("id", "28")
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
