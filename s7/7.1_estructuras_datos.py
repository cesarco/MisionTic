numero = 2

numeros = [7, 2, 13, 1, 20, 6, 28]
print(numeros)
print(numeros[4]) # cuando quiero imprimir el contenido de un posicion en especifico utliza los [] y lo coloco la posicion que deseo imprimir "20"
print(numeros[-1])
print(numeros[-2])
print(numeros[2], numeros[5])
print(numeros[2:5])# imprimir los elemtos que se encuentran desde la posion 2 hasta la posicion (5-1)

suma = numeros[2] + numeros[-1]
print(suma)
print(len(numeros)) # imprime la cantidad de elementos que hay en la lista numeros




#tuplas inmutables
numeros_tuplas =(1, 2, 3, 4, 5, 6, 7)
print(numeros_tuplas[-1])

# Conjunto nos permite filtrar elementos repetidos
conjuntos = {1, 5, 2, 3, 4, 5, 6, 1, 4, 2, 3, 2, 1}
print(conjuntos)

futbolista = {
    1 : ["Ospina",1, "arquero"],
    13: "Mina",
    10: "James",
    9 : "Falcao"

}

print(futbolista[1])
print(futbolista[1][2])