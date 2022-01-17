package AsistanceProject;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		double number1, number2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Two Numbers:");
		number1 = scan.nextDouble();
		number2 = scan.nextDouble();
		System.out.println("Enter the Operator(+, -, *, /)");
		
		char operator =scan.next().charAt(0);
		double op = 0;
		switch(operator)
		{
		case'+':
			op= number1 + number2;
			break;
			
		case'-':
			op= number1 - number2;
			break;
			
		case'*':
			op= number1 * number2;
			break;
			
		case'/':
			op= number1 / number2;
			break;
		default:
			System.out.println("invalid");
			break;
		}
		System.out.println("The Final Result:");
		System.out.println();
		
		System.out.println(number1 + " " +operator +  " " + number2 + " =" +op);
		
		
		// TODO Auto-generated method stub

	}

}
