package org.covito.demo.aop;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/commons.xml","/aopconfig.xml"})
public class AopConfigTest {
	
	@Resource
	IBaseBusiness baseBusiness;

	@Test
	public void testAop(){
        System.out.println(baseBusiness.add("vito",12));
        System.out.println(baseBusiness.modify("vito"));
	}
	
}
