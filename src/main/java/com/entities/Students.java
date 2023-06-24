package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Student_table")
public class Students {
@Id
@Column(name = "Student_ID", nullable = false, length = 25)
private int studid;
@Column(name = "Student_first_name", nullable = false, length = 25)
private String studfname;
@Column(name = "Student_last_name", nullable = false, length = 25)
private String studlname;

@ManyToOne
@JsonBackReference
@JoinColumn(name = "classid")
private Classrooms classrooms;

public Students() {
	super();
	// TODO Auto-generated constructor stub
}

public Students(int studid, String studfname, String studlname, Classrooms classrooms) {
	super();
	this.studid = studid;
	this.studfname = studfname;
	this.studlname = studlname;
	this.classrooms = classrooms;
}
public Classrooms getClassrooms() {
	return classrooms;
}
public void setClassrooms(Classrooms classrooms) {
	this.classrooms = classrooms;
}
public int getStudid() {
	return studid;
}
public void setStudid(int studid) {
	this.studid = studid;
}
public String getStudfname() {
	return studfname;
}
public void setStudfname(String studfname) {
	this.studfname = studfname;
}
public String getStudlname() {
	return studlname;
}
public void setStudlname(String studlname) {
	this.studlname = studlname;
}

@Override
public String toString() {
	return "Students [studid=" + studid + ", studfname=" + studfname + ", studlname=" + studlname + ", classrooms="
			+ classrooms + "]";
}


}
