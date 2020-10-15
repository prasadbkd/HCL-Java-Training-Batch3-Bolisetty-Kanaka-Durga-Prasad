package example6;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.example6.Address;
import com.hcl.example6.AppConfig;
import com.hcl.example6.Employee;

public class Test {

	public static void main(String[] args) throws IOException {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);//For Java based config
		//ApplicationContext context = new ClassPathXmlApplicationContext("appContext6.xml");//For XML based config
		Address address = context.getBean(Address.class);
		address.setDetails("Akshaya Adora", "Padur", "Chennai", "603103");
		Employee employee = context.getBean(Employee.class);
		employee.setDetails("Ramesh", "78878778", 30000, "ramesh.example.com");
		employee.display();
		((AnnotationConfigApplicationContext) context).close();
	}

}
