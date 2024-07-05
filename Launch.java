package com.mainapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("bean.xml");
XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(r);

Employee emp = (Employee) xmlBeanFactory.getBean("emp");
	}

}
