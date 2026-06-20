import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner num = new Scanner(System.in);
	
		System.out.println("Enter the frist number:");
		double num1 = num.nextDouble();
		
		System.out.println("Enter the second number:");
		double num2 = num.nextDouble();
		
	    System.out.println("Enter the calculation (+,-,*,/):");
	    char operator = num.next().charAt(0);
	    
	    double result =0;
	    
	    switch (operator){
	        case '+':
	           result = num1+num2;
	           break;
	       
	       case '-':
	           result = num1-num2;
	           break;
	           
	       case '*':
	           result = num1*num2;
	           break;
	          
	       case '/':
	           result = num1/num2;
	           break;
	       default :
	       System.out.println("The operation is wrong!");
	    }
	    System.out.println("The result is :"+result);
}
}
