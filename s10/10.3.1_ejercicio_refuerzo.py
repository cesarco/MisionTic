print("Progama para calcula la varianza de cinco numeros")  # Nombre del programa


storage = [
    10,
    20,
    30,
    45.2,
    50,
    55,
    70,
    15,
    18,
    37,
    2,
    4,
    99,
    100,
    86.4,
]  # lista de numeros


promedio = (
    storage[10] + storage[11] + storage[12] + storage[13] + storage[14]
) / 5  # para sacar la varianza, primero tengo que sacar el promedio de los datos. que son las posiciones de la 10 a la 14

varianza = (
    (storage[10] - promedio) ** 2
    + (storage[11] - promedio) ** 2
    + (storage[12] - promedio) ** 2
    + (storage[13] - promedio) ** 2
    + (storage[14] - promedio) ** 2
) / 5  # cuando ya tengo el promedio lo que hago a hora. es restar storage (con cada una de las posiciones) con el promedio y elevarlo a la 2
# yes i got it, i'm the best. "BANGARANG"


storage.append(
    varianza
)  # con append agrego el resultado de la varianza al final de la lista (storage)

print(storage)

