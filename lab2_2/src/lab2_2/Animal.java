package lab2_2;

public class Animal {
    private String food;
    private String location;
    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }
    public void makeNoise(){
        System.out.println("�����-�� �������� ����� ����");
    }
    public void Eat(){
        System.out.println("�����-�� �������� ���");
    }
    public void Sleep(){
        System.out.println("�������� ����");
    }
    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}