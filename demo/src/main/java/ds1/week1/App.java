package ds1.week1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Java
        int x = 10;
        String y = "Hello";
        char c = 'b';

        if(x > 10)
        {

        }
        // Java
        if (x > 5) 
        {
            System.out.println("x is greater than 5");
        } 
        else 
        {
                            System.out.println("x is 5 or less");
        }

        // Java
        //locked to be a length of 4
        int[] myArray = {1,2,4,4};


        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        // Java
        try 
        {
            int result = 10 / 0;
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Cannot divide by zero");
        }

        // Java


        try 
        {

            String content = new String(Files.readAllBytes(Paths.get("file.txt")));
        } 
        catch (IOException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        Dog[] myZoo = {new Dog(), new Dog(), new Dog()};
        AnimalInterface dog = new Dog();
        AnimalInterface cat = new Cat();

        dog.speak();
        dog.eat();

        cat.speak();
        cat.eat();

        System.out.println( "Hello World!" );

    }
}


