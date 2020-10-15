package example4;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.example4.AppConfig;
import com.hcl.example4.Course;
import com.hcl.example4.CourseList;





public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext4.xml");//for Xml based config
		//ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class) ;
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Course course1 = context.getBean("course1", Course.class);
		Course course2 = context.getBean( "course2",Course.class);
		Course course3 = context.getBean( "course3",Course.class);
		course1.setDetails("Java"," mentor", 1000);
		course2.setDetails("Python"," mentor", 500);
		course3.setDetails("Seli"," mentor", 2000);
		//System.out.println(course1);
		CourseList clist= context.getBean( CourseList.class);
		//CourseList clist = 
		clist.insert(course1);
		clist.insert(course2);
		clist.insert(course3);
		clist.revenue();
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
