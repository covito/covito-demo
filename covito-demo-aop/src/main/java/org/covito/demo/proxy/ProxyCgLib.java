package org.covito.demo.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.InvocationHandler;

public class ProxyCgLib implements InvocationHandler {

	// 　这个就是我们要代理的真实对象
	private Object subject;

	public ProxyCgLib(Object subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("cglib Before");

		// 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
		method.invoke(subject, args);
		// 　　在代理真实对象后我们也可以添加一些自己的操作
		
		System.out.println("cglib After");
		return null;
	}

}
