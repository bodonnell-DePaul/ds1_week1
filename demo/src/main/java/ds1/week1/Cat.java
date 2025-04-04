package ds1.week1;



// Implement the interface in another class
public class Cat implements AnimalInterface {
    @Override
    public void speak() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }
}
