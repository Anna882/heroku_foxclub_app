package com.greenfoxacademy.foxclub.controller;


import com.greenfoxacademy.foxclub.model.FoxFactory;
import com.greenfoxacademy.foxclub.model.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  private FoxFactory foxFactory;

  @Autowired
  private FoxService foxService;

  @GetMapping(value = "/")
  public String root(@RequestParam(name = "pet_name") String petName, Model model) {
    if (petName != null) {
      model.addAttribute("fox", foxService.findOne(petName));
      return "index";
    } else return "redirect:/login";
  }

  @GetMapping(value = "/login")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping(value = "/login")
  public String login(@RequestParam(name = "pet_name", required = true) String petName, Model model) {
    if(foxService.findOne(petName).equals(null)) {
      foxFactory.addNewFox(petName, "fries", "Coca Cola");
    }
    return "redirect:/?pet_name=" + petName;
  }

}
