package webapp.app.aop;

import net.spy.memcached.MemcachedClient;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.InetSocketAddress;

@Aspect
@Service("JuheDataAop")
public class JuheDataAop {

	@Pointcut("execution(* webapp.app.service.impl.*.get*(..))")
	public void anyMethod() {

	}

	@Around("anyMethod()")
	public Object around(ProceedingJoinPoint joinpoint) {
		System.out.println("环绕切面....");
		
		//取执行的方法名
		String keymethodName = joinpoint.getSignature().getName();
		System.out.println("keymethodName-->" + keymethodName);

		Object obj = null;
		MemcachedClient mclient = null;

		// 首先从缓存memcached缓存中获取数据，如果缓存没有数据，就去数据库获取
		try {
			mclient = new MemcachedClient(new InetSocketAddress("127.0.0.1", 11211));

			System.out.println("连接成功..." + mclient);

			obj = mclient.get(keymethodName);

			if (null == obj)
			{
				System.out.println("本地分布式缓存memached没有数据....");

				// 执行目标方法
				obj = joinpoint.proceed();

				// 写入缓存
				mclient.set(keymethodName, 24 * 60 * 60, obj);
				
			} 
			else 
			{
				System.out.println("缓存中有数据*******************");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// mclient.shutdown();
		}

		return obj;
	}

}
