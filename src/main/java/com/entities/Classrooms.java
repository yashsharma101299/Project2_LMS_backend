package com.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Classroom_table")
public class Classrooms {
	@Id
	@Column(name = "Class_id", nullable = false, length = 25)
	private int classid;
	@Column(name = "Class_name", nullable = false, length = 25)
	private String classname;

	// mappings
	@OneToMany(mappedBy = "classrooms", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Students> students;
	@OneToMany(mappedBy = "classroom", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Teachers> teachers;
	@OneToMany(mappedBy = "classroomss", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Subjects> subjects;

	public Classrooms() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classrooms(int classid, String classname, List<Students> students, List<Teachers> teachers,
			List<Subjects> subjects) {
		super();
		this.classid = classid;
		this.classname = classname;
		this.students = students;
		this.teachers = teachers;
		this.subjects = subjects;
	}

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	public List<Teachers> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teachers> teachers) {
		this.teachers = teachers;
	}

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Classrooms [classid=" + classid + ", classname=" + classname + ", students=" + students + ", teachers="
				+ teachers + ", subjects=" + subjects + "]";
	}

}
