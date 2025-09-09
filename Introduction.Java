//Introduction to Java
import java.util.Scanner;

class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks in subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks in subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks in subject 3: ");
        int m3 = sc.nextInt();

        
        int total = m1 + m2 + m3;
        double average = total / 3.0;

        
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        sc.close();
    }
}
//Arithmetic operations with switch-case

import java.util.Scanner;

class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Choose operation: 1.Add  2.Subtract  3.Multiply  4.Divide");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result = " + (a + b)); break;
            case 2: System.out.println("Result = " + (a - b)); break;
            case 3: System.out.println("Result = " + (a * b)); break;
            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Error: Division by zero!");
                break;
            default: System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

//Check even or odd (if-else)
import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

        sc.close();
    }
}
