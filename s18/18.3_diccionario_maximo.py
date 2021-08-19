info_clientes = {
    "Cesar" : 19,
    "Daniel" : 29,
    "Pilar" : 45,
    "bolt" : 126,
    "Jorge" : 34

    }

print(max(info_clientes)) # imprimo el valor maximo de las llaves del diccionario
print(max(info_clientes.values()))
print(max(info_clientes.items()))
print()
valor_maximo = max(info_clientes, key=info_clientes.get)
print(f"La llave {valor_maximo} tiene el valor {info_clientes[valor_maximo]}")

valor_minimo = min(info_clientes, key=info_clientes.get)
print(f"La llave {valor_minimo} tiene el valor {info_clientes[valor_minimo]}")

valor_maximo = max(info_clientes, key=lambda llave: info_clientes[llave])
print(f"La llave {valor_maximo} tiene el valor {info_clientes[valor_maximo]}")

""" mayor = 0
menor = 0 
 """
mayor = info_clientes["Cesar"]
menor = info_clientes["Cesar"]

for llave, valor in info_clientes.items():
    if valor > mayor:
        mayor = valor
        clave_maxima = llave

print(f"La llave {clave_maxima} tiene el valor {info_clientes[clave_maxima]}")


for llave, valor in info_clientes.items():
    if valor <= menor:
        menor = valor
        clave_minima = llave

print(f"La llave {clave_minima} tiene el valor {info_clientes[clave_minima]}")