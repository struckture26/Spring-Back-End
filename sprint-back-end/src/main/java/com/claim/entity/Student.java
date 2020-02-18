package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student {

@Column(name="first_name")
private String firstName;
@Column(name="last_name")
private String lastName;
@Id
@Column(name="email")
private String email;
//@Column(name="password")
//private String password;
@Column(name="age")
private String age;
@Column(name="telephone")
private String telephone;



public Student()
{}

public Student (String firstName, String lastName, String email, String password, String age, String telephone)
{
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	//this.password = password;
	this.age = age;
	this.telephone = telephone;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

//public String getPassword() {
//	return password;
//}
//
//public void setPassword(String password) {
//	this.password = password;
//}

}