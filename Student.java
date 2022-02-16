
package StudentManagement;


public class Student extends Person{
    
    private String ID;
    private int batch;
    private int serial;
    private Admission admission = new Admission();
    private Semester semester = new Semester();
    private Department department = new Department();

  
    public Student(){};
    public Student(Department dept , Semester sem , int batch, int serial){
        this.department = dept;
        this.semester= sem;
        this.batch= batch;
        this.serial=serial;
        this.ID = getGenerateID();
        
    };
    public Student(String name,Admission newStudent){
        this.name = name;
        this.admission = newStudent;           
    }
    
 
    public String getGenerateID(){
        return ""+department.getDepartmentCode() +"-" +semester.getSemesterCode() +"-"+serial;
    }
    
    @Override
    public void show(){
        System.out.println("\n   ----------------************Department & Semester Information************----------------");
        System.out.print("   ID : "+ID);
        department.show();
        semester.show();
        
    }
    public void showAdmissionInfo(){
        System.out.println("   ----------------------************Admission Information************----------------------");
        System.out.print("   Name : "+name);
        admission.show();
    }
}
