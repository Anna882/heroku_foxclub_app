package com.greenfoxacademy.foxclub.controller;


import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.model.FoxRepository;
import com.greenfoxacademy.foxclub.model.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  private FoxRepository foxRepository;
  @Autowired
  private FoxService foxService;

  @GetMapping(value = "/")
  public String root(@RequestParam(name = "pet_name", required = false) String petName, Model model) {
    if (petName != null) {
      model.addAttribute("fox", foxRepository.findFoxByName(petName));
      return "index";
    }
    return "redirect:/login";
  }

  @GetMapping(value = "/login")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping(value = "/login")
  public String login(@RequestParam(name = "pet_name") String petName) {
    if(!foxRepository.findFoxByName(petName).getName().equals(petName)) {
      foxRepository.save(new Fox(petName, "fries", "Coca Cola"));
    }
    return "redirect:/?pet_name=" + petName;
  }

}
