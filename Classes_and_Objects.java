//Student class with input & display
import java.util.Scanner;

class Student {
    String name;
    int id;
    double marks;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter marks: ");
        marks = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.inputDetails();
        s.displayDetails();
    }
}

//Rectangle class (area & perimeter)

class Rectangle {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
// Temperature Converter
class TemperatureConverter {
    double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        TemperatureConverter t = new TemperatureConverter();
        System.out.println("25°C = " + t.toFahrenheit(25) + "°F");
        System.out.println("77°F = " + t.toCelsius(77) + "°C");
    }
}


