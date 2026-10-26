public class LightSwitch implements Device {
    boolean on = false;

    public void turnOn() {
        System.out.println("The light is on.");
        on = true;
    }

    public void turnOff() {
        System.out.println("The light is off.");
        on = false;
    }

    public static void main(String[] args) {
        LightSwitch lightSwitch = new LightSwitch();
        lightSwitch.turnOn();
        System.out.println(lightSwitch.on);
        lightSwitch.turnOff();
        System.out.println(lightSwitch.on);

    }
}
