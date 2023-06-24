package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Subject_table")
public class Subjects {
	@Id
	@Column(name = "subject_id")
	private int subid;
	@Column(name = "subject_name")
	private String subname;

	@ManyToOne
	@JoinColumn(name = "classid")
	private Classrooms classroomss;

	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subjects(int subid, String subname, Classrooms classroomss) {
		super();
		this.subid = subid;
		this.subname = subname;
		this.classroomss = classroomss;
	}

	public Classrooms getClassroomss() {
		return classroomss;
	}

	public void setClassroomss(Classrooms classroomss) {
		this.classroomss = classroomss;
	}

	public int getSubid() {
		return subid;
	}

	public void setSubid(int subid) {
		this.subid = subid;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	@Override
	public String toString() {
		return "Subjects [subid=" + subid + ", subname=" + subname + ", classroomss=" + classroomss + "]";
	}

}
