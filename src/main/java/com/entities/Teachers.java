package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Teachers_table")
public class Teachers {
//table attributes
@Id
@Column(name = "Teachar_ID", nullable = false, length = 25)
private int Tid;
@Column(name = "Teachar_first_name", nullable = false, length = 25)
private String tfname;
@Column(name = "Teachar_last_name", nullable = false, length = 25)
private String tlname;

@ManyToOne
@JoinColumn(name = "classid")
private Classrooms classroom;


//mappings


public Teachers() {
	super();
	// TODO Auto-generated constructor stub
}

public Teachers(int tid, String tfname, String tlname, Classrooms classroom) {
	super();
	Tid = tid;
	this.tfname = tfname;
	this.tlname = tlname;
	this.classroom = classroom;
}

public Classrooms getClassroom() {
	return classroom;
}

public void setClassroom(Classrooms classroom) {
	this.classroom = classroom;
}

public int getTid() {
	return Tid;
}
public void setTid(int tid) {
	Tid = tid;
}
public String getTfname() {
	return tfname;
}
public void setTfname(String tfname) {
	this.tfname = tfname;
}
public String getTlname() {
	return tlname;
}
public void setTlname(String tlname) {
	this.tlname = tlname;
}

@Override
public String toString() {
	return "Teachers [Tid=" + Tid + ", tfname=" + tfname + ", tlname=" + tlname + ", classroom=" + classroom + "]";
}


}
