

package StudentManagement.Test;

import StudentManagement.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("*********************************************");
        System.out.println("\t\t1.Admission");
        System.out.println("\t\t2.Teacher");
        System.out.println("\t\t4.Advisor");
        System.out.println("\t\t4.Course");
        System.out.print("\t\tPlease select 1 to 4 : ");
        int select = in.nextInt();
        System.out.println("*********************************************");

        if (select == 1) {
            Admission newAdmission1 = new Admission("'Dhanmondi Campus.'", "'Mr. XYZ.'", "'Mis. ABC.'", "'Dhanmondi 32,Dhaka.'", 1643897838, 1884779704, 2016, 2018, "20/10/2000", 1030576498, "Islam", "B+");
            Student admissionStudent1 = new Student("'Md. Jobayed Hossain Rabbi.", newAdmission1);
            admissionStudent1.showAdmissionInfo();

            Department dp1 = new Department("SWE", 35); // department , departmentCode
            Semester sem1 = new Semester("Fall 2019", 193); // semesterName , semesterCode
            Student student1 = new Student(dp1, sem1, 30,2948);
            student1.show();
        } else if (select == 2) {
            Teacher t1 = new Teacher("Mr. Md. Mushfiqur Rahman,", 710001444, "Lecturer", "Software Engineering");
            t1.show();
            Teacher t2 = new Teacher("Mr.ABC", 710001444, "Lecturer", "Software Engineering");
            t2.show();
        } else if (select == 3) {
            Advisor adv1 = new Advisor("Mr. Md Fahad Bin Zamal", 710001739, "fahad.swe@diu.edu.bd", 01714410672);
            adv1.show();
        } else if (select == 4) {
            Course c1 = new Course("SE-313", "Software Quality Assurance & Testing Lab", 1, "B-CC", "Ms. Syeda Sumbul Hossain");
            Course c2 = new Course("SE-312", "Software Quality Assurance & Testing", 3, "B-CC", "Ms. Syeda Sumbul Hossain");
            Course c3 = new Course("SE-311", "Design Pattern", 3, "B-CC", "Mr. Md. Mushfiqur Rahman");
            Course c4 = new Course("SE-225", "Data Communication and Computer Networking Lab", 1, "B-CC", "Ms. Afsana Begum");
            Course c5 = new Course("SE-226", "Data Communication and Computer Networking", 3, "B-CC", "Data Communication and Computer Networking Lab");
            System.out.println("\n   ----------------------************Course Information************----------------------");
            c1.show();
            c2.show();
            c3.show();
            c4.show();
            c5.show();
        }else{
            System.out.println("Sorry! Please try again!");
        }

    }
}
