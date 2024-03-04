# Ordnung

### Aufgabe a)

| log n         | ld n          | n   | n * log n     | n^2   | n^3     | 2^n              | 3^n             | n!                |
|---------------|---------------|-----|---------------|-------|---------|------------------|-----------------|-------------------|
| 0             | 0             | 1   | 0             | 1     | 1       | 2                | 3               | 1                 |
| 0.30102999566 | 0.69314718056 | 2   | 0.60205999132 | 4     | 8       | 4                | 9               | 2                 |
| 0.69897000433 | 1.60943791243 | 5   | 3.49485002168 | 25    | 125     | 32               | 243             | 120               |
| 1             | 2.30258509299 | 10  | 10            | 100   | 1000    | 1024             | 59049           | 3628800           |
| 1.30102999566 | 2.99573227355 | 20  | 26.0205999133 | 400   | 8000    | 1048576          | 3.48678 × 10^9  | 2.43290 × 10^18   |
| 1.69897000434 | 3.91202300543 | 50  | 84.9485002168 | 2500  | 125000  | 1.12589 × 10^15  | 7.17897 × 10^23 | 3.04140 × 10^64   |
| 2             | 4.60517018599 | 100 | 200           | 10000 | 1000000 | 1.26765 × 10^30  | 5.15377 × 10^47 | 9.33262 × 10^157  |

### Aufgabe b)
| Aufgabe                        | Lösung |
|--------------------------------|--------|
| f(n) = n^3 + 0.1·2n            | 2^n    | 
| f(n) = 5326 + ln(n)            | ln(n)  |
| f(n) = 2 + 37·n^3 + 0.01 · n^4 | n^4    |
| f(n) = 1000·n + n^3            | n^3    |
| f(n) = n^7 + n!                | n!     |
| f(n) = ln(n) + 1000·n          | n      |

### Aufgabe c)
2, 6, 4, 3, 1, 5

### Aufgabe d)
| Aufgabe     | Lösung |
|-------------|--------|
| O(1)        | 0.1s   | 
| O(n^2)      | ?      |
| O(n*log(n)) | ?      |

### Aufgabe e)

Bekanntlich gilt (vgl. Basiswechsel y x): logx(n) = logy(n) / logy(x)logy(x)ist dabei unabhängig von n bzw. entspricht einem konstanten Zahlenwert!Zwei Logarithmusfunktionen logx(n) und logy(n) mit unterschiedlichen Basen x und y unterscheiden sich demnach nur durch einen konstanten Faktor! Bei der Big-O-Notation ist folglich die Basis bei einer Logarithmusfunktion unerheblich!

### Aufgabe f)

1)
```
public static void exercise1(final int n) {
    doA();
    doB();
    doC(n);
}
```
Antwort: O(1)

----------------
2)
```
public static void exercise2(final int n) {
    for(int i=0; i < n; i++) {
        doA();
    }
    for(int j=0; j < (2 * n); j++) {
        doC(5);
    }
} 
```
Antwort: O(1)

----------------
3)
```
public static void exercise3(final int n) {
    for(int i=0; i < n; i++) {
        doA();
        for(int j=0; j < n; j++) {
            doC(n);
        }
    }
} 

```
Antwort: (n^3)

----------------
4)
```
public static void exercise4(final int n) {
    for (int i = 0; i < n; i++) {
        doD(n);
        for (int j = 0; j < (n + 5); j++) {
            doA();
        }
    }
} 
```
Antwort: O(n^3)

----------------