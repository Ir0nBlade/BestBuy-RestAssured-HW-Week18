package com.bestbuy.stores;

import com.bestbuy.testbase.TestBaseForStores;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * @author Vimal Vithalpura
 * @project BestBuy-API-RestAssured-HW18
 * @created 02/01/2022
 */
public class StoresDeleteTest extends TestBaseForStores {

    @Test
    public void deleteSingleStoreData(){
        Response response = given()
                .pathParam("id", "8929")
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
