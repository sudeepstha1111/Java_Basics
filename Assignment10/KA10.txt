public class Office {
	String department ;
	String employee;
	String officeSupplies;
	String Headquarters;

public String getDepartments () {
	return departments;
}

public void setDepartments (String department) {
	this.departments = departments;
}

public String getEmployee () {
	return employee;
}

public void setEmployee (String employee){
	this.employee = employee;
}

Public String getOfficeSupplies() {
	return officeSupplies;
}

Public void setOfficeSupplies(String officeSupplies) {
	this.officeSupplies = officeSupplies;
}
public String getHeadquarterrs() {
	return headquarters;
}

public void setHeadquarters (String headquarters){
	this.headquarters = headquarters;
}
 Public Office (String departments, String employee, String officeSupplies,String headquarter){
	this.departments = departments;
	this.employee = employee;
	this.officeSupplies = officeSupplies;
	this.headquarters = headquarters;
}


public Office {
public static void main(Strings[]args);
System.out.println(world.department);
System.out.println(world.employee);
System.out.println (world.officeSupplies);
System.out.println (world.headquarters);

System.out.println("****** ToString Method ****");

System.out.println(world.toString());

myOffice world = new My Office();

world.setDepartments("Internal Tools");
world.setEmployee("Jason");
world.setOfficeSupplies("Mouse");
world.setHeadquarters("Las Vegas");

System.out.println (********* printing setting values ******");

System.out.println (world.departments);
System.out.println (world.employee);
System.out.println (world.officeSupplies);
System.out.println (world.headquarters);


System.out.println(***** getting values using getters******);

System.out.println(world.getDepartment));
System.out.println(world.getEmployee());
System.out.println(world.getOfficeSupplies());
System.out.println(world.getHeadquarters());

}

@Override
public String toString(){
	return "Office[departments = "+ departments + ", employee=" + ", officeSupplies=" + officeSupplies
			+ ", headquarters =" + headquarters + "]";
}



	End
