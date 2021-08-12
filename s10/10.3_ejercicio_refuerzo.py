print("Progama para calcula la Media aritmatica de cinco numeros")  # Nombre del programa


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

media = round(
    (storage[10] + storage[11] + storage[12] + storage[13] + storage[14]) / 5, 2
)  # en esta variable (media, llamo la variable (storage) en el cual es un lista de numeros aleatorios, y llamo la posicion de la 10 a la 14

storage.append(
    media
)  # con append agrego el resultado de la media al final de la lista (storage)

print(storage)
