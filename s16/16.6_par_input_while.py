
def es_par(numero_validar):
    if numero_validar % 2 == 0:
        return "es par"
    else:
        return "No es par"

numero_entrada = input("Digite su numero de entradas")

while not(numero_entrada.isdigit()):
    numero_entrada = input("Digite su numero entrada")

print(type(numero_entrada))
print(es_par(int(numero_entrada)))