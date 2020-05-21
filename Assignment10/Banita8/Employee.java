public class Employee {
    String firstname;
    String lastname;
    static String designation="CEO";
    int id;
    String address;

    public Employee(){
        super();
    }
    public Employee(String firstname, String lastname,String designation, int id, String address){
        super();
        this.firstname=firstname;
        this.lastname=lastname;
        this.designation=designation;
        this.id=id;
        this.address=address;
    }
    public static void employeeDesignmation() {
System.out.println("Employee Designation is:" + designation);
    }
    public String getDesignation(){
        return designation;
    }

    public static void setDesignation(String designation) {
        designation = designation;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString(){
        return "Employee [firstName=" + firstname+", lastName+" +lastname+", designation=" + designation+", id+"+id+", address="+ address+"]";

    }
}

