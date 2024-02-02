import java.util.Scanner;
public class Day2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Menu:-");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Assignment Operator");
            System.out.println("6. Logical Operator");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    assignment();
                    break;
                case 6:
                    logical();
                    break;
                case 7:
                    System.out.println("Exit!!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number from 1 to 7:-");
            }
        } while (choice != 7);
        
        scanner.close();
    }
    
    public static void addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number:- ");
        double num2 = scanner.nextDouble();
        
        double result = num1 + num2;
        System.out.println("Result:- " + result);
    }
    
    public static void subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number:- ");
        double num2 = scanner.nextDouble();
        
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }
    
    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number:- ");
        double num2 = scanner.nextDouble();
        
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }
    
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator:- ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter denominator:- ");
        double denominator = scanner.nextDouble();
        
        if (denominator == 0) {
            System.out.println("Error!! Division by zero not posiible!!.");
        } else {
            double result = numerator / denominator;
            System.out.println("Result:- " + result);
        }
    }
    
    public static void assignment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int number = scanner.nextInt();
        
        number += 10; // Example of using the assignment operator
        
        System.out.println("Result:- " + number);
    }
    
    public static void logical() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a boolean value for 'x' (true/false):- ");
        boolean x = scanner.nextBoolean();
        System.out.print("Enter a boolean value for 'y' (true/false):- ");
        boolean y = scanner.nextBoolean();
        
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT
    }
}
