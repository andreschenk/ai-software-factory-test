# Suche und Paginierung

## Typ
Feature

## Beschreibung
Die Produktliste soll durchsucht und seitenweise abgerufen werden können.

## Akzeptanzkriterien
- [ ] `GET /products?name=<text>` filtert nach Namen (enthält, ohne Gross-/Kleinschreibung).
- [ ] `GET /products?page=<n>&size=<m>` liefert eine Seite; Standard `page=0`, `size=20`, maximal `size=100`.
- [ ] Antwort enthält `items`, `page`, `size`, `totalItems`, `totalPages`.
- [ ] Ungültige Parameter → 400 im Format aus Issue 04.
- [ ] Tests für Filter, Paginierung und Grenzwerte.

## Tests vorab
nein

## Abhängigkeiten
depends on: Issue 04
