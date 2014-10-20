Packages:

antlr: mit ANTLR Klassen

evtl. rules?

main: Rest

Architektur:

main.java
gui.java
FormulaParser.java
FormulRaule.java

ANTLR generieren:

1. java -jar antlr-4.4-complete.jar Formula.g4
2. java Dateien in antlr Package kopieren
3. Package der java Dateien anpassen

Regeln:

- \, {, } nicht erlaubt

- (a)/(b) -> \frac{a}{b}

Problem: Was tun bei (a)/(b)/(c)... ??
Eigentlich dann \frac{\frac{a}{b}}{c}...

- a*b     -> a\cdot b (oder lieber "ab"?)

- a^b     -> a^{b}

- sqrt(a) -> \sqrt(a)