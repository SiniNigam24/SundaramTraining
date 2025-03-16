package com.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;
import com.service.ServiceDao;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student(1,"Sini",LocalDate.parse("2000-02-23"));
		Student s2=new Student(2,"Niti",LocalDate.parse("2010-08-23"));
		Student s3=new Student(3,"Sini",LocalDate.parse("2010-02-25"));
		
		List<Student> s=new ArrayList();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		ServiceDao.insertStudentRecords(s);
	}
	
	
}
