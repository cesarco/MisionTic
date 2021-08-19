with open("txt/reporte.txt", "r") as archivo:
    data = archivo.read()
    data = data.split("\n")
    print(type(data))
    print(data)

for linea in data:
    print(linea)