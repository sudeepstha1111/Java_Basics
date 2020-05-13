public class looptwo {

public static void main(String[] args)
 {

int a=0;
int b=1;
int count = 8;
System.out.println("Enter term for fibonacci series");

int i = 1;
 while (i<=count)
        {
System.out.println(a+" ");
        int c =a+b;
         a=b;
         b=c;
         i++;
        }

       
    }
}

