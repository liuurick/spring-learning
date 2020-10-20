package com.liuurick;

import com.liuurick.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by liubin on 2020/10/19
 */
public class Entrance {
	public static void main(String[] args) {

		String xmlPath = "C://Users//admin//Desktop//spring-learning-master//01-spring-framework-5.2.9.RELEASE//spring-demo//src//main//resources//spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		welcomeService.sayHello("liubin");

	}
}
