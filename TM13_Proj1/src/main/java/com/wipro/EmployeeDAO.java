package com.wipro;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmployeeDAO 
{
	public void addEmployee(Employee e)
	{
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(e);
		
		
		System.out.println("Data inserted");
		tx.commit();
		session.close();
	}
	public Employee showEmployee(int id)
	{
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee e=(Employee)session.get(Employee.class, id);
		
		tx.commit();
		session.close();
		return e;
	}
	public void deleteEmployee(int id)
	{
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee e=(Employee)session.get(Employee.class, id);
		session.delete(e);
		System.out.println("Data Deleted");
		tx.commit();
		session.close();
	}
	public void updateEmployee(Employee e)
	{
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.saveOrUpdate(e);
		System.out.println("data updated");
		tx.commit();
		session.close();		
	}
	public List<Employee> showAllEmployee()
	{
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Query<Employee> query=session.createQuery("From Employee");
		List<Employee> list=query.list();
		System.out.println("list here");
		return list;
	}
}
