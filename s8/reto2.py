"""Definicion del programa: tener el valor total del producto incluyendo la utilidad y el impuesto.
Datos resultado: valor total del producto.
Procedimiento

"""

print("Programa para el valor total del producto")

nombre_producto, codigo = input("Digite el nombre del producto y codigo separados por un espacio: ").split()
costo_producc = float(input("Digite el costo de produccion del producto "))
print()

Valor_neto = (costo_producc + (costo_producc* 1.20))
utilidad = Valor_neto + (costo_producc * 0.35)

print("El precio para la venta del producto  de",nombre_producto," con el codigo",codigo, " es de:",utilidad, " Dolares")
