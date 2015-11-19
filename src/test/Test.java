package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.Dao;
import entity.User;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=
			new ClassPathXmlApplicationContext("applicationContext.xml");
		Dao dao = (Dao)context.getBean("DaoImpl");
		User user = new User("test","test","test");
		dao.save(user);
	}
}
