package com.id.zlb.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.id.zlb.spring.vo.Person;

public class IocTetst {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		/**
		 * 读取从类路径下的xml文件
		 */
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/id/zlb/spring/vo/spring-content.xml");
		/**
		 * 读取文件系统路径的xml文件
		 */
		ApplicationContext context1 = new FileSystemXmlApplicationContext("E:/myzhangliangbiao/my_spring_ioc/src/main/java/com/id/zlb/spring/vo/spring-content.xml");
		/**
		 * XmlWebApplicationtext读取web应用下的xml文件
		 */
		
		Person p = (Person) context.getBean("person");
		System.out.println("姓名："+p.getPerson_name()+",年龄："+p.getPerson_age());
	}

}
