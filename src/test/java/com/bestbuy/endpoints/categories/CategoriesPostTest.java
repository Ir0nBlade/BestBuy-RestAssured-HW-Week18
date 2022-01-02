package com.bestbuy.endpoints.categories;

import com.bestbuy.model.CategoriesPojo;
import com.bestbuy.testbase.TestBaseForCategories;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * @author Vimal Vithalpura
 * @project BestBuy-API-RestAssured-HW18
 * @created 02/01/2022
 */
public class CategoriesPostTest extends TestBaseForCategories {

    @Test
    public void createNewCategory() {
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName("Computer Dept");
        categoriesPojo.setId("abcat00109874");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(categoriesPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();


    }

}
