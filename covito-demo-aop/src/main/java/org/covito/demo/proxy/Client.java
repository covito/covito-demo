package org.covito.demo.proxy;

import java.lang.reflect.Proxy;

import net.sf.cglib.proxy.Enhancer;

public class Client {

	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		
		/**基于JDK*/
		DynamicProxy handler = new DynamicProxy(realSubject);
		Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(), 
				realSubject.getClass().getInterfaces(), handler);
		//此行打印：com.sun.proxy.$Proxy0
		System.out.println(subject.getClass().getName());
		subject.hello("world");
		
		/**基于cglib接口*/
		ProxyCgLib handler2 = new ProxyCgLib(realSubject);
		subject = (Subject) net.sf.cglib.proxy.Proxy.newProxyInstance(Client.class.getClassLoader(), 
				realSubject.getClass().getInterfaces(), handler2);
		//此行打印：net.sf.cglib.proxy.Proxy$ProxyImpl$$EnhancerByCGLIB$$a0d85d10
		System.out.println(subject.getClass().getName());
		subject.hello("world");
		
		/**或者*/
		Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(Subject.class);  
        enhancer.setCallback(handler2);  
        subject = (Subject)  enhancer.create(); 
		//此行打印：net.sf.cglib.proxy.Proxy$ProxyImpl$$EnhancerByCGLIB$$a0d85d10
		System.out.println(subject.getClass().getName());
		subject.hello("world");
		
		/**基于cglib非接口*/
		enhancer = new Enhancer();  
        enhancer.setSuperclass(RealSubject.class);  
        enhancer.setCallback(handler2);  
        subject = (Subject)  enhancer.create();  
		//此行打印：net.sf.cglib.proxy.Proxy$ProxyImpl$$EnhancerByCGLIB$$a0d85d10
		System.out.println(subject.getClass().getName());
		subject.hello("world");
	}
}
