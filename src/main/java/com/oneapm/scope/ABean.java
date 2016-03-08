package com.oneapm.scope;

import java.util.UUID;

public class ABean {
    
    private String value;
    
    public ABean() {
        this.value = UUID.randomUUID().toString();
    }
    
    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }
    
    /**
     * @param value
     *            the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
    
}
