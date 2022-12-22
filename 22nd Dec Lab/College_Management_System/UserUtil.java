package com.cms.hibernateutil;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class UserUtil {
private static SessionFactory SessionFactory;
static {
	try {
		SessionFactory = new Configuration().configure().buildSessionFactory();
	}catch(Exception e) {
		System.out.println(e);
	}
}
public static SessionFactory getSessionFactory() {
	return SessionFactory;
}
}
