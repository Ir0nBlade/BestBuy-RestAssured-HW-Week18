package com.bestbuy.endpoints.services;

import com.bestbuy.model.ServicesPojo;
import com.bestbuy.testbase.TestBaseForServices;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * @author Vimal Vithalpura
 * @project BestBuy-API-RestAssured-HW18
 * @created 02/01/2022
 */
public class ServicesPostTest extends TestBaseForServices {

    @Test
    public void createNewServices(){
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Mobile Repair");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(servicesPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();
    }

}
