public class MyOffice {
	
	String departments  ;
	String employee ; 
	String officeSupplies ; 
    String headquarters;
    

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getOfficeSupplies() {
		return officeSupplies;
	}

	public void setOfficeSupplies(String officeSupplies) {
		this.officeSupplies = officeSupplies;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public MyOffice(String departments, String employee, String officeSupplies, String headquarters) {
		this.departments = departments;
		this.employee = employee;
		this.officeSupplies = officeSupplies;
	    this.headquarters = headquarters;
	}

	public MyOffice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MyOffice world  = new MyOffice("Software","Roshan","Laptop","New York");
         System.out.println(world.departments);
         System.out.println(world.employee);
         System.out.println(world.officeSupplies);
         System.out.println(world.headquarters); 
         System.out.println("************Tostring Method ********");
 		 System.out.println(world.toString());
 		
 		MyOffice worlda = new MyOffice();
		
 		worlda.setDepartments("Internal Tools");
 		worlda.setEmployee("Jason");
 		worlda.setOfficeSupplies("Mouse");
 		worlda.setHeadquarters("Las Vegas");
		
 		System.out.println("************Printing Setting Values ********");
 		
		System.out.println(worlda.departments); 
		System.out.println(worlda.employee);
		System.out.println(worlda.officeSupplies);
		System.out.println(worlda.headquarters);
		
		System.out.println("************getting values using getters ********");
		System.out.println(worlda.getDepartments()); 
		System.out.println(worlda.getEmployee());
		System.out.println(worlda.getOfficeSupplies());
		System.out.println(worlda.getHeadquarters());
 		
       
	}

	@Override
	public String toString() {
		return "MyOffice [departments=" + departments + ", employee=" + employee + ", officeSupplies=" + officeSupplies
				+ ", headquarters=" + headquarters + "]";
	}

}

