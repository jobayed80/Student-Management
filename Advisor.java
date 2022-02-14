
package StudentManagement;


public class Advisor extends Person{
    private String email;
    private Teacher teacher = new Teacher();
    private long contact;

    public Advisor(String name,int id,String email, long contact) {
        this.email = email;
        this.contact = contact;
        this.name = name;
        this.teacher.setID(id);
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void show(){
        System.out.println("\n   ----------------------************Advisor Information************----------------------");
        System.out.print("   Name: "+name);
        System.out.print("   ID: "+teacher.getID());
        System.out.print("   Email: "+email);
        System.out.println(" Mobile no: "+contact);
    }
    
    
    
    
}
