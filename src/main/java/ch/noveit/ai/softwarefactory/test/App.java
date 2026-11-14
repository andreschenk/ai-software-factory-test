package ch.noveit.ai.softwarefactory.test;

/**
 * Einstiegspunkt des Testprojekts. Wird über Issues schrittweise zu einer Spring-Boot-REST-Applikation ausgebaut.
 */
public final class App {

    static final String NAME = "ai-softwarefactory-test";

    private App() {
    }

    public static void main(String[] args) {
        System.out.println(name());
    }

    static String name() {
        return NAME;
    }
}
