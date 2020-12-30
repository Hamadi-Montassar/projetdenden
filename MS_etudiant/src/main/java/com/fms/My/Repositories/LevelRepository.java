package com.fms.My.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.My.entities.Level;
@Repository
public interface LevelRepository extends CrudRepository<Level, Long> {

}
