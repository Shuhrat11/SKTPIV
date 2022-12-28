package lab2_2;


public class Horse extends Animal{
    public Horse(String food, String location){
        super(food, location);
    }

    private double Speed;

    @Override
    public void makeNoise() {
        System.out.println("»иииго-го!");
    }

    @Override
    public void Eat() {
        System.out.println("Ћошадь ест " + this.getFood());
    }
}