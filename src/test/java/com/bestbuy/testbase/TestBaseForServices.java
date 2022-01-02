package com.bestbuy.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * @author Vimal Vithalpura
 * @project BestBuy-API-RestAssured-HW18
 * @created 02/01/2022
 */
public class TestBaseForServices {

    @BeforeClass
    public static void initialize(){
        RestAssured.baseURI="http://localhost";
        RestAssured.port = 3030;
        RestAssured.basePath = "/services";
    }
}
