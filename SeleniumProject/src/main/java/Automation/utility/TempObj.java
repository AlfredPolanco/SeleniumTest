package Automation.utility;

public class TempObj {
    public int googleTemp;
    public int openWeatherMapAPi;

    public TempObj(int googleTemp, int openWeatherMapAPi) {
        this.googleTemp = googleTemp;
        this.openWeatherMapAPi = openWeatherMapAPi;
    }
    public int getGoogleTemp() {
        return googleTemp;
    }
    public void setGoogleTemp(int googleTemp) {
        this.googleTemp = googleTemp;
    }
    public int getOpenWeatherMapAPi() {
        return openWeatherMapAPi;
    }

    public void set0penWeatherMapAPi(int openWeatherMapAPi) {
        this.openWeatherMapAPi = openWeatherMapAPi;
    }

    public String tempDiff() {
        int temperatureDiff = googleTemp - openWeatherMapAPi;
        String result = "The difference between temperatures is: " + temperatureDiff;
        return result;
    }
}
