import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int[] marks = new int[4];

    Student(String name, int rollNo, int m1, int m2, int m3,int m4
    ) {
        this.name = name;
        this.rollNo = rollNo;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
        marks[3] = m4;
    }

    int getTotal() {
        return marks[0] + marks[1] + marks[2] + marks[3];
    }

    double getPercentage() {
        return getTotal() / 3.0;
    }

    String getGrade() {
        double percentage = getPercentage();

        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 70) {
            return "A";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else if (percentage >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    void display() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);

        System.out.println("Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Total Marks: " + getTotal());
        System.out.println("Percentage: " + getPercentage() + "%");
        System.out.println("Grade: " + getGrade());

        if (getGrade().equals("F")) {
            System.out.println("Result: Fail");
        } else {
            System.out.println("Result: Pass");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = input.nextInt();

        System.out.print("Enter marks of English: ");
        int english = input.nextInt();

        System.out.print("Enter marks of Computer: ");
        int computer = input.nextInt();

        System.out.print("Enter marks of Mathematics: ");
        int mathematics = input.nextInt();

        System.out.print("Enter marks of islamiyat: ");
        int islamiyat = input.nextInt();


        Student student = new Student(
                name,
                rollNo,
                english,
                computer,
                mathematics,
                islamiyat


        );

        student.display();

        System.out.println("\n===== Additional Information =====");

        if (student.getPercentage() >= 80) {
            System.out.println("Excellent performance!");
        } else if (student.getPercentage() >= 60) {
            System.out.println("Good performance!");
        } else if (student.getPercentage() >= 40) {
            System.out.println("You passed, keep improving!");
        } else {
            System.out.println("You need more practice.");
        }

        System.out.println("\nProgram completed successfully!");

        input.close();
    }
}