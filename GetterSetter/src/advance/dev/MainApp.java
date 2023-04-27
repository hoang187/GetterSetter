package advance.dev;
import java.util.Scanner;

import advance.dev.Student;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        // Nhập dữ liệu cho mảng sinh viên
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter student " + (i+1) + " info:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Phone number: ");
            
        }
    }
}