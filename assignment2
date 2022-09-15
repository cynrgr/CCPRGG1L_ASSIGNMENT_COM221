// import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // // Method call
        // int product = multiply();
        // System.out.println("The product is: " + product);

        // // Method call
        // int quotient = divide();
        // System.out.println("The quotient is: " + quotient);

        // // Method call
        // String crush = revealMyCrush();
        // System.out.println(crush);

        // Method call
        myOrder();

        // Close scanner
        scan.close();
    }

    static int multiply() {
        System.out.println("Please enter two numbers to multiply");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x * y;
    }

    static int divide() {
        System.out.println("Please enter two numbers to divide");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x / y;
    }

    static String revealMyCrush() {
        System.out.println("This will reveal your crush");
        System.out.print("Enter your name: ");

        String name = scan.nextLine();

        System.out.print("Enter the name of your crush: ");

        String nameOfMyCrush = scan.nextLine();

        System.out.print("Enter the name of your crush 2: ");

        String nameOfMyCrush2 = scan.nextLine();

        return name + " likes " + nameOfMyCrush + " and " + nameOfMyCrush2;
    }

        static void myOrder() {
            System.out.println("What are your orders?");
            System.out.print("Enter order 1: ");
            String order1 = scan.nextLine();
            System.out.println("Enter price of order1: ");
            double priceOrder1 = scan.nextDouble();

            scan.nextLine();

            System.out.print("Enter order 2: ");
            String order2 = scan.nextLine();
            System.out.println("Enter price of order2: ");
            double priceOrder2 = scan.nextDouble();

            scan.nextLine();

            System.out.print("Enter order 3: ");
            String order3 = scan.nextLine();
            System.out.println("Enter price of order3: ");
            double priceOrder3 = scan.nextDouble();

            double total = (priceOrder1 + priceOrder2 + priceOrder3);

            System.out.println("Your order are " + order1 + ", " + order2 + ", and " + order3);
            System.out.println("And the total amount is " + total);

        }
        
    }
