# SandBoxISPW

Repository personale usata come **sandbox di esercitazione** per il corso di Ingegneria del Software.

L’obiettivo è raccogliere piccoli progetti e prove pratiche per:
- apprendere e ripassare i **design pattern**;
- sperimentare concetti di progettazione OO;
- testare esempi rapidi senza vincoli di produzione.

## Contenuti principali

Ogni cartella rappresenta un mini-esercizio indipendente, ad esempio:
- `AbstractFactory`, `Factory`, `Adapter`, `observer`, `decorator`, `state`, `StatePatter`
- `Aggregazione`, `Associazione`, `Composizione`, `Coupling`
- `StudentCorseBCE`, `HomeworkSensor`, `PatternMetamorfosi`, `IO`, `IO2`

Molti esempi hanno una classe `Main` in `src/main/java` per esecuzione rapida.

## Struttura del repository

Non c’è un unico progetto buildabile: è una collezione di esercizi separati.

In generale:
- ogni modulo ha il proprio codice in `src/main/java`;
- alcuni moduli includono risorse o file di appoggio (`src/main/resources`, file `.txt`, ecc.).

## Come eseguire un esempio

1. Entra nella cartella del modulo che vuoi provare (es. `AbstractFactory`).
2. Compila i file Java della cartella `src/main/java`.
3. Esegui la classe `Main` (se presente).

Esempio (da adattare al modulo scelto):

```bash
cd AbstractFactory/src/main/java
javac *.java
java Main
```

## Nota

Questa repository è pensata per studio e sperimentazione, quindi il codice può essere eterogeneo e in evoluzione.
