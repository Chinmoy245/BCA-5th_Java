//Divide with ArithmeticException\
import java.util.Scanner;

class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }

        sc.close();
    }
}
//ArrayIndexOutOfBounds
class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }
    }
}
//User-defined Exception
import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}

class TestAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new AgeException("Age must be 18 or above!");
            }
            System.out.println("Valid age: " + age);
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        sc.close();
    }
}
