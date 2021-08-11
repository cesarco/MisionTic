PORCENTAJE_CALIFICACIONES = 0.4
PORCENTAJE_EXAMENES = 0.50
PORCENTAJE_TRABAJO = 0.10

calificacion1, calificacion2, calificacion3 = input().split()

calificacion_1 = float(calificacion1)
calificacion_2 = float(calificacion2)
calificacion_3 = float(calificacion3)

promedio = (
    (calificacion_1 + calificacion_2 + calificacion_3) / 3
) 

if promedio >= 3.1:
    print("El alumno aprobo")
else:
    print("El alumno reprobo")


