package example3;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.example3.AppConfig;
import com.hcl.example3.Course;
import com.hcl.example3.CourseList;





public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext3.xml");// For XML based configuration
		//ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class) ;//For Java based configuration
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Course course1 = context.getBean( Course.class);
		Course course2 = context.getBean( Course.class);
		Course course3 = context.getBean( Course.class);
		//System.out.println(course1);
		//course1.setDetails("Java"," mentor", 1000);//For Java based configuration
		//course2.setDetails("Python"," mentor", 500);//For Java based configuration
		//course3.setDetails("Seli"," mentor", 2000);//For Java based configuration
		
		CourseList clist= context.getBean( CourseList.class);
		clist.insert(course1);
		clist.insert(course2);
		clist.insert(course3);
		clist.discount();
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
