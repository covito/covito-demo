package org.covito.demo.aop;

import java.lang.reflect.Method;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.aop.AfterReturningAdvice;

public class BaseAfterReturnAdvice implements AfterReturningAdvice {

	
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("==========afterReturning()=========== \n");
        System.out.println(ArrayUtils.toString(args));
        System.out.println(target);
        System.out.println(method);
        System.out.println("===================================== \n");
    }

}
