package com.klu.EmployeDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.klu.entity.EmployeEntity;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args ){
    	SessionFactory sf = new Configuration()
               .configure("hibernate.cfg.xml")
                .buildSessionFactory();
       
         Session s=sf.openSession();
         Transaction tx=s.beginTransaction();
         
         
         EmployeEntity ee1=new EmployeEntity(103,"xyz",29,65500.45);
         EmployeEntity ee2=new EmployeEntity(203,"abc",20,39500.45);
         EmployeEntity ee3=new EmployeEntity(303,"pqr",39,90500.45);
         EmployeEntity ee4=new EmployeEntity(403,"ghi",40,95500.45);
         
         s.save(ee1);
         s.save(ee2);
         s.save(ee3);
         s.save(ee4);
         
         Long count = s.createQuery("select count(empid) from EmployeEntity e",Long.class).getSingleResult();
     	
     	System.out.println("\nTotal Employees: "+count);
     	
     	double Salary = s.createQuery("select sum(salary) from EmployeEntity e",Double.class).getSingleResult();
     	System.out.println("\nTotal Employes Salary: "+Salary);
     	
         
     	Double avgage=s.createQuery("Select average(age) from EmployeEntity e",Double.class).getSingleResult();
     	System.out.println("Average Age of Employee is: "+avgage);
     	s.close();
     	sf.close();
   
    }
}
