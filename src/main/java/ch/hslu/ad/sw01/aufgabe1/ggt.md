# Berechnung ggT

### ggtIterativ1(16, 68)

| Schleifendurchlauf | Rechnung | Resultat |     
|--------------------|----------|----------|
| 1.                 | 68 - 16  | 52       |     
| 2.                 | 52 - 16  | 36       |     
| 3.                 | 36 - 16  | 20       |     
| 4.                 | 20 - 16  | 4        |     
| 5.                 | 16 - 4   | 12       |     
| 6.                 | 12 - 4   | 8        |     
| 7.                 | 8 - 4    | 4        |
| 8.                 | 4 - 4    | 0        |

Um den ggT herauszufinden, werden 7 Schleifendurchläufe benötigt.

### ggtIterativ2

| Schleifendurchlauf | Rechnung | Resultat |
|--------------------|----------|----------|
| 1.                 | 68 % 16  | 4        |
| 2.                 | 16 % 4   | 0        | 

Um den ggT herauszufinden, werden 2 Schleifendurchläufe benötigt.

### ggtRekursiv

| Anzahl Aufrufe | Methodenaufrufe    |
|----------------|--------------------|
| 1.             | getRekursiv(16,68) |
| 2.             | getRekursiv(16,52) |
| 3.             | getRekursiv(16,36) |
| 4.             | getRekursiv(16,20) |
| 5.             | getRekursiv(16,4)  |
| 6.             | getRekursiv(12,4)  |
| 7.             | getRekursiv(8,4)   |
| 8.             | getRekursiv(4,4)   |

Um den ggT herauszufinden, werden 8 Methodenaufrufe benötigt.

-----------

Am effizientesten ist der `ggtIterativ2`, da dieser nur 2 Schleifendurchläufe benötigt und daher am wenigsten Speicher.

Der `ggtRekursiv` ist für den Speicher gesehen, die schlechteste Wahl, da jeder Methodenaufruf im Call Stack gespeichert wird.

-------------
