interface Device {
    void turnOn();
    void turnOff();
}

interface SmartFeature {
    void connectToWiFi();
    void updateSoftware();
}

class SmartDevice implements Device {
    protected String name;

    public SmartDevice(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " is now ON.");
    }

    public void turnOff() {
        System.out.println(name + " is now OFF.");
    }
}

class SmartLight extends SmartDevice implements SmartFeature {
    private int brightness;

    public SmartLight(String name, int brightness) {
        super(name);
        this.brightness = brightness;
    }

    public void adjustBrightness(int level) {
        this.brightness = level;
        System.out.println(name + " brightness set to " + level + "%.");
    }

    public void connectToWiFi() {
        System.out.println(name + " connected to WiFi.");
    }

    public void updateSoftware() {
        System.out.println(name + " software updated.");
    }
}

class SmartThermostat extends SmartDevice implements SmartFeature {
    private int temperature;

    public SmartThermostat(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println(name + " set to " + temp + "°C.");
    }

    public void connectToWiFi() {
        System.out.println(name + " connected to WiFi.");
    }

    public void updateSoftware() {
        System.out.println(name + " software updated.");
    }
}

public class Hybrid1{
    public static void main(String[] args) {
        SmartLight light = new SmartLight("Living Room Light", 75);
        SmartThermostat thermostat = new SmartThermostat("Nest Thermostat", 22);

        light.turnOn();
        light.connectToWiFi();
        light.adjustBrightness(50);
        light.updateSoftware();
        light.turnOff();

        System.out.println();

        thermostat.turnOn();
        thermostat.connectToWiFi();
        thermostat.setTemperature(24);
        thermostat.updateSoftware();
        thermostat.turnOff();
    }
}
