package chap07_c_ctx;

import chap07_c.Calculator;
import chap07_c.ExeTimeAspect;
import chap07_c.RecCalculator;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@EnableAspectJAutoProxy(proxyTargetClass = true)
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
