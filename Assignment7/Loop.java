import java.util.Scanner;

public class Loop {
	public static void main(String[]args) {
		int sum =0;
		int mul=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=input.nextInt();
		
		for (int i=1; i<=n; i++) {
			int m=n%10;
			sum=sum+m;
			mul= mul*m;
			n=n/10;
			
		}
		System.out.println(sum);
		System.out.println(mul);
	}

}
