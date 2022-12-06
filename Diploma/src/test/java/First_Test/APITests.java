package First_Test;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class APITests {

    @BeforeTest
    public void precondition() {
        baseURI = "https://catalog.onliner.by/sdapi";
    }

    @Test(description = "Проверка того что страница по данному URL не найдена")
    public void getTestOne() {
        Response response = given().get(baseURI + "/shop.api/products/la1023/positions?town_id=17030&limit_prime=2&limit_total=6&has_delivery=1");
        response.then().assertThat().statusCode(404);
    }

    @Test(description = "Проверка что Xbox по адресу найден и данные отображаются в соответствии с документациеЙ")
    public void getTestTwo() {
        Integer limit = 10;
        Response response = given().get(baseURI + "/catalog.api/search/products?query=xbox+36&id=632886");
        response.then().assertThat().statusCode(200);
        Assert.assertEquals(response.then().extract().response().jsonPath().getInt("page.limit"), limit);
        Assert.assertEquals(response.then().extract().response().statusCode(), 200);
    }

    @Test(description = "Проверка что элемент Nintendo Switch OLED по адресу найден и данные отображаются в соответствии с документациеЙ")
    public void getTestThree() {
        Response response = given().get(baseURI + "/catalog.api/search/products?query=%D0%B8%D0%B3%D1%80%D0%BE%D0%B2%D0%B0%D1%8F+%D0%BF%D1%80%D0%B8%D1%81%D1%82%D0%B0%D0%B2%D0%BA%D0%B0+nintendo+switch+oled&id=2504915");
        response.then().assertThat().statusCode(200);
        response.then().assertThat().body(matchesJsonSchema(getJsonData("productsList2")));
    }

    @Test(description = "Тест на ввод логина и пароля в окне входа ")
    public void getTestFour() {
        Response response = given().header("Content-Type", "application/json").body(getJsonData("informationList")).post("/user.api/login");
        response.then().assertThat().statusCode(422);
        Assert.assertEquals(response.then().extract().response().jsonPath().getString("message"), "Validation failed");
    }

    public String getJsonData(String filename) {
        try {
            return new String(Files.readAllBytes(Paths.get("files/" + filename + ".json")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}





