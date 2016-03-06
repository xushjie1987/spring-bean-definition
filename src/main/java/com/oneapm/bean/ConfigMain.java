package com.oneapm.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigMain {
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        // ctx.addBeanFactoryPostProcessor(new BDRegistryBean());
        // ctx.register(AppConfig.class);
        // ctx.refresh();
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
