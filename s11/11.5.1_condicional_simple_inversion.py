 

inversion = float(input("Digite el capital que desea invertir"))
porcentaje_interes = float(input("Ingrese el porcentaje de interes"))
rendimiento = inversion * porcentaje_interes

if rendimiento > 7000:
    capital_final = inversion + rendimiento
    print(f"Este es su capital final {capital_final}")

