
def sumar(numero1, numero2):
    resultado = numero1 + numero2
    return resultado

def restar(numero1, numero2):
    resultado = numero1 - numero2
    return resultado

def multiplicar(numero1, numero2):
    resultado = numero1 * numero2
    return resultado

def dividir(numero1, numero2):
    resultado = numero1 / numero2
    return resultado

print("Bienvenido a la super calculadora de fundamentos de python")

numero_entrada_1 = int(input("Digite el numero 1: "))
numero_entrada_2 = int(input("Digite el numero 2: "))

print(sumar(numero_entrada_1, numero_entrada_2))
print(restar(numero_entrada_1, numero_entrada_2))
print(multiplicar(numero_entrada_2, numero_entrada_1))
print(dividir(numero_entrada_2, numero_entrada_1))

