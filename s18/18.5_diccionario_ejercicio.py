condicion = True

Agenda_telefono = {
    "Cesar" : 6682974,
    "Daniel" : 667845,
    "Pilar" : 4577889,
    "Paola" : 3544925
    }

mensaje = (
    "------------------------------------------------------\n"
    "Bienvenidos a la agenda de telefonos de python mision TIC\n"
    "------------------------------------------------------\n"
    "Usted tienes la siguientes opciones\n"
    "1. Consultar Contacto"
    "2. Añadir contacto"
    "3. Modificar Contacto"
    "4. Borrar Contacto"
    "5. Salir"
)

while True:
    print(mensaje)
    opcion = input("Por favor elija uno de las opciones definidas: ")

    while opcion not in ("")