
def valor_absoluto(numero):
    """Esta funcion retorna el valor absoluto

        paramentros:
            numero-> int

        return:
            numero -> int
    """
    if numero >= 0:
        return numero
    else:
        return - numero

print(valor_absoluto(-100))