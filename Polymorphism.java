
//Method Overloading
class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Int multiply: " + c.multiply(5, 6));
        System.out.println("Double multiply: " + c.multiply(2.5, 4.2));
    }
}
//Runtime Polymorphism (Shape → Circle, Triangle, Rectangle)
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    double area() { return Math.PI * r * r; }
}

class Triangle extends Shape {
    double b, h;
    Triangle(double b, double h) { this.b = b; this.h = h; }
    double area() { return 0.5 * b * h; }
}

class Rectangle extends Shape {
    double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w; }
    double area() { return l * w; }
}

class TestShape {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5);
        System.out.println("Circle Area: " + s.area());

        s = new Triangle(10, 5);
        System.out.println("Triangle Area: " + s.area());

        s = new Rectangle(6, 4);
        System.out.println("Rectangle Area: " + s.area());
    }
}
//instanceof demonstration
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

class TestInstanceof {
    public static void main(String[] args) {
        Animal a = new Dog();

        System.out.println(a instanceof Animal); // true
        System.out.println(a instanceof Dog);    // true
        System.out.println(a instanceof Cat);    // false
    }
}
