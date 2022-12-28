package lab2_2;

public class Cat extends Animal{
    public Cat(String food, String location){
        super(food, location);
    }

    private double timeOfSleep;

    @Override
    public void makeNoise() {
        System.out.println("ּÿÿף!");
    }

    @Override
    public void Eat() {
        System.out.println("Êמע וסע " + this.getFood());
    }
}