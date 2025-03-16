package com.Practice;

import java.util.*;

//import com.collections.Student1;

public class Portal {
	
	ArrayList<Student> studentList = new ArrayList();
	
//	public int compareTo(Student st){  
//		 return scholarship.compareTo(st.scholarship);}

	
//	void assignScholarship() {
//		
//		for(Student s:studentList) {
//			if(s.getPercentage()>=91) {s.setScholarship(10000);}
//			if(s.getPercentage()>=81) {s.setScholarship(5000);}
//			if(s.getPercentage()<81) {s.setScholarship(00);}}
//			
//			
//			
//			
//		
//	}
//	
	 public void assignScholarship() {
	        for (Student student : studentList) {
	            float percentage = student.getPercentage();
	            float scholarship = 0;
	            if (percentage >= 91) {
	                scholarship = 10000;
	            } else if (percentage >= 81) {
	                scholarship = 5000;
	            }
	            student.setScholarship(scholarship);
	        }
	    }
//	
	
	
	
	
	float totalScholarship() {
		int total=0;
		for(Student s:studentList) {total=(int) (total+s.scholarship);}
		return total;}
	
	 public String totalMaxScholarshipOfCollege() {
	        Map<String, Float> collegeScholarshipMap = new HashMap<>();
	        
	        
	        for (Student student : studentList) {
	            String collegeName = student.getCollegeName();
	            float scholarship = student.getScholarship();
	            collegeScholarshipMap.put(collegeName, collegeScholarshipMap.getOrDefault(collegeName, 0f) + scholarship);
	        }
	        
	        
	        String maxCollege = null;
	        float maxScholarship = 0;
	        
	        for (Map.Entry<String, Float> entry : collegeScholarshipMap.entrySet()) {
	            if (entry.getValue() > maxScholarship) {
	                maxScholarship = entry.getValue();
	                maxCollege = entry.getKey();
	            }
	        }
	        
	        return maxCollege;
	  
	 }
	 
	 
	 public static void main(String args[]) {
		 
		 Portal obj = new Portal();
		 obj.studentList.add(new Student("Benn", "IIT", 89));
		 obj.studentList.add(new Student("Kenn", "NIT", 94));
		 obj.studentList.add(new Student("Jenn", "IIT", 59));
		 
//		 obj.assignScholarship();
		 obj.totalScholarship();
		 obj.totalMaxScholarshipOfCollege();
		 
		 System.out.println("Total Scholarship: " + obj.totalScholarship());
	        
	        
	        System.out.println("Maximum Scholarship: " + obj.totalMaxScholarshipOfCollege());
	
		 }
	 
	 
	 
	 
	 
	 
	}



                  
	

