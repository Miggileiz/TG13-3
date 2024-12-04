# k-Nearest Neighbors Algorithmus (KNN)

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
