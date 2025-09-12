package first;

import java.util.Scanner;

public class NestedIf_12_Sep {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter user age ");
	int age = scan.nextInt();
	
	if(age>=18)
	{
		System.out.println("Enter user weight ");
		int weight = scan.nextInt();
		if(weight>=50)
			System.out.println("User is eligible to donate blood");
		else
			System.out.println("User is not eligible due to underweight");
		//System.out.println("User is not eligible due to underweight  2 ");

	}
	else
		System.out.println("User is not eligible to donate blood");
	
}
}
