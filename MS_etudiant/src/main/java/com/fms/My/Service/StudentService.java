package com.fms.My.Service;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.fms.My.Repositories.StudentRepository;
import com.fms.My.entities.Student;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	public void  saveCompteToDB(MultipartFile file,Student etudiant)
	{
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a a valid file");
		}
		try {
			
		etudiant.setImage_s(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//String date1=null;
		//date1 = new SimpleDateFormat("yyyy-mm-dd").format(dt_nDate); 
		
		
        
        
      studentRepository.save(etudiant);
	}

}
