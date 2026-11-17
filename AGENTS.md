# AGENTS.md

Projektwissen für Coding-Agenten. Gilt für alle Agenten und Rollen.

## Projekt

Testprojekt der Charly Factory. Startet als einfaches Java-Programm und wächst über Issues
schrittweise zu einer Spring-Boot-REST-Applikation. **Keine Datenbank:** Daten liegen im Speicher,
Fehlerfälle werden im Service simuliert.

## Technik

- Java 25, Maven, **Spring Boot 4.1** (Spring Framework 7)
- Basis-Paket: `ch.noveit.ai.charly.factory.test`, Startklasse `App` (`@SpringBootApplication`)
- Tests: JUnit 6 (Jupiter, kommt mit `spring-boot-starter-test`); Assertions aus `org.junit.jupiter.api.Assertions`
- JUnit-Version nicht selbst festlegen (kein `junit-bom`): Spring Boot 4 braucht JUnit 6, ein älterer Pin
  lässt jeden `@SpringBootTest` mit `NoSuchMethodError` scheitern.

## Versionen

Fest vorgegeben; nicht nachschlagen und nicht ändern:

- **Spring Boot 4.1.2** als Parent (`spring-boot-starter-parent`). Starter und von Spring Boot verwaltete
  Bibliotheken **ohne eigene `<version>`** eintragen; die Version kommt aus dem Parent.
- **Maven 3.10.0**.
- Java 25.

## REST-Endpunkte testen (Spring Boot 4)

Geprüftes Muster – Imports genau so übernehmen. Es braucht nur `spring-boot-starter-test`, keine weitere
Abhängigkeit.

```java
package ch.noveit.ai.charly.factory.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class GreetingControllerTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        // MockMvc aus dem Anwendungskontext statt @AutoConfigureMockMvc: braucht in Spring Boot 4 kein Zusatzmodul.
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    void returnsGreetingAsJson() throws Exception {
        mockMvc.perform(get("/greeting"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.message").value("Hallo"));
    }

    @Test
    void returnsNotFoundForUnknownPath() throws Exception {
        mockMvc.perform(get("/unknown"))
                .andExpect(status().isNotFound());
    }
}
```

## Build

```bash
mvn -B verify
```

## Konventionen

- Produktivcode unter `src/main/java`, Tests unter `src/test/java` im selben Paket wie die getestete Klasse.
- Testklassen heissen `<Klasse>Test`, Testmethoden beschreiben das erwartete Verhalten (`returnsApplicationName`).
- Keine neuen Abhängigkeiten ohne Anforderung im Issue.
- Bestehende Tests nicht abschwächen oder entfernen, um einen Build grün zu machen.
- **Kommentare, Javadoc, Doku und Commit-Nachrichten auf Deutsch.** Bezeichner (Klassen, Methoden, Variablen) auf Englisch.
- Kommentare erklären das **Warum** (Designentscheidung), nicht das Offensichtliche.
