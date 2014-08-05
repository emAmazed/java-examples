import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class SimpleCalculator2
{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		System.out.print("Please Enter your Formula (Example: 12 x 3 + 4 / 2) \n");
		String s = c.nextLine();
		System.out.println("You entered : " + s);

		int answer;
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");

		answer = ((Number)engine.eval( s )).intValue();
		System.out.println("The result is : " + answer);
	}
}
