package com.example.bootdemo;

import com.example.bootdemo.spring4.Car;
import com.example.bootdemo.spring4.MyBeanPostProcessor;
import com.example.bootdemo.spring4.MyInstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@SpringBootApplication
public class BootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootdemoApplication.class, args);


		//bean生命周期
		BeanFactory bf=new DefaultListableBeanFactory();

		Resource res= (Resource) new ClassPathResource("/car.xml");

		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader((DefaultListableBeanFactory)bf);

		reader.loadBeanDefinitions(res);

		((DefaultListableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());
		((DefaultListableBeanFactory)bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

		Car car1=(Car)bf.getBean("car");
		car1.setColor("红色");

		Car car2=(Car)bf.getBean("car");

		System.out.println("car1==car2:"+(car1==car2));

		((DefaultListableBeanFactory)bf).destroySingletons();
	}

}
