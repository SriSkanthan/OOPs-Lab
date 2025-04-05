import weather.WeatherReport; 

public class pack2{
    public static void main(String[] args) {
        WeatherReport report = new WeatherReport();
        System.out.println(report.getWeather("Coimbatore"));
        System.out.println(report.getWeather("Chennai"));
        System.out.println(report.getWeather("Bangalore"));
    }
}
