package chap07_d;

import chap07_d_ctx.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx
			= new AnnotationConfigApplicationContext(AppCtx.class);
		
		RecCalculator cal = ctx.getBean("calculator", RecCalculator.class);
		cal.factorial(7);
		cal.factorial(7);
		cal.factorial(5);
		cal.factorial(5);
		ctx.close();
	}
}
