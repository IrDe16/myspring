package com.hcc.st.myspring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student(1,"Caleb","jdtg0@aws.com","Female",null));
		students.add(new Student(2,"Aida","adattt@test.gov","Female",
		Arrays.asList(new Course("CS", "B", 4),
		new Course("CS12", "A", 4))));
		students.add(new Student(3,"Alex","Adavis@bccs.com","Female",
		Arrays.asList(new Course("BS", "B", 3),
		new Course("Hist", "A", 3))));
		students.add(new Students());
		System.out.println("GPA of each student:");
		for (Student student : students) {
		double total = 0;
		if(student.getCourse() != null){
		for (Course course : student.getCourse()) {
		total += getMarksFromGrades(course.getGrade());
		}
		}
		
		int count = student.getCourse() == null? 0:student.getCourse().size();
		
		if(count != 0){
		total = total/count;
		}
		System.out.printf("GPA of %s is %.2f\n",student.getFirstName(),total);
		}
		
		System.out.println("Enter a student name: ");
		String name = sc.nextLine();
		for (Student student : students) {
		if(student.getFirstName().equals(name)){
		System.out.println("Student");
		break;
		}
		}
		System.out.println("Enter a course number: ");
		String course = sc.nextLine();
		for (Students student : students) {
		if(student.getCourse() != null) {
		for (Course course : student.getCourse()) {
		if(course.equals(course.getCourseNo())){
		System.out.println("Course:");
		break;
		}
		}
		}
		}
		}
		
		private static int getMarksFromGrades(String grade){
		if(grade == null) return 0;
	
		switch (grade){
		case "A": return 4;
		case "B": return 3;
		case "C": return 2;
		default: return 0;
		}
		}
    }  

