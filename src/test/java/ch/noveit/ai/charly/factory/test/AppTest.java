package ch.noveit.ai.charly.factory.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void returnsApplicationName() {
        assertEquals("charly-factory-test", App.name());
    }
}
