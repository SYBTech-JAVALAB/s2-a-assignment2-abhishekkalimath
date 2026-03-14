import java.util.Scanner;

public class Student {

    String name;
    int id;
    int marks;
    String grade;
    final String course = "AIDS";
    static int count = 0;

    Student(Scanner sc) {
        sc.nextLine(); 
        System.out.print("Enter your name: ");
        this.name = sc.nextLine();

        System.out.print("Enter your id: ");
        this.id = sc.nextInt();

        System.out.print("Enter your marks: ");
        this.marks = sc.nextInt();

        System.out.print("Enter your grade: ");
        this.grade = sc.next();

        count++;
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student(sc);
        Student s2 = new Student(sc);

        s1.display();
        s2.display();

        System.out.println("\nTotal Students: " + count);

        sc.close();
    }
}
