package com.example.bootdemo.spring4;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {

        if("car".equalsIgnoreCase(beanName)){
            System.out.println("postProcessProperties");
        }
        return pvs;

    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if("car".equalsIgnoreCase(beanName)){
            System.out.println("postProcessBeforeInstantiation");
        }
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("car".equalsIgnoreCase(beanName)){
            System.out.println("postProcessAfterInstantiation");
        }
        return null;
    }
}
