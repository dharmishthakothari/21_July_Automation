package first;

import java.util.Scanner;

public class MultipleCondition_12_sep {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter user age ");
	//int - non decimal 
	//float - decimal values
	int age = scan.nextInt();
	if(age>=0 && age<18)
	{
		if(age>=0 && age<=2)
		{
			System.out.println("Infant");
		}
		else
			System.out.println("User is Minor");
	}
	else if(age>=18 && age<=50)
	{
		System.out.println("User is Adult ");
	}else if(age>=51 && age<=70)
	{
		System.out.println("User is senoir");	
	}else if(age>=71)
	{
		System.out.println("User is super senior");
	}else
	{
		System.out.println("Age is invalid");
	}
			
}
}
