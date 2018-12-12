package guru.springframework.services;

public class GreetingServiceImpl implements GreetingService {
  
  public static String HELLO_GURUS = "Hello world";
  
  @Override
  public String sayGreeting() {
    return "Hello world";
  }
}