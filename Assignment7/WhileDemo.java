class WhileDemo{

public static void main(String [] args){

int num = 10;

while(num>=1){ // num == 10 , 10 > 1 = true  , 2nd run: num 9 > 1 true ... 0 > 1 false ; num = 10 - 9= 1 >=1 

 System.out.println("This is While loop : "+ num);  // This is While loop : 10
 num = num - 9;   // num - 1 ; 10 -1 = 9 
}

 System.out.println("***********************************************");
}

}

