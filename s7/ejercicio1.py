"""Imaginen que uds tienen un empresa que se dedica a la comercializacion de computadores, el programa debe permitir ingresar el valor de compra de un computador y al final debe imprimir cua seria el precio de venta si uds quieren generar un 30%  de incremento en el precio original del producto.  Tambien debe imprimir cuando uds se ganan en cada producto"""

print("Progama para facturación de equipos de computo")
print()
nom_compu = input("Digite el nombre de la computadora: ")
val_venta = float(input("Digite el valor del equipo: "))

porcentaje = val_venta  * 0.30
sum = val_venta + porcentaje
#print(porcentaje, sum)

print()
print("El precio total del equipo ",nom_compu," es de ", sum, " Dolares.")
print("las ganancias del equipo para la empresa es de ", porcentaje, " Dolares")