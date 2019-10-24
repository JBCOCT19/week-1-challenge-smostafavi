import javax.swing.*;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        /*Complete the following program. Use the Scanner class to read the following string into variables. Input String:
         "P Sherman 42 Wallaby Way Sydney" Variables: firstInitial,lastName, houseNumber,streetName,streetType,city*/

        String myAnswer = keyboard.next();
       System.out.println(myAnswer);
               String firstInitial = "P";
        String lastName = "Sherman";
        String streetName = "wallaby ";
        String houseNumber = "42";
        String streetType = "way";
        String city = "Sydney";
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);


     /*Application takes 2 integer values and finds the largest one. Change the application
    so that it finds the average of two double values.*/

         int num1;

        System.out.println(num1);

        num1 = keyboard.nextInt();
        int num2;
        System.out.println(num2) ;
        num2 = keyboard.nextInt();
        System.out.println("num1");
        System.out.println("num2");

        if (num1 > num2) {

            System.out.println("num2");

        } else {
            System.out.println("num1");
            int sum = num1 + num2;
            System.out.println("Sum");
            System.out.println(sum / 2);



            String name;
            String breed;
            int age;

            System.out.print( "Greetings. What is your pet's name? " );
            name = keyboard.next();

            System.out.print( "What kind of animal is " + name + "? " );
            breed  = keyboard.next();

            System.out.print( "How old is " + breed + "? ");
              age = keyboard.nextInt();
            System.out.println( name + " is your " + breed + " and it is " + age );
        }
    }


}
