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

