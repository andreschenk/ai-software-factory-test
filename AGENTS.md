# AGENTS.md

Projektwissen für Coding-Agenten. Gilt für alle Agenten und Rollen.

## Projekt

Testprojekt der AI Software Factory. Startet als einfaches Java-Programm und wächst über Issues
schrittweise zu einer Spring-Boot-REST-Applikation. **Keine Datenbank:** Daten liegen im Speicher,
Fehlerfälle werden im Service simuliert.

## Technik

- Java 25, Maven
- Basis-Paket: `ch.noveit.ai.softwarefactory.test`
- Tests: JUnit 5 (Jupiter); Assertions aus `org.junit.jupiter.api.Assertions`

## Build

```bash
mvn -B verify
```

## Konventionen

- Produktivcode unter `src/main/java`, Tests unter `src/test/java` im selben Paket wie die getestete Klasse.
- Testklassen heissen `<Klasse>Test`, Testmethoden beschreiben das erwartete Verhalten (`returnsApplicationName`).
- Keine neuen Abhängigkeiten ohne Anforderung im Issue.
- Bestehende Tests nicht abschwächen oder entfernen, um einen Build grün zu machen.
- Code, Bezeichner und Javadoc auf Englisch; Issues und Kommentare auf Deutsch.
