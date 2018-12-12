package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class SetterInjectedController {
  
  @Autowired
  private GreetingService greetingService;
  
  public String sayHello() {
    return greetingService.sayGreeting();
  }
  
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }
}