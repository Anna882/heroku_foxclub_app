package com.greenfoxacademy.foxclub.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxService {

  private static FoxDB foxDB;

  @Autowired
  public FoxService(FoxDB foxDB) {
    this.foxDB = foxDB;
  }

  public Fox findOne(String petName) {
    for (Fox fox : FoxDB.getListOfFoxes()) {
      if (fox.getName().equals(petName)) {
        return fox;
      }
    }
    return null;
  }
}
