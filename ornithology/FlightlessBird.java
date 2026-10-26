public class FlightlessBird extends Bird {

    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }

    public static void main(String[] args) {
        Bird crow = new Bird();
        FlightlessBird penguin = new FlightlessBird();
        crow.fly();
        penguin.fly();
    }
}
