package com.dev.spring.io;

import com.dev.spring.bean.HelloService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class XmlBeanFactoryTest {

    @Test
    public void testXmlBeanFactory() {
        ClassPathResource resource = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        HelloService helloService = beanFactory.getBean(HelloService.class);
        System.out.println(helloService.sayHello("test"));
    }
}
