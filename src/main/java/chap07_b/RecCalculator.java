package chap07_b;

public class RecCalculator implements Calculator
{
	@Override
	public long factorial(long num)
	{
		if (0 == num)
			return 1;
		else
			return num * factorial(num - 1);
	}
}
