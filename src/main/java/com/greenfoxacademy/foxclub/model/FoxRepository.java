package com.greenfoxacademy.foxclub.model;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface FoxRepository extends CrudRepository<Fox, Id> {

  Fox findFoxByName(String name);
}
