package com.SpringJdbc1;

import org.springframework.jdbc.core.JdbcTemplate;

public class DaoImpl implements Dao{					  // creating DaoImpl Class and implementing Dao interface
	
	private JdbcTemplate jdbcTemplate;					  // Creating instance of inbuilt jdbcTemplete class
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate= jdbcTemplate;
	}
	public int insert(Student student) {                   // insertion logic
        System.out.println("Insertion done!!");
		String query = "insert into Student values(' "+student.getId()+" ',' "+student.getName()+" ' , ' "+student.getEmail()+" ' ,' "+student.getAddress()+" ' ,' "+student.getAge()+" ')";
		return jdbcTemplate.update(query);				
	}
	public int update(Student student,int id) {				//updation logic
		System.out.println("Updation done!!!");
		return jdbcTemplate.update("UPDATE Student SET name = 'Sankalpa', email =' s@gmail.com', address = 'Uttarpara',age=23 WHERE id ="+id);
		}
	public int delete(Student student ,int id) {			//delete logic
		System.out.println("Deletion done!!!");
		return jdbcTemplate.update("delete from Student WHERE id ="+id);
	}
	}

