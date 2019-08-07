import java.util.Scanner;

public class ifScanner {
    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Number :" );
        int number = scanner.nextInt ();

        if (number % 6 == 0)
            System.out.println ("Fizz");
        else if( number % 4 == 0)
            System.out.println ("Buzz");
        else if (number == 6 && number % 4 == 0)
            System.out.println ("FizzBuzz");
        else
            System.out.println (number);



    }
}