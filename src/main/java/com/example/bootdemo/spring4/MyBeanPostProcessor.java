package com.example.bootdemo.spring4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equalsIgnoreCase("car")){
            Car car=(Car)bean;
            if(car.getColor()==null){
                System.out.println("BeanPostProcessor.postProcessBeforeInitialization(),color为空设置黑色");
                car.setColor("黑色");
            }
        }
        return  bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equalsIgnoreCase("car")){
            Car car=(Car)bean;
            if(car.getBrand().equalsIgnoreCase("200")){
                System.out.println("BeanPostProcessor.postProcessAfterInitialization(),brand设置为100");
                car.setBrand("100");
            }
        }
        return  bean;
    }
}
