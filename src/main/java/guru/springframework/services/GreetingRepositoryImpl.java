package guru.springframework.services;

import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/24/17.
 */
// Used @Component over @Service because it's not a service, but a repo
@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }
}
