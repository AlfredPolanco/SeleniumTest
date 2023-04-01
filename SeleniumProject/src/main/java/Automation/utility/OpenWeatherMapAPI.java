package Automation.utility;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;
public class OpenWeatherMapAPI {
    public int getAPIData() {
//      37.76249601685431, -122.42112731919765 San Francisco, California latitude & longitude
        String apiKey = "Add_API_KEY";
        String baseURL = "https://api.openweathermap.org/data/3.0/onecall?";
        String latitude = "37.76249601685431";
        String longitude = "-122.42112731919765";
        Response response = RestAssured.get(baseURL+"lat="+latitude+"&lon="+longitude+"&units=metric&appid="+apiKey);
        int statusCode = response.getStatusCode();
        assertEquals(statusCode, 200);

        String rawTemperature = response.jsonPath().getString("current.temp");
        int temp = (int) Math.round(Double.parseDouble(rawTemperature));
        return temp;
    }
}
