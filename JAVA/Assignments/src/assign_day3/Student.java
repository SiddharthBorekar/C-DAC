package assign_day3;
import java.util.Scanner;

class Student {
    String name;
    int rollno;
    int age;
    int score;

    // Method to accept data
    void getData(Scanner s) {
        System.out.println("Enter Name:");
        name = s.next();

        System.out.println("Enter Roll No:");
        rollno = s.nextInt();

        System.out.println("Enter Age:");
        age = s.nextInt();

        System.out.println("Enter Score:");
        score = s.nextInt();
    }

    // Method to display
    void display() {
        System.out.println(name + " " + rollno + " " + age + " " + score);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Student[] st = new Student[10];

        // Input 10 students
        for (int i = 0; i < 10; i++) {
            st[i] = new Student();
            st[i].getData(s);
        }

        // Group 0-50
        System.out.println("\nGroup 0-50:");
        for (int i = 0; i < 10; i++) {
            if (st[i].score <= 50) {
                st[i].display();
            }
        }

        // Group 51-65
        System.out.println("\nGroup 51-65:");
        for (int i = 0; i < 10; i++) {
            if (st[i].score > 50 && st[i].score <= 65) {
                st[i].display();
            }
        }

        // Group 66-80
        System.out.println("\nGroup 66-80:");
        for (int i = 0; i < 10; i++) {
            if (st[i].score > 65 && st[i].score <= 80) {
                st[i].display();
            }
        }

        // Group 81-100
        System.out.println("\nGroup 81-100:");
        for (int i = 0; i < 10; i++) {
            if (st[i].score > 80 && st[i].score <= 100) {
                st[i].display();
            }
        }
    }}