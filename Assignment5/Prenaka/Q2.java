import java.util.Scanner;
public class Q2{

public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.println("Enter Principal Amount:");
double P=input.nextDouble();
System.out.println("Enter Rate Amount:");
double R=input.nextDouble();
System.out.println("Enter Time Period:");
double T=input.nextDouble();

double I=P*T*R/100;

System.out.println("Simple Interest:"+I);
}
}
