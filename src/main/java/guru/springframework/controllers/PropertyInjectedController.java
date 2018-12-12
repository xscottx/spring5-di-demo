package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class PropertyInjectedController {

  @Autowired
  // @Qualifier("greetingServiceImpl")  Don't need this if the property name matches that of the qualifier, ie. the 'Impl''
  public GreetingService greetingServiceImpl;

  public String sayHello() {
    return greetingServiceImpl.sayGreeting();
  }
}