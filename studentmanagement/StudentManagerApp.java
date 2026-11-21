package studentmanagement;

import java.util.Scanner;

public class StudentManagerApp {
    public static void main(String[] args) {
        Student[] students = new Student[50];
        int studentCount = 0;
        Scanner input = new Scanner(System.in);

        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println(
                    "Select The Option From Menu: 1.Add Student\n2.View All Student\n3.Search By Id\n4.Update CGPA\n5.Exit");
            String inputOption = input.next();
            switch (inputOption) {
                case "5": {
                    System.out.println("GoodBye");
                    keepRunning = false;
                    break;
                }

                case "1": {
                    if (studentCount < students.length) {
                        System.out.println("Enter The Student Id: ");
                        int id = input.nextInt();
                        input.nextLine();
                        System.out.println("Enter The Student Name: ");
                        String name = input.nextLine();
                        System.out.println("Enter The Student Department: ");
                        String department = input.nextLine();

                        System.out.println("Enter The Student CGPA: ");

                        double cgpa = input.nextDouble();
                        students[studentCount] = new Student(id, name, department, cgpa);
                        studentCount++;

                    } else {
                        System.out.println("Storage Full");
                    }
                    break;
                }
                case "2": {
                    if (studentCount == 0) {
                        System.out.println("No Records Found");
                    } else {
                        for (int i = 0; i < studentCount; i++) {
                            students[i].displayStudent();
                        }
                        System.out.println("End Of The Record ");

                    }
                    break;

                }
                case "3": {
                    System.out.println("Enter The Student Id: ");
                    int id = input.nextInt();
                    input.nextLine();
                    boolean found = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (id == students[i].getId()) {
                            System.out.println("Student Id  Found: ");
                            students[i].displayStudent();
                            found = true;
                            break;

                        }
                    }
                    if (!found) {

                        System.out.println("Student Id  Not Found");
                    }

                    break;
                }
                case "4": {
                    System.out.println("Enter The Student Id: ");
                    int id = input.nextInt();
                    input.nextLine();
                    boolean found = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (id == students[i].getId()) {

                            System.out.println("Id Match Found: ");
                            System.out.println("Enter The Cgpa");
                            double cgpa = input.nextDouble();
                            input.nextLine();
                          if(  students[i].setCgpa(cgpa)){
                             System.out.println("CGPA Updation Successfull");
                          }
                            found = true;
                            break;

                        }
                    }
                    if (!found) {

                        System.out.println("Id Match Not Found");
                    }
                    break;

                }

                default: {
                    System.out.println("Invalid Option");
                    break;
                }
            }

        }

    }
}