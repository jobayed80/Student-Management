/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

/**
 *
 * @author DCL
 */
public class Course {
    private String courseCode;
    private String courseTitle;
    private int credit;
    private String section;
    private String courseTeacher;

    public Course(String courseCode, String courseTitle, int credit, String section, String courseTeacher) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.section = section;
        this.courseTeacher = courseTeacher;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }
    
    public void show(){
        System.out.print("   Course code: "+courseCode);
        System.out.print("   Course Title: "+courseTitle);
        System.out.print("      Credit: "+credit);
        System.out.print("      Section: "+section);
        System.out.println("   Course Teacher: "+courseTeacher);
    }
    
}
