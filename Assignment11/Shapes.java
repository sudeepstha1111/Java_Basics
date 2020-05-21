public class Shapes {
	String abc = "Super class Triangle";
	String abb = "Super class square";
	String abd = "Super class rectangle";
	

 void Area() {
		
		System.out.println("This is the area from Super Class");
		
	}


}


//next tab or next class starts


class Triangle extends Shapes {
	
	String abc = "hexagon";

	
	public void Roshan () {
		System.out.println(super.abc);
		
	}
	
	public void common(int num) {
		System.out.println("The num is " +num);
		
	}
	
    public void common(String name) {
		
    	System.out.println("The name is " +name);
	}
	
void Area() {
		
		System.out.println("This the area from sub Class");
		 
	}


	public static void main(String[] args) {
		Triangle obj = new Triangle();
		System.out.println(obj.abc); 
		System.out.println(obj.abb); 
		System.out.println(obj.abd); 
		
		System.out.println("**** USING SUPER KEYWORD******");
		obj.Roshan();
		
		System.out.println("**** METHOD OVERRIDING ******");	
		obj.Area();
		
		System.out.println("******METHOD OVERLOADING******");	
		obj.common("Roshan");
		obj.common(50);
				
		

	}

}

