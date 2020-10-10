package com.quill.springdemo.context;

import com.quill.springdemo.p4.autowiredbean.Computer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: qigui.chen
 * @Date: 2020/9/3 10:18
 */
public class XmlBeanFactoryMain {

    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring0.xml"));
        Computer computer = factory.getBean(Computer.class);
        System.out.println("computer = "+computer);

    }
}
