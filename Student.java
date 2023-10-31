package com.hcc.st.myspring;

public class Student {

		
		private String firstName;
		private String email;
		private String gender;
		

		public Student(String firstName, String email, String gender) {
		this.firstName = firstName;
		this.email = email;
		this.gender = gender;
		
		}

		 public Student() {
		    }
		    
		    
		    public String getFirstname() {
		        return firstName;
		    }
		    public void setFirst_name(String firstName) {
		        this.firstName = firstName;
		    }
		    
		    public String getEmail() {
		        return email;
		    }
		    public void setEmail(String email) {
		        this.email = email;
		    }
		    public String getGender() {
		        return gender;
		    }
		    public void setGender(String gender) {
		        this.gender = gender;
		    }
		    @Override
		    public String toString() {
		        return "Student [firstNname=" + firstName + ", email=" + email + ", gender="
		                + gender + "]";
		    }
		}