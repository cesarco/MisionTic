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



def es_par(numero_validar):
    """Esta funcion retorna la si un numero es par o impar
        parametros:
        

        parametros:

    """
    if numero_validar % 2 == 0:
        return "es par"
    else:
        return "No es par"