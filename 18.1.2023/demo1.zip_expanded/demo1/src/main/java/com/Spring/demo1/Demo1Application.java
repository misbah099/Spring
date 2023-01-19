package com.Spring.demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.entity.Student;


public class Demo1Application {

		public static void main(String[] args) {
			Resource res=new ClassPathResource("ApplicationContext.xml");
			BeanFactory b=new XmlBeanFactory(res);
			Student s=(Student) b.getBean("X");
			s.display();
		}
	}


