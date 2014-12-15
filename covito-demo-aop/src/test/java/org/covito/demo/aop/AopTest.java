package org.covito.demo.aop;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AopConfigTest.class, ProxyFactoryBeanTest.class,AspectTest.class})
public class AopTest {

}
