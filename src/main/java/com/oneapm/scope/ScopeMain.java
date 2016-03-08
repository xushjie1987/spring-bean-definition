package com.oneapm.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeMain {
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        BBean b = (BBean) ctx.getBean("bBean");
        System.out.println(b.getaBean().getValue());
        CBean c = (CBean) ctx.getBean("cBean");
        System.out.println(c.getaBean().getValue());
        ctx.destroy();
    }
    
}
