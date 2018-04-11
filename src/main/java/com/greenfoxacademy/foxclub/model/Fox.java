package com.greenfoxacademy.foxclub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fox {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private TrickRepository trickRepository;
  private String food;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TrickRepository getTrickRepository() {
    return trickRepository;
  }

  public void setTrickRepository(TrickRepository trickRepository) {
    this.trickRepository = trickRepository;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  private String drink;

  public String getName() {
    return name;
  }

  public TrickRepository getListOfTricks() {
    return trickRepository;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public Fox(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
  }
}
