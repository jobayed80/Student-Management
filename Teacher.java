
package StudentManagement;

public class Teacher extends Person{
    
    private int ID;
    private String designation;
    protected Department dept = new Department();

    public Teacher(){};
    public Teacher(String name,int ID, String designation, String dep) {
        this.name = name;
        this.ID = ID;
        this.designation = designation;
        this.dept.setDepartment(dep);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void show(){
        System.out.println("\n   ----------------------************Teacher Information************----------------------");
        System.out.print("   Name: "+name);
        System.out.print("   ID: "+ID);
        System.out.print("   Department: "+dept.getDepartment());
        System.out.println("   Designation: "+designation);
    }
    
}
