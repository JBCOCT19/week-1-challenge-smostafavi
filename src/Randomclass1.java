import java.util.Random;

public class Randomclass1 {

    public static void main(String[] args) {
        Random r = new Random();
        int Randomnumber = 1 + r.nextInt(250);
        System.out.println("My random number is " + Randomnumber);

        do {
            if (Randomnumber % 2 == 0) ;
            break;
            System.out.println("the number is not a prime number.");


            if (Randomnumber % 3 == 0) ;
            break;
            System.out.println("the number is not a prime number.");

            if (Randomnumber % 5 == 0) ;
            break;
            System.out.println("the number is not a prime number.");

            while (Randomnumber % 2 != 0 || Randomnumber % 3 != 0 || Randomnumber % 5 != 0) {

            }
            System.out.println("the number is a prime number");

            Random r = new Random();

            System.out.println("My random number is " + Randomnumber);


        }
    }
}
