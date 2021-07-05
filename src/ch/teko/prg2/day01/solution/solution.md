# Day 1
## Solution
### Aufgabe 1

a) In Methoden werden zusammengehörende Code-Einheiten zusammengefasst. 
Methoden abstrahieren einen konplexen Sachverhalt und geben an, was sie beim Aufruf verlangen (Signatur einer Methode) und als Resultat zurückliefern. 
Methoden werden in Klassen definiert. 

b) Eine Klasse ist der Bauplan, Blueprint. Ein Objekt ist dann seine konkrete Umsetzung. 
Jedes Objket der gleichen Klasse hat die gleichen Attribute und Methoden, ist aber für sich einzigartig, da die Attribute jeweils unterschiedliche Werte annehmen können. 
Programmiert werden Klassen. Zur Laufzeit interagieren Objekte.

c) Mit // für eine einzelne und /* ... */ für mehrere Zeilen.

d) Der Dateiname besteht aus dem Namen der Klasse und der Dateiendung .java.

e) Methoden werden ausgehend von einem instanziierten Objekt einer Klasse gefolgt von einem **.** aufgerufen. 
Methoden können Parameter erwarten. Eine Ausnahme bilden Methoden mit dem **Schlüsselwort static**. 
Diese können ohne Objekt Referenz direkt aufgerufen werden. Ein Beispiel für eine static Methode ist die main Methode.

f) trennen Anweisungen voneinander.

g) Klassen gross. Attribute, Variablen und Methoden klein.

h) Es wird die Klasse Arrays aus dem Package java.util, teil des JDK's, importiert. 

### Aufgabe 2

individuell.

### Aufgabe 3

siehe Code im package Aufgabe 3.

### Aufgabe 4

siehe Code der main Methode im package Aufgabe 3.

### Aufgabe 5

Die Code-Lösung befindet sich im Package *ch.teko.prg.day01.solution*.
Vergleichen Sie auch die beiden Klassendiagramme mit dem Namen Kesselturm.

#### Klasse Etage
Das Array *parkplaetze* vom Typ Parkplatz verschiebt sich von der Klasse Parkhaus zur neu erstellten Klasse Etage. Gemäss Aufgabenstellung gibt es pro Etage genau ein Ticketautomat. Somit verschiebt sich auch das Attribut vom Typ Ticketautomat zur Klasse Etage.
Die Klasse Parkhaus hält neu als Attribut ein Array mit dem Namen etagen vom Klassentyp *Etage*. Das Parkhaus soll aus mehreren Etagen bestehen, die wir dafür ins Array speichern.

#### Klasse Ticketautomat
Die Klasse Ticketautomat wird mit der Methode *calculatePrice* erweitert. Der Sachverhalt wurde folglich interpretiert:

* Der Preis wird nur zu vollen Stunden verbucht, wenn die Parkzeit mehr als 1 Tag/ 1 Woche beträgt.
* Falls die Parkzeit mehr als 1 Woche beträgt, ist jede Woche pauschal 70.-, jeder zusätzliche Tag 20.- und jede zusätzliche, volle Stunde 1.0.-
* Falls die Parkzeit mehr als 1 Tag beträgt aber weniger als 1 Woche, ist jeder Tag pauschal 12.-, jeder zusätzliche Stunde 1.0.-
* Falls die Parkzeit weniger als 1 Tag beträgt, ist das Parken bei weniger als 30 min gratis, zwischen 30 und 90 min 1.5.- und zwischen 90 und 120 min 2.0.-. Ab dann ist jede Stunde zusätzlich 1.0.- CHF 

#### main-Methode in der Klasse Main
Alles Initialisierungen und Instanziierungen von Objekten, geschieht weiterhin in der main-Methode.

Die *for-Schleife* musste erweitert werden zu einer verschachtelten for-Schleife. Dies, weil nun auch die Etagen in einem Array gespeichert werden. Entsprechend musste auch für die Ausgabe eine *verschachtelte for-Schleife* verwendet werden.