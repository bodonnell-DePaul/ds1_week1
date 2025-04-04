package ds1.week1;

// class Dog extends Animal {
//     @Override
//     public void speak() {
//         System.out.println("Dog barks");
//     }    
// }

// Implement the interface in a class
public class Dog implements AnimalInterface {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }
}