numero_1, numero_2 =input().split()
numero_1 = int(numero_1)
numero_2 = int(numero_2)

if numero_1 == numero_2:
    print(f"El numero1 {numero_1} es igual qee el numero2 {numero_2}")
elif numero_1 > numero_2:
    print(f"El numero1 {numero_1} es mayor que el numero2 {numero_2}")
else:
    print(f"El numero2 {numero_2} es igual qie el numero1 {numero_1}")
