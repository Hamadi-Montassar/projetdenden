package com.fms.My.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.fms.My.entities.Assignment;
import com.fms.My.entities.AssignmentKey;

public interface AssignmentRepository extends CrudRepository<Assignment, AssignmentKey> {

}
