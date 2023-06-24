package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Classrooms;
import com.entities.Students;
import com.entities.Subjects;
import com.entities.Teachers;
import com.helper.HibernateConfigHelperClass;

public class Testclass {

	public static void main(String[] args) {
		
		try {
			Session s= HibernateConfigHelperClass.getfactory().openSession();
			Transaction tx=s.beginTransaction();
			// creating students 
			// student 1 detail
			Students students=new Students();
			students.setStudfname("yash");
			students.setStudlname("sharma");
			students.setStudid(101);
			// student 2 detail
			Students student1=new Students();
			student1.setStudfname("umesh");
			student1.setStudlname("sharma");
			student1.setStudid(102);
			// student 3 detail
			Students student2=new Students();
			student2.setStudfname("saksham");
			student2.setStudlname("sharma");
			student2.setStudid(103);
			// student 4 details
			Students student3=new Students();
			student3.setStudfname("daksh");
			student3.setStudlname("pareek");
			student3.setStudid(104);
			//list of students
			List<Students> studentlist= new ArrayList<>();
			studentlist.add(students);
			studentlist.add(student1);
			studentlist.add(student2);
			studentlist.add(student3);
			// creating teachers
			//teachers 1 detail
			Teachers teachers= new Teachers();
			teachers.setTfname("ankit");
			teachers.setTlname("tiwari");
			teachers.setTid(201);
			//teachers 2 detail
			Teachers teachers1= new Teachers();
			teachers1.setTfname("sumit");
			teachers1.setTlname("dixit");
			teachers1.setTid(202);
			//teachers 3 detail
			Teachers teachers2= new Teachers();
			teachers2.setTfname("gaurav");
			teachers2.setTlname("kumar");
			teachers2.setTid(203);
			//teachers 4 detail
			Teachers teachers3= new Teachers();
			teachers3.setTfname("vishal");
			teachers3.setTlname("singh");
			teachers3.setTid(204);
			// creating the list of teachers
			List<Teachers> teacherlist=new ArrayList<>();
			teacherlist.add(teachers);
			teacherlist.add(teachers1);
			teacherlist.add(teachers2);
			teacherlist.add(teachers3);
			// creating subjects 1
			Subjects subjects =new Subjects();
			subjects.setSubid(1);
			subjects.setSubname("English");
			// creating subject 2
			Subjects subjects1 =new Subjects();
			subjects1.setSubid(2);
			subjects1.setSubname("Mathematics");
			//creating subject 3
			Subjects subjects2 =new Subjects();
			subjects2.setSubid(3);
			subjects2.setSubname("Science");
			// creating list of subjects
			List<Subjects> subjectslist= new ArrayList<>();
			subjectslist.add(subjects);
			subjectslist.add(subjects1);
			subjectslist.add(subjects2);
			//creating a class object to input the values
			Classrooms cr=new Classrooms();
			cr.setClassid(1);
			cr.setClassname("class A");
			cr.setStudents(studentlist);
			cr.setTeachers(teacherlist);
			cr.setSubjects(subjectslist);
			
			
			s.save(cr);
			tx.commit();
			s.close();
			
			}
			catch(Exception e) {
			e.printStackTrace();
			
			}
		
	}

}
