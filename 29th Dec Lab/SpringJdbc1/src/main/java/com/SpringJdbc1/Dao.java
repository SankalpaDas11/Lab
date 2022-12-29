package com.SpringJdbc1;

public interface Dao {
	public int insert(Student student);
	public int update(Student student,int id);
	public int delete(Student student,int id);

	
}
