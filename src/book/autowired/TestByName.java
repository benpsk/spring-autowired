package book.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestByName {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanByName.xml");
		Book b = (Book) context.getBean("book");
		b.showInfo();
	}

}
