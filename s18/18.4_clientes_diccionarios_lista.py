cliente = {
    1: ["Camilo", 45, 1.70],
    2: ["Cesar", 23, 1.75],
    3: ["CAro", 15, 1.60],
    4: ["Camila", 12, 1.76]
}

valor_maximo = max(cliente, key=lambda llave: cliente[llave][1])
print(f"La llave {valor_maximo} tiene el valor {cliente[valor_maximo]}")

mayor = 0

for llave, valor in cliente.items():
    if valor[1] >= mayor:
        mayor = valor[1]
        clave_maxima = llave

print(f"La llave {clave_maxima} tiene el valor {cliente[clave_maxima]}")