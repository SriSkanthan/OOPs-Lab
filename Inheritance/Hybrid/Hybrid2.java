interface Sensor {
    void detectMotion();
}

interface Connectivity {
    void connectToNetwork();
}

class Device {
    protected String name;

    public Device(String name) {
        this.name = name;
    }

    public void powerOn() {
        System.out.println(name + " is powered on.");
    }

    public void powerOff() {
        System.out.println(name + " is powered off.");
    }
}

class SmartCamera extends Device implements Sensor, Connectivity {
    private boolean isRecording;

    public SmartCamera(String name) {
        super(name);
        this.isRecording = false;
    }

    public void detectMotion() {
        System.out.println(name + " detected motion!");
        startRecording();
    }

    public void connectToNetwork() {
        System.out.println(name + " connected to security network.");
    }

    public void startRecording() {
        isRecording = true;
        System.out.println(name + " started recording.");
    }

    public void stopRecording() {
        isRecording = false;
        System.out.println(name + " stopped recording.");
    }
}

public class Hybrid2{
    public static void main(String[] args) {
        SmartCamera cam = new SmartCamera("Front Gate Camera");

        cam.powerOn();
        cam.connectToNetwork();
        cam.detectMotion();
        cam.stopRecording();
        cam.powerOff();
    }
}
