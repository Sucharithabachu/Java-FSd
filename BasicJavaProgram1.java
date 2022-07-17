package demo;
import java.util.Scanner;
public class BasicJavaProgram1 {
	public static void main(String[] args) {
		int num1,num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1=sc.nextInt();
		System.out.println("Enter the second number:");
		num2=sc.nextInt();
		System.out.println("The addition of numbers is:"+ (num1 + num2));
		System.out.println("The subtraction of numbers is:"+ (num1 - num2));
		System.out.println("The multiplication of numbers is:"+ (num1*num2));
		System.out.println("The division of numbers is:"+ (num1/num2));
		System.out.println("The remainder of numbers is:"+ (num1%num2));
			
	}	
}

