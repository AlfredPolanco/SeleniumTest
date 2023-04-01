package Automation.utility;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.http.ContentType;

public class OpenWeatherMapAPI {
    private String baseUrl;
    public void getAPIData() {
        this.baseUrl = "https://api.openweathermap.org/data/2.5/weather?q=london&appid=f7efb2b731257908d61456bcef464f6c&units=metric";
        RestAssured.baseURI = baseUrl;
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get("/")
                .then().extract().response();

        System.out.println(response.asPrettyString());
    }
}
