public class CarnivorousPlant extends Plant {
    void eatInsect() {
        System.out.println("The " + color + " carnivorous plant is eating an insect.");
    }

    CarnivorousPlant(int age, int height, String color) {
        super(age, height, color);
    }

    public static void main(String[] args) {
        CarnivorousPlant venusFlyTrap = new CarnivorousPlant(3, 12, "light green");
        venusFlyTrap.drinkWater();
        venusFlyTrap.photosynthesize();
        venusFlyTrap.eatInsect();

    }
}
