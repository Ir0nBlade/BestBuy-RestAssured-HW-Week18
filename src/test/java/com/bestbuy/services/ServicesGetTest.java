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
public class ServicesGetTest extends TestBaseForServices {

    @Test
    public void getAllServicesList(){
        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
