package demo;
import java.util.Scanner;
public class ArithmeticCalculator {
	  public static void main(String[] args) {

	    char operator;
	    
	    //Stores numbers in the memory or location
	    Double num1, num2, output;
	    
	    //Take input from users
	    Scanner input = new Scanner(System.in);
	    
	    // Ask users to enter operator
	    System.out.println("Choose the operator to perform: +, -, *, or /");
	    operator = input.next().charAt(0);

	    // Ask users to enter numbers
	    System.out.println("Enter the first number: ");
	    num1 = input.nextDouble();

	    System.out.println("Enter the second number: ");
	    num2 = input.nextDouble();

	    switch (operator) {

	      // performs addition of numbers operation
	      case '+':
	        output= num1 + num2;
	        System.out.println("The output is " + output);
	        break;

	      // performs subtraction of numbers operation
	      case '-':
	    	output = num1 - num2;
	        System.out.println("The output is " + output);
	        break;

	      // performs multiplication of numbers operation
	      case '*':
	    	output = num1 * num2;
	        System.out.println("The output is " + output);
	        break;

	      // performs division of numbers operation
	      case '/':
	    	output = num1 / num2;
	        System.out.println("The output is " + output);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	  }
	}