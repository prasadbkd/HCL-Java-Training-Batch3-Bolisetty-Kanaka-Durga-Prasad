package example1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.example1.AppConfig;
import com.hcl.example1.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext1.xml");//XML based Configuration
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);//Java Based Configuration
		Employee employee = context.getBean("employee", Employee.class);
		
		employee.display();
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
