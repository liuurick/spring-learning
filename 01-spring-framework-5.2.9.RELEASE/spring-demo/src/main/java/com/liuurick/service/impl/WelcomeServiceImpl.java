package com.liuurick.service.impl;

import com.liuurick.service.WelcomeService;

/**
 * Created by liubin on 2020/10/20
 */
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		System.out.println("hello "+name);
		return "hello world";
	}
}
