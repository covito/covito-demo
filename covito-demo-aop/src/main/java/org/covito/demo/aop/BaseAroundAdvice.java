package org.covito.demo.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BaseAroundAdvice implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("===========around()=========== \n");

        Object[] args = invocation.getArguments();
        Method method = invocation.getMethod();
        Object target = invocation.getThis();
        Object returnValue = invocation.proceed();
        
        System.out.println( args[0] + "\n" + method + "\n" + target + "\n" + returnValue + "\n");

        return returnValue;
    }
}
