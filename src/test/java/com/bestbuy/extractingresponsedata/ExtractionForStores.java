package com.bestbuy.extractingresponsedata;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * @author Vimal Vithalpura
 * @project BestBuy-API-RestAssured-HW18
 * @created 02/01/2022
 */
public class ExtractionForStores {

    static ValidatableResponse response;

    @BeforeClass
    public static void initialize() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
        response = given()
                .when()
                .get("/stores")
                .then().statusCode(200);
    }

    // 1. Extract the limit
    @Test
    public void test001(){

    }


// 2. Extract the total
// 3. Extract the name of 5th store
// 4. Extract the names of all the store
// 5. Extract the storeId of all the store
// 6. Print the size of the data list
// 7. Get all the value of the store where store name = St Cloud
// 8. Get the address of the store where store name = Rochester
// 9. Get all the services of 8th store
// 10. Get storeservices of the store where service name = Windows Store
// 11. Get all the storeId of all the store
// 12. Get id of all the store
// 13. Find the store names Where state = ND
// 14. Find the Total number of services for the store where store name = Rochester
// 15. Find the createdAt for all services whose name = “
//    Windows Store”
// 16. Find the name of all services Where store name = “Fargo”
// 17. Find the zip of all the store
// 18. Find the zip of store name = Roseville
// 19. Find the storeservices details of the service name = Magnolia Home Theater
// 20. Find the lat of all the stores

}
