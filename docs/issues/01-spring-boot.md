# Spring Boot einbinden

## Typ
Feature

## Beschreibung
Die Applikation soll als Spring-Boot-Applikation starten. Grundlage für alle folgenden REST-Funktionen.

## Akzeptanzkriterien
- [ ] Spring Boot (aktuelle stabile Version mit Java-25-Unterstützung) ist im `pom.xml` eingebunden, inkl. `spring-boot-starter-web` und `spring-boot-starter-test`.
- [ ] `App` ist die `@SpringBootApplication`-Klasse und startet den eingebetteten Webserver.
- [ ] Ein Test prüft, dass der Spring-Kontext startet.
- [ ] `mvn verify` ist grün.

## Tests vorab
nein

## Abhängigkeiten
