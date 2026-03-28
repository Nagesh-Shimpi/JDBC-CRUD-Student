package Project_1;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n1.Add 2.View 3.Update 4.Delete 5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    dao.addStudent(new Student(name, email, marks));
                    break;

                case 2:
                    List<Student> list = dao.getAllStudents();
                    for (Student s : list) {
                        System.out.println(s.getId() + " " + s.getName() + " " + s.getEmail() + " " + s.getMarks());
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();

                    dao.updateStudent(id, newMarks);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int deleteId = sc.nextInt();

                    dao.deleteStudent(deleteId);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}