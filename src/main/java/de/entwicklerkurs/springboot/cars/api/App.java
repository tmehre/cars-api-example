package de.entwicklerkurs.springboot.cars.api;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(App.class).web(WebApplicationType.SERVLET).build().run(args);
    }
}
