
package lab2_2;

public class Dog extends Animal{
    public Dog(String food, String location){
        super(food, location);
    }

    private String favoriteToy;

    @Override
    public void makeNoise() {
        System.out.println("���!");
    }

    @Override
    public void Eat() {
        System.out.println("������ ��� " + this.getFood());
    }
}