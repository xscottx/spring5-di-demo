package guru.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import guru.springframework.beans.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")  // specify the propertysource path and filename
public class PropertyConfig {

  // Read from datasource.properties
  // Use expression language to get value of key
  @Value("${guru.username}")
  private String user;

  @Value("${guru.password}")
  private String password;

  @Value("${guru.dburl}")
  private String url;

  @Bean
  public FakeDataSource fakeDataSource() {
    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setUser(user);
    fakeDataSource.setPassword(password);
    fakeDataSource.setUrl(url);
    return fakeDataSource;
  }

  @Bean
  public static PropertySourcesPlaceholderConfigurer properties() {
    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
    return propertySourcesPlaceholderConfigurer;
  }
}