abstract class SmartDevice {
    String deviceName;

    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    abstract void turnOn();

    void turnOff() {
        System.out.println(deviceName + " is now OFF.");
    }
}

class SmartLight extends SmartDevice {
    SmartLight(String deviceName) {
        super(deviceName);
    }

    void turnOn() {
        System.out.println(deviceName + " is now ON. Brightness set to 75%.");
    }
}

class SmartFan extends SmartDevice {
    SmartFan(String deviceName) {
        super(deviceName);
    }

    void turnOn() {
        System.out.println(deviceName + " is now ON. Speed set to medium.");
    }
}

class SmartThermostat extends SmartDevice {
    SmartThermostat(String deviceName) {
        super(deviceName);
    }

    void turnOn() {
        System.out.println(deviceName + " is now ON. Temperature set to 72°F.");
    }
}

public class abs4{
    public static void main(String[] args) {
        SmartDevice light = new SmartLight("Living Room Light");
        light.turnOn();
        light.turnOff();

        SmartDevice fan = new SmartFan("Bedroom Fan");
        fan.turnOn();
        fan.turnOff();

        SmartDevice thermostat = new SmartThermostat("Hallway Thermostat");
        thermostat.turnOn();
        thermostat.turnOff();
    }
}
