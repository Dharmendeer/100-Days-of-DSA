import java.util.Scanner;
public class Day3{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your grade (A, B, C, D, or F): ");
    char grade = scanner.next().charAt(0);

    if (grade == 'A' || grade == 'a') {
        System.out.println("Excellent! Keep up the good work.");
    } else if (grade == 'B' || grade == 'b') {
        System.out.println("Good job! You're doing well.");
    } else if (grade == 'C' || grade == 'c') {
        System.out.println("Not bad! Room for improvement.");
    } else if (grade == 'D' || grade == 'd') {
        System.out.println("You need to work harder.");
    } else if (grade == 'F' || grade == 'f') {
        System.out.println("Oops! You failed. Time to hit the books.");
    } else {
        System.out.println("Invalid grade entered. Please enter A, B, C, D, or F.");
    }

    scanner.close();
}
}
