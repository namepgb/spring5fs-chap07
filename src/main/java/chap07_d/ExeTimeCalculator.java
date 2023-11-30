package chap07_d;

public class ExeTimeCalculator implements Calculator
{
	private Calculator delegate;
	
	public ExeTimeCalculator(Calculator delegate)
	{
		this.delegate = delegate;
	}
	
	@Override
	public long factorial(long num)
	{
		long start = System.nanoTime();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
		System.out.printf("ExeTimeCalculator.%s.factorial(%d) 실행 시간 = %d\n",
		                  delegate.getClass().getSimpleName(),
		                  num, (end - start));
		return result;
	}
}
