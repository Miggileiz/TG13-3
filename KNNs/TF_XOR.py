import os
import tensorflow as tf
import numpy as np

# Sicherstellen, dass nur die CPU verwendet wird (wichtig für GitHub Codespaces)
os.environ["CUDA_VISIBLE_DEVICES"] = "-1"

# Überprüfen, welche Geräte verfügbar sind
print("Verfügbare Geräte:", tf.config.list_physical_devices())

# XOR-Daten erstellen
X = np.array([[0, 0], [0, 1], [1, 0], [1, 1]], dtype=np.float32)
y = np.array([[0], [0], [0], [1]], dtype=np.float32)

# Modell definieren
model = tf.keras.Sequential([
    tf.keras.layers.Dense(8, activation='relu', kernel_initializer='glorot_uniform', input_shape=(2,)),
    tf.keras.layers.Dense(4, activation='relu', kernel_initializer='glorot_uniform'),
    tf.keras.layers.Dense(1, activation='sigmoid')
])

# Modell kompilieren
model.compile(optimizer=tf.keras.optimizers.Adam(learning_rate=0.01),
              loss='binary_crossentropy',
              metrics=['accuracy'])

# Modell trainieren (verbose 1 zeigt epochen an)
model.fit(X, y, epochs=500, verbose=1)

# Vorhersagen testen
predictions = model.predict(X)
print("Vorhersagen:\n", predictions)
print("Gerundete Vorhersagen:\n", np.round(predictions))
