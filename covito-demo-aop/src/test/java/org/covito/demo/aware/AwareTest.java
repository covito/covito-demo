package org.covito.demo.aware;

import javax.annotation.Resource;

import org.covito.demo.aware.HelloBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/aware.xml")
public class AwareTest {

	@Resource
	HelloBean hello;
	
	@Test
	public void testAware(){
        System.out.println(hello.getHelloWord());
	}
}
