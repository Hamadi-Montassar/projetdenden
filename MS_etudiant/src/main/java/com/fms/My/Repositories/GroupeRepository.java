package com.fms.My.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.My.entities.Groupe;
@Repository
public interface GroupeRepository extends CrudRepository<Groupe, Long>{

}
