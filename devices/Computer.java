public class Computer implements Device {
    boolean on2 = false;

    public void turnOn() {
        System.out.println("Hello World!");
        on2 = true;
    }

    public void turnOff() {
        System.out.println("Goodbye World!");
        on2 = false;
    }

    public void type(String message) {
        if (on2)
            System.out.println(message);
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.type("h");
        computer.turnOn();
        computer.type("Hello there!");
        computer.turnOff();
    }
}
