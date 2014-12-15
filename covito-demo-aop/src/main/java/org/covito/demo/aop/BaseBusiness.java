package org.covito.demo.aop;

public class BaseBusiness implements IBaseBusiness {

	
    public String delete(String obj) {
        throw new RuntimeException("delete error!");
    }

    /**
     * 此注解必须写在实现类方法上，在接口上会失效
     */
    @Audit("mo audit")
    public String add(String obj,Integer age) {
        return obj + "_add";
    }

    public String modify(String obj) {
        return obj + "_modify";
    }
}
