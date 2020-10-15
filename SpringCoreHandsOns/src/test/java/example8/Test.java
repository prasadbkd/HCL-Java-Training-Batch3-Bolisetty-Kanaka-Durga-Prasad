package example8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.example8.AppConfig;
import com.hcl.example8.User;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);//For Java based config
		//ApplicationContext context = new ClassPathXmlApplicationContext("appContext8.xml");//For XML based config
		User user = context.getBean(User.class);
		user.display();
		((AnnotationConfigApplicationContext)context).close();
	}

}
