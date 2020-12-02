package book.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestByConstructor {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("BeanByConstructor.xml");
		Book b = (Book) context.getBean("book");
		b.showInfo();
	}

}
