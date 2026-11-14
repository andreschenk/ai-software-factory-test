# Simulierte Fehler im Service

## Typ
Feature

## Beschreibung
Der Service simuliert Fehler eines (nicht vorhandenen) Backends, damit die Fehlerbehandlung geprüft werden kann.

## Akzeptanzkriterien
- [ ] Ein Produkt mit bereits vorhandenem `name` anzulegen → 409 Conflict.
- [ ] Ist die Konfiguration `shop.backend.available=false` gesetzt, liefern alle `/products`-Endpunkte 503 Service Unavailable.
- [ ] `/health` liefert in diesem Fall `{"status":"DEGRADED"}` mit HTTP 200.
- [ ] Fehler im Format aus Issue 04.
- [ ] Tests für beide Fälle.

## Tests vorab
nein

## Abhängigkeiten
depends on: Issue 04
