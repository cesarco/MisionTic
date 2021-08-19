cliente = {
    1006860796 : ["Cesar", "Luis", "Rodriguez", "Solera"],
    1078680786 : ["Paola", "Antonienta", "Rodriguez", "Valencia"],
    1004811118 : ["Carlos", "antonio", "soler"],
    10068696 : ["Lina", "Paola", "Rodriguez", "Solera"],
    101068606 : ["Bertilda", "Solera", "Martinez"]

}

cliente[888] = ["Luis", "Alonso", "Martinez"]

print(cliente)
print(len(cliente))
print(cliente[1006860796][2])

"""Error porque la llave no esta en el diccionario
print(cliente[999]
"""
datos = cliente[1006860796]
datos.append("PRUEBA")
cliente[1006860796] = datos
print(cliente)

resultado = cliente.get[1006860796]
if(resultado):
    print(f"Cliente encontra esta es su informacion: {resultado}")
else:
    print