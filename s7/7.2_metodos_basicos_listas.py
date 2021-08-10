datos = [7, 2, 13, 1, 20, 6, 28]

datos[1] = 100 # asignar un nuevo valor a la lista de numeros en la posion 1
datos[-1] = 14
# f2 para reemplazar en nombre de las veriables
print(datos)

datos.append(7) # con append agrego elementos al final de la lista
print(datos)

datos.insert(3, 444)
print(datos)

datos.pop(-1)
print(datos)

del datos [3:5] # elimino los elementos que se encuentren desde la posicion 3 hasta las posicion [5 -1]
print(datos)

print("acabe")


