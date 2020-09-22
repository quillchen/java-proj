package com.quill.springdemo.cyclebean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/17 10:06
 */
public class BeanPostProcessorMercury implements BeanPostProcessor {

    public BeanPostProcessorMercury() {
        System.out.println("Mercury# constructor");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Mercury# before init "+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Mercury# after init "+beanName);
        return bean;
    }

}
