package com.fms.My.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.My.entities.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
