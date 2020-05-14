public class pyramid{
public static void main(String[] args){

int n=6;
for(int i=1;i<=n;i++)
{
for(int j=n-1;j>=i;j--)
{
System.out.printf(" ");
}
for(int k=1;k<=i;k++)
{
System.out.printf(" * ");
}
System.out.printf(" \n ");
}
}
}
