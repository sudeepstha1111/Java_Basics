public class four {

public static void main(String[] args) {

int loop = 10;
int num1 = 0;
int num2 = 1;
System.out.print("Fibonacci Series of "+loop+" numbers: ");

        int i=1;
        while(i<=loop)
        {
            System.out.print(num1+" ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }
    }
}
