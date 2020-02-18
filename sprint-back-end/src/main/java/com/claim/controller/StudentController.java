package com.claim.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.claim.entity.Student;
import com.claim.repository.StudentRepository;

@CrossOrigin
@RestController

public class StudentController {

@Autowired
private StudentRepository studentRepository;

@RequestMapping(value="/submitStudentDetails",
consumes=MediaType.APPLICATION_JSON_VALUE,
produces=MediaType.APPLICATION_JSON_VALUE,
method=RequestMethod.POST)	
public void submitStudentDetails(@RequestBody Student student)
{
	studentRepository.save(student);
}

@RequestMapping(value="/findStudentById",
produces=MediaType.APPLICATION_JSON_VALUE,
method=RequestMethod.GET)
@ResponseBody
private ResponseEntity<Optional<Student>> findStudent(String email)
		{
			Optional<Student> student = studentRepository.findById(email);
			
			
			
			return new ResponseEntity<>(student, HttpStatus.OK);
		}

//private ResponseEntity<Optional<Student>> loginStudent(String password, String email)
//{
//	Optional<Student> student = studentRepository.findById(email);
//	
//	if (student.equals(password))
//	{
//		
//	}
//	
//	
//	return new ResponseEntity<>(student, HttpStatus.OK);
//}

}







