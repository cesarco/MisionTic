import datetime

print("Programa para calcular el precio total de un produto con IVA del 16%")


tiempo = datetime.datetime.now()
nom_produc, codigo = input("Digite el nombre del producto y el codigo : ").split()

product = float(input("Ingrese el valor del producto, sin IVA: "))

produccion = product * 0.16

print("-----------------------------------------")
print("|              Factura                   ")
print(f"|  Fecha: {tiempo}                      ")
print("|                                        ")
print(f"|  producto: {nom_produc}               ")
print(f"|  Codigo  : {codigo}                   ")
print(f"|  Precio sin IVA es de: {product} USD  ")
print(f"|  precio con IVA es de: {produccion + product} USD")
print("|                                        ")
print("-----------------------------------------")
