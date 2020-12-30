package com.fms.My.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.My.entities.Subject;
@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {

}
