package chap07_b_ctx;

import chap07_b.Calculator;
import chap07_b.ExeTimeAspect;
import chap07_b.RecCalculator;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@EnableAspectJAutoProxy
public class AppCtx
{
	@Bean
	public ExeTimeAspect exeTimeAspect()
	{
		return new ExeTimeAspect();
	}
	
	@Bean
	public Calculator calculator()
	{
		return new RecCalculator();
	}
}
