info_clientes = {
    "Cesar" : 19,
    "Daniel" : 29,
    "Pilar" : 45
    }

print(info_clientes)
print(info_clientes["Cesar"])

info_clientes["Juan"] = 20 # Crea una nueva llave y asigna el valor 2
print(info_clientes)

del info_clientes["Juan"]
print(info_clientes)