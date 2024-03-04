# Ackermann

### Aufgabe 1
nicht primitiv rekursiv = verschachtelt ``ackermann(m - 1, ackermann(m, n - 1))``

### Aufgabe 2, 3

| n | m | return | calls |
|---|---|--------|-------|
| 0 | 4 | 5      | 1     |
| 1 | 2 | 4      | 6     |
| 2 | 2 | 7      | 27    |
-------------------------
n = 0, m = 4
1. ackermann(0,4)

-----------------------------
n = 1, m = 2
1. ackermann(1, 2)
2. ackermann(1, 1)
3. ackermann(1, 0)
4. ackermann(0, 1)
5. ackermann(0, 2)
6. ackermann(0, 3)
-----------------------------
n = 2, m = 2
1. ackermann(2, 2)
2. ackermann(2, 1)
3. ackermann(2, 0)
4. ackermann(1, 1)
5. ackermann(1, 0)
6. ackermann(0, 1)
7. ackermann(0, 2)
8. ackermann(1, 3)
9. ackermann(1, 2)
10. ackermann(1, 1)
11. ackermann(1, 0)
12. ackermann(0, 1)
13. ackermann(0, 2)
14. ackermann(0, 3)
15. ackermann(0, 4)
16. ackermann(1, 5)
17. ackermann(1, 4)
18. ackermann(1, 3)
19. ackermann(1, 2)
20. ackermann(1, 1)
21. ackermann(1, 0)
22. ackermann(0, 1)
23. ackermann(0, 2)
24. ackermann(0, 3)
25. ackermann(0, 4)
26. ackermann(0, 5)
27. ackermann(0, 6)