package com.oneapm.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
    
    @Bean(name = "aBean")
    public ABean aBean() {
        return new ABean();
    }
    
    @Bean(name = "bBean")
    public BBean bBean() {
        BBean bBean = new BBean();
        bBean.setaBean(aBean());
        return bBean;
    }
    
    @Bean(name = "cBean")
    public CBean cBean() {
        CBean cBean = new CBean();
        cBean.setaBean(aBean());
        return cBean;
    }
    
}
