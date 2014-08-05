import java.util.Scanner;

public class SimpleCalculator2
{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		System.out.print("Please Enter your Formula (Example: 12 x 3 + 4 / 2) \n");
		String s = c.nextLine();
		System.out.println("The result is: " + s);
	}
}
