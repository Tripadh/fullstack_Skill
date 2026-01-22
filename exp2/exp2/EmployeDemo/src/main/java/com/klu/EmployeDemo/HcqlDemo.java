package com.klu.EmployeDemo;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List; 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.klu.entity.EmployeEntity;

public class HcqlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration()
	               .configure("hibernate.cfg.xml")
	                .buildSessionFactory();
	       
	         Session s=sf.openSession();
        CriteriaBuilder cb=s.getCriteriaBuilder();
        
        CriteriaQuery<EmployeEntity> cq=cb.createQuery(EmployeEntity.class);
        Root<EmployeEntity> r=cq.from(EmployeEntity.class);
        
        List<EmployeEntity> list=s.createQuery(cq.select(r)).getResultList();
        
        for(EmployeEntity e:list) {
        	System.out.println(e);
        }
        		
        
	}

}
