

public class Departments {

	String accounting  ;
	String finance ; 
	String HR ; 
    String IT;
    
    
	public String getAccounting() {
		return accounting;
	}

	public void setAccounting(String accounting) {
		this.accounting = accounting;
	}

	public String getFinance() {
		return finance;
	}

	public void setFinance(String finance) {
		this.finance = finance;
	}

	public String getHR() {
		return HR;
	}

	public void setHR(String hR) {
		HR = hR;
	}

	public String getIT() {
		return IT;
	}

	public void setIT(String iT) {
		IT = iT;
	}

	public Departments() {
		
	}

	public Departments(String accounting, String finance, String HR, String IT) {
	
		this.accounting = accounting;
		this.finance = finance;
		this.HR = HR;
	    this.IT = IT;
	}
	
	// method called printDepartment which prints the different department

	public static void printDepartment(String accounting, String finance, String HR, String IT) {
		
		System.out.println (accounting + " ** "+ finance + " ** "+ HR + " ** "+ IT );
	}
	
	
	public static void main(String[] args) {
		Departments worlda  = new Departments("first Floor","second Floor","third Floor","fourth Floor");
        System.out.println(worlda.accounting);
        System.out.println(worlda.finance);
        System.out.println(worlda.HR);
        System.out.println(worlda.IT); 
        
        
        Departments worldb = new Departments();
		
 		worldb.setAccounting("Raj");
 		worldb.setFinance("Umang");
 		worldb.setHR("Kia");
 		worldb.setIT("Nicole");
		
 		System.out.println("************Printing Setting Values ********");
 		
		System.out.println(worldb.accounting); 
		System.out.println(worldb.finance);
		System.out.println(worldb.HR);
		System.out.println(worldb.IT);
		
		System.out.println("************getting values using getters ********");
		System.out.println(worldb.getAccounting()); 
		System.out.println(worldb.getFinance());
		System.out.println(worldb.getHR());
		System.out.println(worldb.getIT());
		
		printDepartment("Buidldingone", "Buildingtwo", "Buildingthree", "Buildingfour");
	}
	
	
	
	

}

