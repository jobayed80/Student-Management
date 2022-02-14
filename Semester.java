
package StudentManagement;

public class Semester {
    private String semesterName;
    private int semesterCode;
    

    public Semester(){};

    public Semester(String semesterName, int semesterCode) {
        this.semesterName = semesterName;
        this.semesterCode = semesterCode;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public int getSemesterCode() {
        return semesterCode;
    }

    public void setSemesterCode(int semesterCode) {
        this.semesterCode = semesterCode;
    }

 
    public void show(){
        
        System.out.print("   Semester Name : "+semesterName);
        System.out.println("   Semester Code : "+semesterCode);
    }
    
}
