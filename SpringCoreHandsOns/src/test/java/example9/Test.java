package example9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.example9.AppConfig;
import com.hcl.example9.Course;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);//For Java Based Config
		//ApplicationContext context = new ClassPathXmlApplicationContext("appContext9.xml");// For Xml Based Config
		Course course1 = context.getBean(Course.class);
		course1.setDetails("Java", "Satish", 1000);
		Course course2 = context.getBean(Course.class);
		course2.setDetails("Python", "Satish", 500);
		Course course3 = context.getBean(Course.class);
		course3.setDetails("Selinium", "Satish", 2000);
		course1.display();
		course2.display();
		course3.display();
		((AnnotationConfigApplicationContext)context).close();
	}

}
