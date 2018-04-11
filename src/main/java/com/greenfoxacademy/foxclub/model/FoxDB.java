package com.greenfoxacademy.foxclub.model;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FoxDB {

  private static List<Fox> listOfFoxes = new ArrayList<>(Arrays.asList());

  public static List<Fox> getListOfFoxes() {
    return listOfFoxes;
  }

}
