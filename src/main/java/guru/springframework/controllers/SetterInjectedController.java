package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class SetterInjectedController {
  
  private GreetingService greetingService;
  
  public String sayHello() {
    return greetingService.sayGreeting();
  }
  
  // put the autowired where the DI happens
  @Autowired
  public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }
}