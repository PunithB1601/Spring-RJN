package com.dcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		/**1. IoC container gets started
		 * 2. Java Objects for all bean class will be created
		 * 3. DI will be performed
		 */
		Car c=context.getBean(Car.class);
		c.move();
		
		
	}

}
