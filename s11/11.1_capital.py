

INTERES_ANUAL = 0.15
INTERES_MENSUAL = 0.15 / 12

capital = float(input("Por favor ingrese el capital que desea inveretir"))
rendimiento = capital * INTERES_MENSUAL

print(F"El rendimiento de su inversion despues de un mes es {rendimiento:2f}")

