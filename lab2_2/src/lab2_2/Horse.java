package lab2_2;


public class Horse extends Animal{
    public Horse(String food, String location){
        super(food, location);
    }

    private double Speed;

    @Override
    public void makeNoise() {
        System.out.println("������-��!");
    }

    @Override
    public void Eat() {
        System.out.println("������ ��� " + this.getFood());
    }
}