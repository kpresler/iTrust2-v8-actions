package edu.ncsu.csc.iTrust2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication ( scanBasePackages = { "edu.ncsu.csc.iTrust2" } )
public class ITrust2Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ITrust2Application.class);
    }

    public static void main ( final String[] args ) {
        SpringApplication.run( ITrust2Application.class, args );
    }

}
