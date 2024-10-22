# Einführung in Bäume in der Informatik (Java)

## Was ist ein Baum?

Ein **Baum** ist eine spezielle, nicht-lineare Datenstruktur, die aus Knoten besteht. Anders als Listen oder Arrays, die linear organisiert sind, sind Bäume hierarchisch aufgebaut. Bäume werden häufig in der Informatik verwendet, um Daten effizient zu speichern und zu durchsuchen.

### Merkmale eines Baums:
- **Wurzelknoten (Wurzel)**: Der oberste Knoten im Baum.
- **Kindknoten (Kinder)**: Knoten, die von einem anderen Knoten ausgehen.
- **Elternknoten (Eltern)**: Jeder Knoten hat höchstens einen Elternknoten, außer der Wurzelknoten, der keinen Elternknoten hat.
- **Blattknoten (Blätter)**: Knoten ohne Kinder. Sie befinden sich am unteren Ende des Baums.
- **Höhe des Baums**: Die Anzahl der Kanten auf dem längsten Pfad von der Wurzel zu einem Blatt.

### Beispiel für einen Baum:

   
    10  <-- Wurzel
   /  \
  5   20
 / \   \
3   7   30


In diesem Beispiel:
- Der Knoten `10` ist die **Wurzel** des Baums.
- Die **Kinder** von `10` sind `5` und `20`.
- Die **Eltern** von `5` und `20` ist der Knoten `10`.
- Die **Blätter** sind die Knoten `3`, `7` und `30`, weil sie keine Kinder haben.
- Die **Höhe** des Baums ist 2, da der längste Pfad von der Wurzel zu einem Blatt über zwei Kanten verläuft (z.B. von `10` über `20` zu `30`).

## Binäre Bäume

Ein **binärer Baum** ist eine spezielle Art von Baum, bei dem jeder Knoten höchstens zwei Kinder hat, die oft als **linkes Kind** und **rechtes Kind** bezeichnet werden.

### Eigenschaften eines binären Baums:
- **Linkes Kind**: Das Kind, das links vom Elternknoten liegt.
- **Rechtes Kind**: Das Kind, das rechts vom Elternknoten liegt.
  
### Ein binärer Baum kann verschiedene Formen haben:
- **Vollständiger binärer Baum**: Jeder Knoten hat entweder zwei Kinder oder ist ein Blattknoten.
- **Vollständig gefüllter Baum**: Alle Blätter befinden sich auf der gleichen Höhe und alle inneren Knoten haben zwei Kinder.

## Binäre Suchbäume (Binary Search Trees)

Ein **binärer Suchbaum (BST)** ist ein spezieller binärer Baum, bei dem jeder Knoten die folgende Eigenschaft hat:
- Alle Werte der **linken Kinder** sind kleiner als der Wert des Elternknotens.
- Alle Werte der **rechten Kinder** sind größer als der Wert des Elternknotens.

### Beispiel für einen binären Suchbaum:

    50
   /  \
 30    70
/ \   / \
20 40 60 80

Hier gilt:
- Der Wert `30` ist kleiner als `50` und liegt links davon.
- Der Wert `70` ist größer als `50` und liegt rechts davon.
- Dasselbe Prinzip gilt für alle anderen Knoten.

### Operationen in einem binären Suchbaum
1. **Einfügen** eines Elements:
   - Beginne bei der Wurzel und finde die korrekte Position, basierend auf dem Wert.
   - Wenn der Wert kleiner ist als der aktuelle Knoten, gehe nach links. Ist der Wert größer, gehe nach rechts.
   - Wenn eine leere Position gefunden wird, füge den neuen Knoten dort ein.

2. **Suchen** eines Elements:
   - Beginne bei der Wurzel.
   - Wenn der gesuchte Wert kleiner ist, suche im linken Teilbaum. Wenn er größer ist, suche im rechten Teilbaum.
   - Wiederhole diesen Prozess, bis der Wert gefunden wird oder ein Blattknoten erreicht wird (was bedeutet, dass der Wert nicht im Baum ist).

3. **Traversierung** des Baums:
   - **In-Order-Traversierung (Links, Wurzel, Rechts)**: Durchläuft den Baum in aufsteigender Reihenfolge.
   - **Pre-Order-Traversierung (Wurzel, Links, Rechts)**: Durchläuft den Baum, indem die Wurzel zuerst ausgegeben wird.
   - **Post-Order-Traversierung (Links, Rechts, Wurzel)**: Durchläuft den Baum, indem die Kinder vor der Wurzel ausgegeben werden.

