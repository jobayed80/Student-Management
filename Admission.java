
package StudentManagement;


public class Admission {
    private String campus;
    private String fatherName;
    private String motherName;
    private String address;
    private long contact;
    private long fatherContact;
    private int sscYear;
    private int hscYear;
    private String dateOfBirth;
    private int NID;
    private String religion;
    private String bloodGroup;
    
    public Admission(){};
    public Admission(String campus, String fatherName, String motherName, String address, long contact, long fatherContact, int sscYear, int hscYear, String dateOfBirth, int NID, String religion, String bloodGroup) {
        this.campus = campus;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.address = address;
        this.contact = contact;
        this.fatherContact = fatherContact;
        this.sscYear = sscYear;
        this.hscYear = hscYear;
        this.dateOfBirth = dateOfBirth;
        this.NID = NID;
        this.religion = religion;
        this.bloodGroup = bloodGroup;
    }

    
    
    
    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public long getFatherContact() {
        return fatherContact;
    }

    public void setFatherContact(long fatherContact) {
        this.fatherContact = fatherContact;
    }

    public int getSscYear() {
        return sscYear;
    }

    public void setSscYear(int sscYear) {
        this.sscYear = sscYear;
    }

    public int getHscYear() {
        return hscYear;
    }

    public void setHscYear(int hscYear) {
        this.hscYear = hscYear;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getNID() {
        return NID;
    }

    public void setNID(int NID) {
        this.NID = NID;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
    
    public void show(){
        System.out.print("   Campus: "+campus);
        System.out.println("   Father Name: "+fatherName);
        System.out.print("   Mother Name: "+motherName);
        System.out.print("   Address: "+address);
        System.out.println("   Contact: "+contact);
        System.out.print("   Father Contact : "+fatherContact);
        System.out.print("   SSC Year : "+sscYear);
        System.out.println("   HSC Year : "+hscYear);
        System.out.print("   Date of Birth : "+dateOfBirth);
        System.out.print("   NID : "+NID);
        System.out.print("   Religion : "+religion);
        System.out.println("   Blood Group : "+bloodGroup);

    }
    
    
    
}
