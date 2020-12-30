package com.fms.My.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.fms.My.entities.Mark;
import com.fms.My.entities.MarkKey;

public interface MarkRepository extends CrudRepository<Mark,MarkKey> {

}
