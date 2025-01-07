# k-Nearest Neighbors Algorithmus (KNN)

## 1. Einführung
Der **k-Nearest Neighbors Algorithmus (KNN)** ist ein einfacher, instanzbasierter Algorithmus für Klassifikations- und Regressionsprobleme. Er trifft Vorhersagen basierend auf den **ähnlichsten Datenpunkten (Nachbarn)** in der Trainingsmenge.

---

## 2. Funktionsweise

### **Schritt 1: Speicherung der Trainingsdaten**
- KNN speichert alle Datenpunkte aus der Trainingsmenge \( (X, y) \), wobei \( X \) die Merkmale und \( y \) die Zielwerte sind.
- Es erfolgt kein expliziter Trainingsprozess.

---

### **Schritt 2: Berechnung der Ähnlichkeit (Distanz)**
KNN misst die Distanz zwischen dem neuen Punkt \( x_{\text{neu}} \) und jedem Punkt \( x_i \) in der Trainingsmenge. Gängige Distanzmetriken sind:


## Distanzmetriken

1. **Euklidische Distanz**:  
   Die euklidische Distanz zwischen zwei Punkten \(x\) und \(y\) mit \(n\) Dimensionen berechnet sich wie folgt:  
   d(x, y) = √[(x₁ - y₁)² + (x₂ - y₂)² + ... + (xₙ - yₙ)²]

2. **Manhattan-Distanz**:  
   Die Manhattan-Distanz ist die Summe der absoluten Differenzen der Koordinaten:  
   d(x, y) = |x₁ - y₁| + |x₂ - y₂| + ... + |xₙ - yₙ|

3. **Hamming-Distanz**:  
   Die Hamming-Distanz zählt die Anzahl der Positionen, an denen sich zwei Punkte unterscheiden. Sie wird vor allem bei kategorialen Daten verwendet.

4. **Minkowski-Distanz**:  
   Die Minkowski-Distanz verallgemeinert die euklidische und Manhattan-Distanz. Sie wird durch den Parameter \(p\) bestimmt:  
   d(x, y) = [(|x₁ - y₁|ᵖ + |x₂ - y₂|ᵖ + ... + |xₙ - yₙ|ᵖ)]^(1/p)
---

### **Schritt 3: Auswahl der \( k \)-nächsten Nachbarn**
1. KNN sortiert die Trainingspunkte basierend auf ihrem Abstand zu \( x_{\text{neu}} \).
2. Es wählt die **\( k \)** Punkte mit den kleinsten Abständen als „nächste Nachbarn“ aus.

#### **Wahl von \( k \)**
- \( k \) ist ein Hyperparameter.
- Kleines \( k \): genauere, aber anfälligere Modelle (Overfitting).
- Großes \( k \): glattere, robustere Modelle (kann Underfitting verursachen).

---

### **Schritt 4: Entscheidung basierend auf den \( k \)-Nachbarn**
- **Klassifikation**: Die Klasse mit der Mehrheit der \( k \)-Nachbarn wird dem neuen Punkt zugeordnet.
- **Regression**: Der Durchschnitt der Zielwerte der \( k \)-Nachbarn wird berechnet.

---

## 3. Beispiel

### Problemstellung
Trainingsdaten:

| Punkt | \( x_1 \) | \( x_2 \) | Klasse |
|-------|-----------|-----------|--------|
| A     | 1         | 2         | Rot    |
| B     | 2         | 3         | Blau   |
| C     | 3         | 3         | Blau   |
| D     | 6         | 5         | Rot    |

Neuer Punkt: \( E = (2, 2) \)

### Schritt-für-Schritt:
1. **Abstand berechnen (Euklidische Distanz)**:
   - \( d(E, A) = \sqrt{(2-1)^2 + (2-2)^2} = 1 \)
   - \( d(E, B) = \sqrt{(2-2)^2 + (2-3)^2} = 1 \)
   - \( d(E, C) = \sqrt{(2-3)^2 + (2-3)^2} = 1.41 \)
   - \( d(E, D) = \sqrt{(2-6)^2 + (2-5)^2} = 5 \)

2. **Nachbarn auswählen (\( k=3 \))**:
   - Die 3 nächsten Nachbarn: \( A \), \( B \), \( C \).

3. **Vorhersage**:
   - Klassen der Nachbarn: \( A \) (Rot), \( B \) (Blau), \( C \) (Blau).
   - Mehrheit: Blau. **Vorhersage: Blau**.

---

## 4. Stärken und Schwächen von KNN

### Vorteile:
- Einfach zu implementieren.
- Funktioniert gut bei kleinen Datensätzen.
- Keine Annahmen über die Verteilung der Daten.

### Nachteile:
- **Langsame Vorhersagezeit**: Muss Distanzen zu allen Punkten berechnen.
- **Speicherintensiv**: Speichert die gesamte Trainingsmenge.
- Empfindlich gegenüber irrelevanten Features und Daten-Skalierung.

---

## 5. Tipps zur Anwendung

1. **Daten-Skalierung**:
   - KNN ist empfindlich gegenüber der Skalierung. Verwenden Sie Normalisierung oder Standardisierung.

2. **Wahl von \( k \)**:
   - Wählen Sie \( k \) durch Cross-Validation aus, um Over- oder Underfitting zu vermeiden.

3. **Distanzmetrik**:
   - Experimentieren Sie mit verschiedenen Metriken, um die beste Leistung zu erzielen.

4. **Optimierungen**:
   - Verwenden Sie Datenstrukturen wie k-d-Bäume, um die Berechnung der Distanzen zu beschleunigen.

---

## 6. Zusammenfassung
Der KNN-Algorithmus ist einfach, aber leistungsstark, wenn die richtigen Hyperparameter gewählt werden. Für große Datensätze oder hochdimensionale Daten sind jedoch effizientere Algorithmen oft besser geeignet.

