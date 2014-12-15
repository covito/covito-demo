package org.covito.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class BusinessAspect {
	
	@Around("execution(* org.covito.demo.aop.IBaseBusiness.*(..))")
	public Object handle(ProceedingJoinPoint joinPoint) throws Throwable{
		Object retVal = null;
		retVal = joinPoint.proceed();
		System.out.println("=============@Around==============");
		System.out.println(joinPoint.getTarget());
		System.out.println(joinPoint.getKind());
		System.out.println(joinPoint.getArgs());
		System.out.println(joinPoint.getSignature());
		System.out.println(joinPoint.getStaticPart());
		System.out.println(joinPoint.getSourceLocation());
		System.out.println(retVal);
		System.out.println("==================================");
		return retVal;
	}
	
	@Around(value = "@annotation(audit)", argNames = "audit")
	public Object handleAnnotation(ProceedingJoinPoint joinPoint,Audit audit) throws Throwable{
		Object retVal = null;
		retVal = joinPoint.proceed();
		System.out.println("######"+audit.value());
		return retVal;
	}
}
