
package StudentManagement;


public class Department {
    private String department;
    private int departmentCode;

    public Department(){};
    
    
    public Department(String department, int departmentCode) {
        this.department = department;
        this.departmentCode = departmentCode;
    }
    public Department(String dep){
        this.department=dep;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }


    public void show(){
        System.out.print("   Department : "+department);
        System.out.println("   Department Code: "+departmentCode);
    }
  
}
