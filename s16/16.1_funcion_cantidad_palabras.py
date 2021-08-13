def contar_palabras(palabras):
    lista = palabras.split()
    print(lista)
    return len(lista)

frase_inicial = input("Digite la frase que desea verificar: ")
print(f"La frase ingresada tiene {contar_palabras(frase_inicial)} palabras")