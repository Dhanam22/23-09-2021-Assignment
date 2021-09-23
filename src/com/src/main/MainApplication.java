package com.src.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.dao.EmployeeDao;
import com.src.model.Employee;

public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao b1=(EmployeeDao) context.getBean("employeedao");
		
		int status=b1.saveEmployee(new Employee(5,"Jk","20-08-1999",50000,"Manager","03-08-2021","30-09-2021"));
		if(status>0)
		{
			System.out.println("Values Inserted Successfully");
		}
		else
		{
			System.out.println("Unable to Insert");
		}
		int statuss=b1.saveEmployee(new Employee(2,"Riya","11-01-2008",6000,"Manager","03-08-2021","30-09-2021"));
		if(statuss>0)
		{
			System.out.println("Values Inserted Successfully");
		}
		else
		{
			System.out.println("Unable to Insert");
		}
		
		int status1=b1.updateEmployee(new Employee(2,"Riya","11-01-2005",60000,"Senior Manager","03-08-2021","30-09-2021"));
		if(status1>0)
		{
			System.out.println("Values Updated Successfully");
		}
		else
		{
			System.out.println("Unable to Update");
		}
		
		int status3=b1.deleteEmployee(new Employee(1));
		if(status3>0)
		{
			System.out.println("Values Deleted Successfully");
		}
		else
		{
			System.out.println("Unable to Delete");
		}
		
		List<Employee> e2=b1.displayAllEmployee();
		for(Employee b:e2)
		{
			System.out.println(b);
		}
	}

}
