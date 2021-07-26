# Day 2
## Solution
### Aufgabe 1
Die Vererbung ist in Java die stärkste Form der Kopplung. D.h. es besteht eine enge Beziehung zwischen Ober- und Unterklasse. 
Wenn eine Vererbungshierarchie mit Vererbung aufgebaut wird und nachträglich massgebende Änderungen in der Oberklasse durchgeführt werden, 
haben diese auf allen von dieser erbenden Unterklassen massschneidende Änderungseinflüsse. 

Auch bei Interfaces besteht das Problem, dass nachträgliche Änderungen an der Schnittstelle Anpassungen an Klassen zur Folge haben. 
Hier gibt es aber z.B. die Möglichkeit ab Java 8+ mit dem Schlüsselwort **default** implementierte Methoden in Interfaces zu definieren.

In der Vererbung können neben Methoden auch Attribute vererbt werden. Dies ist bei Interface nicht möglich. Bei Interfaces können nur statische, finale Variablen definiert werden.

Bei Java ist Mehrfachvererbung mit **extends** nicht möglich, hingegen über **implements** mit Interfaces möglich. Eine Klasse kann mehrere Interfaces implementieren.

Für Vererbung spricht, wenn sich mehrere Attribute, Methoden in eine gemeinsame (Ober)-Klasse verallgemeinern lassen und die erbenden Unterklassen dann eine Form der Spezialisierung dieser darstellen.

- Beispiel: Oberklasse Konto mit den Unterklassen Girokonto oder Sparkonto.

Mit Interfaces können wir die Definition und die Implementierung von Funktionen voneinander trennen. 
Im Interface steht die Definition (was erwartet die Funktion (Parameter) und was liefert die Funktion zurück (Rückgabetyp)). 
Man kann sich das Interface in dem Sinne auch als Vertrag zwischen 2 Parteien (Entwicklerteams) vorstellen. Zu Beginn wird definiert, 
welche Schnittstellen benötigt werden, um bspw. die Kommunikation zwischen den Produkten der Teams zu garantieren. 
Die Implementierung findet dann in der Klasse statt, die das Interface und alle darin befindlichen Methoden implementiert.

Für Interfaces spricht, wenn der Fokus auf Funktionen liegt und dadurch garantiert werden soll, dass eine Klasse die Funktionen des Interfaces implementiert.

Unterschiede abstrakte Klassen <-> Interface: https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/ und https://www.guru99.com/interface-vs-abstract-class-java.html und https://dzone.com/articles/when-to-use-abstract-class-and-intreface

Aus dem Buch Java Der Grundkurs Rheinwerk von Michael Kofler 2019:

    Abstrakte Klassen und Schnittstellen haben viele Ähnlichkeiten und können auf ähnliche Weise eingesetzt werden. 
    Es gibt aber einen fundamentalen Unterschied: Eine Klasse kann mehrere Schnittstellen implementieren, kann aber nur von einer abstrakten Klasse abgeleitet sein. 
    Dieser Nachteil von abstrakten Klassen kann zwar in gewissen Fällen durch eine mehrstufige Vererbung umgangen werden, das Ergebnis sind dann aber unübersichtliche, tiefe Hierarchien. 
    Nach Möglichkeit sollten Sie Schnittstellen verwenden, um einige wenige Methoden zu deklarieren, die für eine kleine, überschaubare Funktion erforderlich sind. 
    Abstrakte Klassen eignen sich hingegen primär dafür, ein breites, funktionsreiches Fundament für eine Gruppe von Klassen zu bilden, die von ihnen abgeleitet sind.


### Aufgabe 2
Jede Unterklasse implementiert die Methode *calculateArea(...)*

### Aufgabe 3
- 3 Packages
- 2 Interfaces
- 2 Enums
- Die Klasse Main bleibt im root-Verzeichnis (package aufgabe3). Damit sie aber auf die Packages zugreifen kann, müssen die neuen sub-Packages *auto, parkhaus, ticketautomat* imporitert werden.