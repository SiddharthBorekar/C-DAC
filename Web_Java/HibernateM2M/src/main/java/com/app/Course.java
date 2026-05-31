package com.app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String title;
	@Column
	@ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
	@JoinTable(name= "Studentcourse",joinColumns = @JoinColumn(name = "Course_id"), inverseJoinColumns = @JoinColumn(name = "StudentId"))
	private Set <Student> Students;
	
	public void add(Student tempCourse) {
		if (Students == null) {
			Students  = new HashSet<Student>();
		}
		Students.add(tempCourse);
	}

	public Course(String title) {
		super();
		this.title = title;
	}
	
	
	
}
