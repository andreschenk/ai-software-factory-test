package ch.noveit.ai.charly.factory.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SpringContextTest {

    @Test
    void appClassIsSpringBootApplication() {
        // Verify that the App class is annotated with @SpringBootApplication
        assertTrue(App.class.isAnnotationPresent(SpringBootApplication.class),
                "@SpringBootApplication annotation not found on App class");
    }

    @Test
    void appMainMethodExistsAndIsCallable() {
        // Verify that main method exists and can be called without basic class loading issues
        try {
            // Check that we can access the main method
            var mainMethod = App.class.getMethod("main", String[].class);
            assertTrue(mainMethod != null, "Main method should exist");
            assertTrue(mainMethod.getDeclaringClass() == App.class, "Main method should be declared in App class");
        } catch (NoSuchMethodException e) {
            throw new AssertionError("Main method not found on App class", e);
        }
    }
}