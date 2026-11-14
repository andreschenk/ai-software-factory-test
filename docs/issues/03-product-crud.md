# Produkte verwalten (CRUD)

## Typ
Feature

## Beschreibung
Produkte sollen über eine REST-Schnittstelle angelegt, gelesen, geändert und gelöscht werden können.
Die Daten liegen im Speicher (keine Datenbank).

## Akzeptanzkriterien
- [ ] Produkt hat `id` (vom Service vergeben), `name` (Text) und `price` (Dezimalzahl, CHF).
- [ ] `POST /products` legt ein Produkt an → 201 mit Produkt und `Location`-Header.
- [ ] `GET /products` liefert alle Produkte, `GET /products/{id}` eines.
- [ ] `PUT /products/{id}` ändert `name` und `price`.
- [ ] `DELETE /products/{id}` löscht → 204.
- [ ] Aufbau: Controller → Service → In-Memory-Repository.
- [ ] Tests für Service und Controller.

## Tests vorab
nein

## Abhängigkeiten
depends on: Issue 01
