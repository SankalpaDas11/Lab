package com.cms.daoimpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cms.entity.UserClass;
import com.cms.dao.UserDao;
import com.cms.hibernateutil.UserUtil;

public class UserImpl implements UserDao{
public void addStudent() {
	Session session = UserUtil.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();
	String fn,ln,em;
	int ag;
	long phn;
	String dept;
	double cgpa;
	Scanner s = new Scanner(System.in);
	System.out.println();
	System.out.println("Enter Students's first name : ");
	fn = s.next();
	System.out.println("Enter Students's last name : ");
	ln = s.next();
	System.out.println("Enter Student's email : ");
	em = s.next();
	System.out.println("Enter Student's age : ");
	ag = s.nextInt();
	System.out.println("Enter Student's phone number : ");
	phn = s.nextLong();
	System.out.println("Enter Student's Department name : ");
	dept = s.next();
	System.out.println("Enter Student's semester CGPA : ");
	cgpa = s.nextDouble();
	UserClass u = new UserClass();
	u.setFirstName(fn);
	u.setLastName(ln);
	u.setEmail(em);
	u.setAge(ag);
	u.setPhone(phn);
	u.setDept(dept);
	u.setCgpa(cgpa);
	session.save(u);
	t.commit();
	System.err.println("---Students record inserted successfully---");
	session.close();
}
public void readStudent() {
	Session session = UserUtil.getSessionFactory().openSession();
	long i;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter user id : ");
	i = s.nextLong();
	UserClass w =session.get(UserClass.class,i);
	System.err.println("-------------------------------");
	 System.out.println(" Student id             :" + w.getId()+
						"\n Student FirstName    : "+w.getFirstName()+
						"\n Student lastname     : "+w.getLastName()+
						"\n Student email        : "+w.getEmail()+
						"\n Student age          : "+w.getAge()+
						"\n Student phone number : "+w.getPhone()+
						"\n Student Department   : "+w.getDept()+
						"\n Student CGPA         : "+w.getCgpa());
	System.err.println("-------------------------------");
	session.close();
}
public void updateStudent() {
	Session session = UserUtil.getSessionFactory().openSession();
	Scanner s = new Scanner(System.in);
	Transaction t = session.beginTransaction();
	System.out.println("Enter user id : ");
	long j = s.nextLong();
	UserClass w = session.get(UserClass.class,j);
	System.out.println("Enter your Updated email : ");
	String eml = s.next();
	w.setEmail(eml);
	session.update(w);
	t.commit();
	System.err.println("---Email Updated successfylly---");
	session.close();
}
public void deleteStudent() {
	Session session = UserUtil.getSessionFactory().openSession();
	Scanner s = new Scanner(System.in);
	Transaction t = session.beginTransaction();
	System.err.println("Enter user id : ");
	long k = s.nextLong();
	UserClass w = session.get(UserClass.class, k);
	session.delete(k);
	t.commit();
	System.err.println("Student record Deleted successfylly");
	session.close();
	}
}
