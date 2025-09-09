//Abstract class Appliance
abstract class Appliance {
    abstract void start();
}

class Fan extends Appliance {
    void start() {
        System.out.println("Fan starts spinning...");
    }
}

class WashingMachine extends Appliance {
    void start() {
        System.out.println("Washing Machine starts washing...");
    }
}

class TestAppliance {
    public static void main(String[] args) {
        Appliance a1 = new Fan();
        Appliance a2 = new WashingMachine();

        a1.start();
        a2.start();
    }
}
//Encapsulation (BankAccount with Getters & Setters)
class BankAccount {
    private int accNo;
    private double balance;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class TestBank {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccNo(12345);
        b.setBalance(5000);

        System.out.println("Account No: " + b.getAccNo());
        System.out.println("Balance: " + b.getBalance());
    }
}

//Interface Drawable
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class TestDrawable {
    public static void main(String[] args) {
        Drawable d1 = new Circle();
        Drawable d2 = new Square();

        d1.draw();
        d2.draw();
    }
}
