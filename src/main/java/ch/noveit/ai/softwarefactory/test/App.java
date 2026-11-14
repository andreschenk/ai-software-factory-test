package ch.noveit.ai.softwarefactory.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Einstiegspunkt des Testprojekts. Wird über Issues schrittweise zu einer Spring-Boot-REST-Applikation ausgebaut.
 */
@SpringBootApplication
public class App {

    static final String NAME = "ai-softwarefactory-test";

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    static String name() {
        return NAME;
    }
}
