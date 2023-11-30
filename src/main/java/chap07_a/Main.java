package chap07_a;

public class Main
{
	public static void main(String[] args)
	{
		ExeTimeCalculator calculator0 = new ExeTimeCalculator(new ImpeCalculator());
		System.out.println(calculator0.factorial(20));
		
		ExeTimeCalculator calculator1 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(calculator1.factorial(20));
	}
}
