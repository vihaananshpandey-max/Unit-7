public class Plant {
    int age;
    int height;
    String color;

    Plant(int age, int height, String color) {
        this.age = age;
        this.height = height;
        this.color = color;
    }

    void photosynthesize() {
        System.out.println("The " + color + " plant is photosynthesizing.");
    }

    void drinkWater() {
        System.out.println("The " + color + " plant is drinking water.");
    }

}