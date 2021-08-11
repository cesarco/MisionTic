

#variables y constates

PORCENTAJE_COMISION = 0.10

# Entradas de informacion

salario_base = float(input("Ingrese el salario base"))
ventas = float(input("Ingrese el total de las ventas"))

#proceso
comision = ventas * PORCENTAJE_COMISION
salario_con_comision = salario_base + comision

#Salidas

print(f"las comisiones de este mes son {comision}")
print(f"El salario que recibira es de {salario_con_comision}")