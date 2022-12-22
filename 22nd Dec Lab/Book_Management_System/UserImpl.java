package com.Book.daoimpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Book.Entity.UserClass;
import com.Book.dao.UserDao;
import com.Book.Util.Util;

public class UserImpl implements UserDao{
public void addBook() {
	Session session = Util.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();
	int id;
	String bt,ban;
	double pc;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter id of the book : ");
	id = s.nextInt();
	System.out.println("Enter Title of the book : ");
	bt = s.next();
	System.out.println("Enter Author's name of the book : ");
	ban = s.next();
	System.out.println("Enter price of the book: ");
	pc = s.nextDouble();
	UserClass u = new UserClass();
	u.setBookId(id);
	u.setBookTitle(bt);
	u.setAuthorName(ban);
	u.setBookPrice(pc);
	session.save(u);
	t.commit();
	System.out.println("Book Enroled Successfully : ");
	session.close();
}
public void fetchBook() {
	Session session = Util.getSessionFactory().openSession();
	int i;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Book id you want to fetch : ");
	i = s.nextInt();
	UserClass w =session.get(UserClass.class,i);
	System.out.println("Book id : "+w.getBookId()+ " title :" + w.getBookTitle()+" Book Author's name : "+w.getAuthorName()+" Book price : "+w.getBookPrice());
	session.close();
}
}