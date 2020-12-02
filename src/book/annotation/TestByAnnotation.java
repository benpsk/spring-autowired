package book.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import book.autowired.Book;

public class TestByAnnotation {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("BeanByConstructor.xml");
		Book b = (Book) context.getBean("book");
		b.showInfo();
	}

}
