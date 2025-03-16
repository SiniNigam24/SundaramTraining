package com.Practice;
import java.util.Comparator;

import com.collections.*;
 class Student {
	
	String name;
    String collegeName;
    float percentage;
    float scholarship;
	public Student(String name, String collegeName,  float scholarship) {
		super();
		this.name = name;
		this.collegeName = collegeName;
		
		this.scholarship = scholarship;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public float getScholarship() {
		return scholarship;
	}
	public void setScholarship(float scholarship) {
		this.scholarship = scholarship;
	}
	
//	public int compareTo(Student st){  
//		 return scholarship.compareTo(st.scholarship);}
//	class ScholarshipComparator implements Comparator{  
//		public int compare(Object o1,Object o2){  
//		Student s1=(Student)o1;  
//		Student s2=(Student)o2;  
//		  
//		return (int) (s1.scholarship-s2.scholarship); 
//		}  
//		}  
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", collegeName=" + collegeName + ", percentage=" + percentage
				+ ", scholarship=" + scholarship + "]";
	}
	
	

}
