package Automation.utility;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;
public class OpenWeatherMapAPI {
    public int getAPIData() {
//      37.76249601685431, -122.42112731919765 San Francisco, California Lat & Lo
        Response response = RestAssured.get("https://api.openweathermap.org/data/3.0/onecall?lat=37.76249601685431&lon=-122.42112731919765&units=metric&appid=acbe7cfd45a237ffb04ba32846ad2ce8");
        int statusCode = response.getStatusCode();
        assertEquals(statusCode, 200);

        String rawTemperature = response.jsonPath().getString("current.temp");
        int temp = (int) Math.round(Double.parseDouble(rawTemperature));
        return temp;
    }
}
