//person ---> teacher
class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String subject;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Rahul";
        t.age = 40;
        t.subject = "Math";
        t.salary = 50000;
        t.display();
    }
}

//Constructor Chaining (Person → Employee → Manager)
class Person {
    Person() {
        System.out.println("Person constructor");
    }
}

class Employee extends Person {
    Employee() {
        super();
        System.out.println("Employee constructor");
    }
}

class Manager extends Employee {
    Manager() {
        super();
        System.out.println("Manager constructor");
    }

    public static void main(String[] args) {
        Manager m = new Manager();
    }
}

// Animal sounds (Method Overriding)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}

class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}
