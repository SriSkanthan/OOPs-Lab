package weather;

import java.util.Random;

public class WeatherReport {
    private String[] conditions = {"Sunny", "Cloudy", "Rainy", "Stormy", "Windy"};
    private Random random = new Random();

    public String getWeather(String city) {
        int temp = 20 + random.nextInt(15); // random temp between 20 and 35
        String condition = conditions[random.nextInt(conditions.length)];
        return "Weather in " + city + ": " + condition + ", " + temp + "°C";
    }
}
