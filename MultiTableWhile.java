package first;

import java.util.Scanner;

public class MultiTableWhile {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number ");
		int num=scan.nextInt();
		
		int i=10;
		while(i>=1)
		{
			//System.out.println(num+" * "+i+" = "+num*i);
			System.out.println(num+" * "+i+" = "+num*i);
			
			
			i--;
		}
		
	}

}
