package com.greenfoxacademy.foxclub.model;


import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;
import java.util.List;

public interface TrickRepository extends CrudRepository<Trick,Id> {

  List<Trick> findAllByLearned();

  List<Trick> findAllByLearnedFalse();
}
