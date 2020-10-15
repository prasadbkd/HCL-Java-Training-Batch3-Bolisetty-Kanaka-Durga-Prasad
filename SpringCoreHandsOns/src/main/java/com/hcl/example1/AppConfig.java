package com.hcl.example1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan(basePackages = {"com.hcl.example1"})
@Configuration
public class AppConfig {

	@Bean("address")
	public Address getAddress() {
		
		return new Address("Akshaya Adora","Padur","Chennai","2893929");
	}
	@Bean("employee")
	public Employee getEmployee() {
		        Employee employee = new Employee();
				employee.setEmployeeName("Ramesh");//Java Based Configuration
				employee.setEmployeeEmail("ramesh@gmail.com");          //Java Based Configuration
				employee.setEmpSalary(30000);							  //Java Based Configuration
				List<String> mobileNos=new ArrayList<String>();        //Java Based Configuration
				mobileNos.add("232334332");                            //Java Based Configuration
				mobileNos.add("1212334332");                           //Java Based Configuration
				employee.setEmployeeMobile(mobileNos);                //Java Based Configuration
				return employee;
	}
	
	
}
