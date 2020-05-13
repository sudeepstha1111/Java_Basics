class MethodDemo{


public static void main(String [] args){

System.out.println("This is inside Main method");
testMethod();
int sum = testMethod2();
System.out.println("The sum is : "+ sum);


}

public static void testMethod(){

System.out.println("This is inside Main testMethod");
}

public static int testMethod2(){

int a = 5;
int b = 6;
int result = a+b;

return result;
}





}
