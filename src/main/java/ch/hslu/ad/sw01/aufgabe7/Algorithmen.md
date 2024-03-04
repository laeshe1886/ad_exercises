# Algorithmen

## Aufgabe a
121, 333, 787, 898

## Aufgabe b
1-stellige symmetrische Zahlen: 9 (1, 2, 3, ..., 9)
2-stellige symmetrische Zahlen: 9 (11, 22, 33, ..., 99)
3-stellige symmetrische Zahlen: 90 (101, 121, 131, ..., 999)
4-stellige symmetrische Zahlen: 900 (1001, 1111, 1221, ..., 9999)

## Aufgabe c 
9 * 10^(n-2)

## Aufgabe d

````
Funktion istSymmetrisch(zahl):
    // Konvertiere die Zahl in einen String
    zahlAlsString = toString(zahl)
    
    // Umkehren des Strings
    umgekehrterString = umkehren(zahlAlsString)
    
    // Überprüfe, ob die umgekehrte Zahl gleich der ursprünglichen Zahl ist
    
    wenn umgekehrterString ist gleich zahlAlsString:
        gib "ja" zurück // Symmetrisch
    sonst:
        gib "nein" zurück // Nicht symmetrisch
````