package example5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.example5.AppConfig;
import com.hcl.example5.Owner;

public class Test {

	public static void main(String[] args) throws IOException {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);//For Java based config
		//ApplicationContext context = new ClassPathXmlApplicationContext("appContext5.xml");//For XML based config
		Owner owner = context.getBean("owner",Owner.class);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		String name=br.readLine();
		System.out.println("Enter Password: ");
		String password=br.readLine();
		System.out.println("Enter PhoneNumber: ");
		String mobileNumber=br.readLine();
		owner.setDetails(name, password, mobileNumber);
		owner.display();
		((AnnotationConfigApplicationContext)context).close();
	}

}
