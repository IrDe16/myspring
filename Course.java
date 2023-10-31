package com.hcc.st.myspring;

public class Course {
	private String courseNo;
	private String grade;
	private int creditHours;

	public Course(String courseNo, String grade, int creditHours) {
	this.courseNo = courseNo;
	this.grade = grade;
	this.creditHours = creditHours;
	}

	public Course() {
	}
	public void setCourseNo(String courseNo) {
	this.courseNo = courseNo;
	}
	public String getCourseNo() {
		return courseNo;
		}

	public void setGrade(String grade) {
	this.grade = grade;
	}
	public String getGrade() {
		return grade;
		}
	public void setCreditHours(int creditHours) {
	this.creditHours = creditHours;
	}
    public int getCreditHours() {
	return creditHours;
	}
    @Override
    public String toString() {
        return "Student [courseNo=" + courseNo + ", grade=" + grade + ", creditHours="
                 + "]";
    }
}

