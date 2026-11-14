# Validierung und einheitliche Fehlerantworten

## Typ
Feature

## Beschreibung
Ungültige Eingaben werden abgewiesen. Alle Fehler haben ein einheitliches Format.

## Akzeptanzkriterien
- [ ] `name` ist Pflicht, 1–100 Zeichen; `price` ist Pflicht und > 0.
- [ ] Ungültige Eingaben → 400.
- [ ] Unbekannte `id` → 404.
- [ ] Fehlerantworten im Format Problem Details (RFC 9457) mit `type`, `title`, `status`, `detail`; bei 400 zusätzlich die betroffenen Felder.
- [ ] Tests für jeden Fehlerfall.

## Tests vorab
ja

## Abhängigkeiten
depends on: Issue 03
