package com.app.bean;

public class Student {
	
    private String name;
    private String email;
    private String password;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", password=" + password + ", course=" + course + "]";
	}
    
    
}