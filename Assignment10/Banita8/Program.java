public class Program {
    public static void main(String[] args) {
        Office office= new Office(new Department("Accounting","Finance","IT","HR"));
        Department department= office.getDepartment();
        System.out.println(department.accounting);
        System.out.println(department.finance);
        System.out.println(department.HR);
        System.out.println(department.InformationTech);
        System.out.println(office.toString());
        System.out.println("********");

Employee employee= new Employee();
employee.setFirstname("Jack");
employee.setLastname("Smith");
employee.setAddress("USA");
employee.setId(001);
System.out.println(employee.getAddress());
System.out.println(employee.getFirstname());
System.out.println(employee.getLastname());
System.out.println(employee.getId());
System.out.println(employee.getDesignation());
employee.employeeDesignmation();
System.out.println("*******");

Officesupplies supplies1= new Officesupplies( "Pen", "Pencil", "Table", "Chair");
System.out.println(supplies1.toString());
supplies1.getOfficesupplies(supplies1.getComputer());
Officesupplies supplies2= new Officesupplies();
supplies2.setMonitors("Lenovo");
supplies2.getOfficesupplies(supplies2.getMonitors());
System.out.println("*********");

Office office2= new Office();
office2.setDepartment(department);
office2.setEmployee(employee);
office2.setOfficeSupplies(supplies1);
System.out.println(office2.toString());
    }
}
