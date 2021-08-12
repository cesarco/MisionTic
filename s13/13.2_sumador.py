suma_par = 0
suma_impar = 0
print("vamos a sumar los numeros 1-10")

for numeros in range(0,11,2):
    suma_par = suma_par + numeros

print(f"La suma de los numeros de 1-10 es {suma_par}")


for numeros in range(1,101,2):
    suma_impar = suma_impar + numeros

print(f"La suma de los numeros de 1-10 es {suma_impar}")