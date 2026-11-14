# Produktkategorien

<!-- Prüft BLOCKED: wird erst gestartet, wenn Issue 06 gemergt ist. -->

## Typ
Feature

## Beschreibung
Produkte werden einer Kategorie zugeordnet; die Suche kann nach Kategorie filtern.

## Akzeptanzkriterien
- [ ] Kategorien sind fest vorgegeben: `FOOD`, `BOOKS`, `ELECTRONICS`, `OTHER`.
- [ ] `category` ist Pflichtfeld beim Anlegen und Ändern; ungültiger Wert → 400.
- [ ] `GET /products?category=<wert>` filtert, kombinierbar mit `name` und Paginierung aus Issue 06.
- [ ] Tests für Validierung und Filter.

## Tests vorab
nein

## Abhängigkeiten
depends on: Issue 06
