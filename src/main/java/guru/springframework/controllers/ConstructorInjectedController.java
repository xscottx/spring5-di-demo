package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

public class ConstructorInjectedController {
  private GreetingService greetingService;

  // using constructor-based injection over setter-based injection
  public ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  String sayHello() {
    return greetingService.sayGreeting();
  }
}