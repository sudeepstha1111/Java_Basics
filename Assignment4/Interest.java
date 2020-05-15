

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a:");
		int a =input.nextInt();
		System.out.println("Enter b:");
		int b=input.nextInt();
		
		if (a>b) {
			System.out.println("a is greater than b");
		}else if (a<b) {
			System.out.println("a is smaller than b");
		}else {
			System.out.println("a equal to b");
		}
	}

}
