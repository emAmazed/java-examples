import java.util.Scanner;

public class SimpleCalculator1
{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		System.out.print("Please Enter a numeric number: ");
		Integer i = c.nextInt();
		System.out.print("Please enter another number: ");
		Integer j = c.nextInt();
		i = i + j;
		System.out.println("The result is: " + i);
	}
}
