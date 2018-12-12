package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
  
  @Override
  public String sayGreeting() {
    return "hello - I was injected via the setter!!";
  }
}