package studentmanagement;

public class Student {

    private int id;
    private String name;
    private String department;
    private double cgpa;

    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        setCgpa(cgpa);
         System.out.println("Student Added Successfully");
    }

    public boolean setCgpa(double cgpa) {
        if (cgpa >= 0.00 && cgpa <=10.00) {
            this.cgpa = cgpa;
            
             return true;
          
        } else {
            System.out.println("Invalid Cgpa ");
            return false;
        }
    }

    public int getId() {
        return this.id;

    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getCgpa() {
        return this.cgpa;
    }

    public String getAcademicStanding() {
        if (getCgpa() >= 8.5) {
            return "Distinction";
        } else if (getCgpa() >= 7.0) {
            return "First Class";
        } else if (getCgpa() >= 5.0) {
            return "Pass";
        } else {
            return "Need Improvement";
        }
    }

    public void displayStudent(){

        System.out.println("Student Id: "+id);
        System.out.println("Student Name Is: "+name);
        System.out.println("Department: "+department);
        System.out.printf("Over All Cgpa: %.2f%n",cgpa);
        System.out.println("Academic Standing: "+getAcademicStanding());
    }
}
