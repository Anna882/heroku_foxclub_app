package com.greenfoxacademy.foxclub.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trick {

  @Id
  private String title;
  private boolean learned;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Trick(String title) {
    this.title = title;
  }

//  public Trick(){}
}
