package example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.example2.AppConfig;
import com.hcl.example2.Course;
import com.hcl.example2.CourseList;



public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext2.xml");//For XML Based Configuration
		//ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class) ;//For Java based configuration
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Course course1 = context.getBean("course1" ,Course.class);
		Course course2 = context.getBean("course2" , Course.class);
		Course course3 = context.getBean("course3" , Course.class);
		System.out.println(course1);
		//course1.setDetails("Java"," mentor", 1000);//For Java based configuration
		//course2.setDetails("Python"," mentor", 500);//For Java based configuration
		//course3.setDetails("Seli"," mentor", 2000);//For Java based configuration
		CourseList clist= context.getBean( CourseList.class);
		clist.insert(course1);
		clist.insert(course2);
		clist.insert(course3);
		System.out.println("Enter your Budget: ");
		double budget = Double.parseDouble(br.readLine());
		ArrayList<String> noOfCourses = clist.noOfCourse(budget);
		System.out.println("The courses you can get are: ");
		for(String course : noOfCourses )
			System.out.println(course);
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
