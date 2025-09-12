package first;

import java.util.Scanner;

public class ConditionalStmt_12_sep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int i=1;
		if(i>5)
		{
			System.out.println("i is greater then 5");
		}else
		{
			System.out.println("i is not greater then 5");
		}
		
		System.out.println("outer of if");
		// asking age from user checking if user adult 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Age ");
		int age=scan.nextInt();
		if(age>=18)
		{
			System.out.println("User is Adult");
		}else
		{
			System.out.println("User is not adult ");
		}
		
	}

}
