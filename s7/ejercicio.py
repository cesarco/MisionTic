"""Hacer un programa que permita que el usuario ingrese 4 numero flotantes y el programa debe imprimir los siguiente resultados:
1 la suma
2 la resta
3 Multiplicacion
4 Division de todos los numeros vamos a redondear el resultado a 3 decimales.
5 Modulo del num1  %  num2
6 Modulo de num4 %  num3
7 num2 elevado num4
8 num3 elevado al num4
9 Con lo que vimos agregen algo más"""

print("Digite 4 numeros separados por espacio")
#  Entrada de datos
num1, num2, num3, num4 = input().split()

#conversion de string a float para hacer opereaciones
num1 = float(num1)
num2 = float(num2)
num3 = float(num3)
num4 = float(num4)

# operaciones
suma = num1 + num2 + num3 + num4
resta = num1 - num2 -num3 - num4
multiplicacion = num1 * num2 * num3 * num4
division = round(num1 / num2, 2)
modulo = num1 % num2
modulo1 = num4 % num3
ele = num2**num4
ele1 = num3**num4
print()

# se asigna una variable para los resultados
r = {
    "la suma es" : suma,
    "la resta es: " :resta,
    "la multiplicacion es:" : multiplicacion,
    "la division es: " :division,
    "el modulo es: " :modulo,
    "el modulo1 es: " :modulo1,
    "la base elevada es de: " :ele,
    "la base elevada1 es de :" :ele1
}
print(type(r))
print(r)
"""
print()
# se hace un ciclo for, para que  muestre los resultados en vertical
for i in r:
    print(i)"""
"""
#print(
    suma ,
    resta,
    multiplicacion,
    division,
    modulo,
    modulo1,
    ele,
    ele1,
    end="\n"
#)
"""