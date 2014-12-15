package org.covito.demo.aop;

import java.lang.reflect.Method;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.aop.ThrowsAdvice;

public class BaseAfterThrowsAdvice implements ThrowsAdvice {

	
    public void afterThrowing(Method method, Object[] args, Object target, Throwable throwable) {
    	System.out.println("==========afterThrowing()=========== \n");
    	 System.out.println(ArrayUtils.toString(args));
         System.out.println(target);
         System.out.println(method);
        System.out.println("===================================== \n");
    }
}
