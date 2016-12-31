package com.shashank.bss.test.test.Main;

import com.shashank.bss.test.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestMain
{
    public static void main(String args[])
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        String[] beans = context.getBeanDefinitionNames();

        for (String bean : beans)
        {
            System.out.println("Bean is: " + context.getBean(bean));
        }

        System.out.println("Bean is: " + context.getBean("entityConveters"));
    }
}
