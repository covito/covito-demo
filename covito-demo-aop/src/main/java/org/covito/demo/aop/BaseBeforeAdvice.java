package org.covito.demo.aop;

import java.lang.reflect.Method;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.aop.MethodBeforeAdvice;

public class BaseBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("==========before()=========== \n");
		System.out.println(ArrayUtils.toString(args));
		System.out.println(target);
		System.out.println(method);
		System.out.println("===================================== \n");

	}

}
