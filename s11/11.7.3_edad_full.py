edad = int(input("Digite su edad: "))

if edad >= 18:
    print("Eres mayor de edad")
elif edad < 0:
    print("No puedes tener una edad negativa")
else:
    print("Eres menor de edad")
