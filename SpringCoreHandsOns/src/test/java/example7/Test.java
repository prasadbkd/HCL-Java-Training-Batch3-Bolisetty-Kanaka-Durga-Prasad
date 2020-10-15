package example7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.example7.AppConfig;
import com.hcl.example7.Box;
import com.hcl.example7.User;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);//For Java based config
		//ApplicationContext context = new ClassPathXmlApplicationContext("appContext7.xml");//For XML based config
		User user = context.getBean(User.class);
		user.setName("Ramesh");
		//user.setPassword("rameshq23");
		Box box = context.getBean(Box.class);
		box.setLength(10);
		box.setBreadth(12);
		box.display();
		((AnnotationConfigApplicationContext) context).close();

	}

}
