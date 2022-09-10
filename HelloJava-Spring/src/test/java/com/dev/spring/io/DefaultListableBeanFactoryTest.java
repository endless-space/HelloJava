package com.dev.spring.io;

import com.dev.spring.bean.HelloService;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class DefaultListableBeanFactoryTest {

    @Test
    public void testDefaultListableBeanFactory() {
        ClassPathResource resource = new ClassPathResource("beans.xml");

        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory(null);
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);

        HelloService helloService = defaultListableBeanFactory.getBean(HelloService.class);
        System.out.println(helloService.sayHello("test"));
    }
}
