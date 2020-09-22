package com.quill.springdemo.cyclebean;

import org.springframework.beans.factory.InitializingBean;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/17 9:29
 */
public class InitBeanMars implements InitializingBean {

    private String something;

    public InitBeanMars() {
        System.out.println("Mars# InitBean constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Mars# do something after init this bean");
        System.out.println("Mars# DataSourceInitializer SqlSessionFactoryBean org.apache.dubbo.config.spring.ServiceBean 都这么用");
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }
}
