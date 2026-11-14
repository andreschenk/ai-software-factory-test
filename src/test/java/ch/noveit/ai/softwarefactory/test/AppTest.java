package ch.noveit.ai.softwarefactory.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void returnsApplicationName() {
        assertEquals("ai-softwarefactory-test", App.name());
    }
}
