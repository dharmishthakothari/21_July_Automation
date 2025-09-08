package first;

class TestMath
{
	public void addition(int number1,int number2)
	{
		System.out.println(number1+number2);
	}
	public void addition(int number1,int number2,int number3)
	{
		System.out.println(number1+number2+number3);
	}
}

public class methodOverloading {
	public static void main(String[] args) {
		TestMath obj=new TestMath();
		obj.addition(12,345345);
		obj.addition(234,23423,6778);
		
	}

}
