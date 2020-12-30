package com.fms.My.Controllers;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fms.My.Repositories.AccountRepository;
import com.fms.My.Repositories.StudentRepository;
import com.fms.My.entities.Account;
import com.fms.My.entities.Student;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Students")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private AccountRepository accountRepository;
	
	@GetMapping("/list_students")
	public List<Student> getAllStudents()
	{
		return (List<Student>) studentRepository.findAll();
		
	}
	@GetMapping("/{studentID}")
	public Optional<Student> getStudent(@PathVariable Long studentID)
	{
		
		return studentRepository.findById(studentID);
	}
	@PostMapping("/add_student")
	public List<Object> createStudent(@Valid @RequestBody List<Object> studentaccount)
	{
		Iterator<Object> iterator = studentaccount.iterator();
		studentRepository.save((Student)iterator.next());
		accountRepository.save((Account)iterator.next());
		return studentaccount;
	}
	@PutMapping("/{studentID}")
	public Student updateProvider(@PathVariable Long studentID,@Valid @RequestBody Student studentRequest) 
	{
		 return studentRepository.findById(studentID).map(
				 student -> {

				 student.setNom_s(studentRequest.getNom_s());
				 student.setPrenom_s(studentRequest.getPrenom_s());
				 student.setE_mail_s(studentRequest.getE_mail_s());
				 student.setDt_n_s(studentRequest.getDt_n_s());
				 student.setL_n_s(studentRequest.getL_n_s());
				 student.setNcs(studentRequest.getNcs());
				 student.setImage_s(studentRequest.getImage_s());

				 return studentRepository.save(student);
				 }

				 ).orElseThrow(() -> new IllegalArgumentException("studentId " + studentID + " not found"));
				 }
	 @DeleteMapping("/{studentID}")
	 public ResponseEntity<?> deleteProvider(@PathVariable Long studentID) {
	 return studentRepository.findById(studentID).map(student -> {
	 studentRepository.delete(student);
	 return ResponseEntity.ok().build();
	 }).orElseThrow(() -> new IllegalArgumentException("ProviderId " + studentID
	+ " not found"));
	 }
	

}
