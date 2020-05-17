public class Offices {

	String departments  ;
	String employee ; 
	String officeSupplies ; 
    String headquarters;


    
    
    //getter and setter
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

	// constructor
	public Offices () {
    	
    }

	public Offices(String departments, String employee, String officeSupplies, String headquarters) {
		this.departments = departments;
		this.employee = employee;
		this.officeSupplies = officeSupplies;
	    this.headquarters = headquarters;
	}

	public static void main(String[] args) {
		
		//object creation
		 Offices obj  = new Offices("Software","Nima","Desktop","New York");
         System.out.println(obj.departments);
         System.out.println(obj.employee);
         System.out.println(obj.officeSupplies);
         System.out.println(obj.headquarters); 
         
         System.out.println("****************To string metod"); 
  		 System.out.println(obj.toString());
  		 
  		Offices obja = new Offices();

		obja.setDepartments("Java");
		obja.setEmployee("Ram");
		obja.setOfficeSupplies("laptop"); 
        obja.setHeadquarters("Nepal");
        
        System.out.println("****************Printing setting value"); 
		System.out.println(obja.departments); 
		System.out.println(obja.employee);
		System.out.println(obja.officeSupplies);
		System.out.println(obja.headquarters);

		 System.out.println("****************Printing Get value"); 
	
		System.out.println(obja.getDepartments()); 
		System.out.println(obja.getEmployee());
		System.out.println(obja.getHeadquarters());
		System.out.println(obja.getOfficeSupplies());
		
  		 
	}
	
	//To string method


	@Override
	public String toString() {
		return "Offices [departments=" + departments + ", employee=" + employee + ", officeSupplies=" + officeSupplies
				+ ", headquarters=" + headquarters + "]";
}
	}


