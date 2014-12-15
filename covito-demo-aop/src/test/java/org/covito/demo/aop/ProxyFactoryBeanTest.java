package org.covito.demo.aop;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/commons.xml","/proxyFactoryBean.xml"})
public class ProxyFactoryBeanTest {
	
	@Resource
	ProxyFactoryBean proxy;

	@Test
	public void testAop(){
		IBaseBusiness baseBusiness=(IBaseBusiness) proxy.getObject();
        System.out.println(baseBusiness.add("vito",12));
        System.out.println(baseBusiness.modify("vito"));
	}
	
}
