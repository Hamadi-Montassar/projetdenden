package com.fms.My.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.My.entities.Specialty;
@Repository
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {

}
