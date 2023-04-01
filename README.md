# Selenium Test

## Writer: Alfredo Polanco
Software QA Engineer

The goal of this repo is to accomplish the following task
1. Open Google homepage using Selenium
2. Enter the search "Weather in a selected location" in the search bar
3. Submit the search and wait for the results page to load
4. Extract the Temperature in the selected location from the results and store the value in an object
5. Make a call to the OpenWeatherMap API to retrieve weather data for the same specific location and deserialize the result into an object
6. Print the temperature difference between the results in 4 and 5

Resources: https://openweathermap.org/api

# Tech Stack

* [Java.](https://www.java.com/en/)
* [TestNG.](https://testng.org/doc/)
* [RestAssured.](https://rest-assured.io/)

# Before installing

* Java must be installed in order to run the project.


# Notice!
You must have your own API_KEY in order to be able to run the code, once you have the API_KEY just replaced it and paste it on the file `OpenWeatherMapAPI.java`.

# Installation

* Clone the repository from Github.
```bash
git clone https://github.com/AlfredPolanco/SeleniumTest.git
```
* Install the Maven dependencies

## Run Locally

Go to `src/main/java/Automation/testcases` and run `WeatherTest`

Once it is done, it will output the Google Weather Temp and OpenWeatherMapAPI temperatures and its difference between the two results.
