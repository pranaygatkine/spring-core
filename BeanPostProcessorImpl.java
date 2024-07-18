package com.mainapp.postprocess;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.mainapp.controller.MyController;
import com.mainapp.dao.Crud;
import com.mainapp.service.MyService;

public class BeanPostProcessorImpl implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		if(bean instanceof Crud) {
			System.out.println("Crud BEAN INSTANTIATED SUCCESSFULLY "+beanName);
		}
		else if(bean instanceof MyService) {
			System.out.println("MyService BEAN INSTANTIATED SUCCESSFULLY "+beanName);
		} 
		else if(bean instanceof MyController) {
			System.out.println("MyController BEAN INSTANTIATED SUCCESSFULLY "+beanName);
		}
		
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		if(bean instanceof Crud) {
			
			Crud crud=(Crud) bean;
			if(crud.getList()!=null) {
			   System.out.println("Crud BEAN INITIALIZED SUCCESSFULLY "+beanName);
			}
			else {
				System.out.println("Crud BEAN FAILED TO INITIALIZE "+beanName);
			}
		}
		else if(bean instanceof MyService) {
			System.out.println("MyService BEAN INITIALIZED SUCCESSFULLY "+beanName);
		} 
		else if(bean instanceof MyController) {
			System.out.println("MyController BEAN INITIALIZED SUCCESSFULLY "+beanName);
		}
		return bean;
	}
}
