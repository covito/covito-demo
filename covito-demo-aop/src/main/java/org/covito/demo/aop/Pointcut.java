package org.covito.demo.aop;

import java.lang.reflect.Method;

import org.springframework.aop.support.NameMatchMethodPointcut;

public class Pointcut extends NameMatchMethodPointcut {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1230802479482576702L;

	@Override
	public boolean matches(Method method, Class targetClass) {
        this.setMappedName("delete");
        String[] methods = { "delete", "modify" };
        
        // this.setMappedName("get*");
        
        this.setMappedNames(methods);

        return super.matches(method, targetClass);
	}

}
