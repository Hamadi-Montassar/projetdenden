package com.fms.My.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.fms.My.entities.Account;

public interface AccountRepository extends CrudRepository<Account, Long>{

}
