package JavaBasics;

public class AbstractCompany extends AbstractBuilding {

	

	@Override
	public void floor() {
		System.out.println("I work at 8th floor");
		
	}

	@Override
	public void Room() {
		
		System.out.println("I work Inside IT room");
	}

	@Override
	public void Building() {
		System.out.println("I work in Building 145");
		
	}
	
	public void Travel(){
		System.out.println("I Travel to work by Amtrack");
	}
	
public static void main(String[] args) {
	AbstractBuilding roshan = new AbstractCompany();
	roshan.Travel();
	roshan.Building();
	roshan.floor();
	roshan.Room();
	

	}

}

