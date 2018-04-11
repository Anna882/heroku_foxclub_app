package com.greenfoxacademy.foxclub.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoxFactory {

  private FoxDB foxDB;

  @Autowired
  public FoxFactory(FoxDB foxDB) {
    this.foxDB = foxDB;
  }

  private Fox createFox(String name, String food, String drink) {
    Fox fox = new Fox(name, food, drink);
    return fox;
  }

  public FoxDB addNewFox(String name, String food, String drink) {
    foxDB.getListOfFoxes().add(createFox(name, food, drink));
    return foxDB;
  }
}
