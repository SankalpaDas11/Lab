package com.SpringJdbc1;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App      //creating App class
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig.xml");  //configuring and connecting xml file to jdbc.
        
        Dao dao = ac.getBean("DaoImpl",Dao.class); //returning instance of DaoImpl class through getBean method.
//        Student st = new Student();
//        st.setId(10);
//        st.setName("Messi");
//        st.setEmail("wc@gmail.com");
//        st.setAge(35);
//        st.setAddress("Spain");
          Student st2 = new Student();
//        st2.setId(7);
//        st2.setName("Ronaldo");
//        st2.setEmail("ec@gmail.com");
//        st2.setAge(35);
//        st2.setAddress("Spain");
//        dao.update(st2,7); // for update
          dao.delete(st2,7); //for delete
          
    }
}