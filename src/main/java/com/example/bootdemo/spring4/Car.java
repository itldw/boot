package com.example.bootdemo.spring4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * 管理bean生命周期的接口
 */
public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("调用setbrand设置属性");
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    private BeanFactory beanFactory;

    public String getBeanName() {
        return beanName;
    }

    private String beanName;


    public Car(){

        System.out.println("调用car构造函数");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用beanfacotyAware.setBeanFactory()");
        this.beanFactory=beanFactory;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("调用beanNameAware.setBeanName()");
        this.beanFactory=beanFactory;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean.destory()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet()");
    }

    public  void myInit(){
        System.out.println("init-method");
    }
    public  void myDestory(){
        System.out.println("destory-method");
    }

}
