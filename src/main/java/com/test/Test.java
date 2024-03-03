package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

		Engine engine1 = context.getBean("engine", Engine.class);
		System.out.println(engine1.hashCode());

		Engine engine2 = context.getBean("engine", Engine.class);
		System.out.println(engine2.hashCode());

		Motor motor1 = context.getBean("m", Motor.class);
		System.out.println(motor1.hashCode());

		Motor motor2 = context.getBean("m", Motor.class);
		System.out.println(motor2.hashCode());

	}

}
