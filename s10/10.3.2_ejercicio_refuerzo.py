from math import (
    pi,
)  # llamo la libreria math y importo el modulo pi, para poder hacer la operacion requerida

print(
    "Programa para calcula el area de un circulo dado su radio"
)  # Nombre del programa

print()

radio = float(
    input("Digite el radio de un circulo: ")
)  # ingreso de datos, en este caso el radio del circulo

Area = round(
    pi * radio ** 2, 4
)  # Operacion para saber el area del circulo teniendo ya el radio y del resultado se de dondea a 4 digitos despues del 0

print(f"El Área del circulo es de {Area}")  # Se imprime el resultado
