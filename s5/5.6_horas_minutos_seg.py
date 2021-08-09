"""
El usuario va inglresar x cantidad de horas y su programa va a decir a cuantos minutos y a cuantos segundos corresponde
"""
print("Programa que calcula los minutos y segundos")
print()

h = int(input("Digite un número de horas, que desea convertir: "))

r = h * 60
r1 = h * 3600

print("El numero de horas que ingresa es: ", h, "y la conversion es: ", r," minutos", "y", r1, "segundos")