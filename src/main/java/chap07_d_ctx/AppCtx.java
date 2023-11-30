package chap07_d_ctx;

import chap07_d.CacheAspect;
import chap07_d.Calculator;
import chap07_d.ExeTimeAspect;
import chap07_d.RecCalculator;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppCtx
{
	@Bean
	public CacheAspect cacheAspect() { return new CacheAspect(); }
	
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
