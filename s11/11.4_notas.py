PORCENTAJE_CALIFICACIONES = 0.4
PORCENTAJE_EXAMENES = 0.50
PORCENTAJE_TRABAJO = 0.10

calificacion1, calificacion2, calificacion3 = input().split()
examen_final, trabajo_final = input().split()
calificacion_1 = float(calificacion1)
calificacion_2 = float(calificacion2)
calificacion_3 = float(calificacion3)
examen_final = float(examen_final)
trabajo_final = float(trabajo_final)

nota_calificaciones = (
    (calificacion_1 + calificacion_2 + calificacion_3) / 3
) * PORCENTAJE_CALIFICACIONES

nota_trabajos = trabajo_final * PORCENTAJE_TRABAJO

nota_examen = examen_final * PORCENTAJE_EXAMENES

nota_difinitiva = nota_calificaciones + nota_trabajos + nota_examen

print(f"Su nota definitiva es: {nota_difinitiva}")
