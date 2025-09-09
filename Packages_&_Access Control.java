//User-defined package
// In mathops/Operations.java
package mathops;

public class Operations {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}

import mathops.Operations;

class Main {
    public static void main(String[] args) {
        Operations op = new Operations();
        System.out.println("Sum: " + op.add(5, 3));
        System.out.println("Difference: " + op.subtract(5, 3));
    }
}

//Access Modifiers
class AccessDemo {
    private int a = 10;     
    int b = 20;             
    protected int c = 30;   
    public int d = 40;      
}
//two packages
// package1/A.java
package package1;

public class A {
    public void show() {
        System.out.println("Hello from A");
    }
}
// package2/B.java
package package2;
import package1.A;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
