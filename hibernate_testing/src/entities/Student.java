package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="Student")
@IdClass(Student.class)
public class Student implements Serializable{
	
	@Id
	@Column(name="id")
	private int id;
	
	@Id
	@Column(name="first_name")
	private String first_name;
	
	@Id
	@Column(name="last_name")
	private String last_name;
	
	@Id
	@Column(name="email")
	private String email;
	
	
	
	public Student() {
		
	}

	public Student(String first_name, String last_name, String email) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String lastName) {
		this.last_name = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + first_name + ", lastName=" + last_name + ", email=" + email + "]";
	}
}
