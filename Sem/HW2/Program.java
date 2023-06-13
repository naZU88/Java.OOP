package HW2;

public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(5);
        plate.info();
        cat.eat(plate);
        cat.eat(plate);
        plate.setFood(plate.getFood() - cat.getAppetite());
    }
}
