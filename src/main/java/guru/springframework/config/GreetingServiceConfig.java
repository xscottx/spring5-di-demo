package guru.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.services.GreetingRepository;
import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {

  @Bean
  GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
    return new GreetingServiceFactory(repository);
  }

  // Moved over from service to config and leverage factory to create specific beans
  // Use this technique to move annotations from individual classes over to a configuration to maintain annotations
  @Bean
  @Primary
  @Profile({"default", "en"})
  GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.creatGreetingService("en");
  }

  @Bean
  @Primary
  @Profile("es")
  GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.creatGreetingService("es");
  }

  @Bean
  @Primary
  @Profile("de")
  GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.creatGreetingService("de");
  }
}