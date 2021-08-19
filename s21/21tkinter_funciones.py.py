from tkinter import *


def mostrar_mensaje():
    mensaje.configure(text="Estamos volando en python y nadie nos va a detener")

ventana = Tk()

mensaje = Label(ventana, text="Seguimos avanzando con python", fg="#1B29AA", bg="white", font=("Arial", 15))
boton_mostrar = Button(ventana, text="Mostrar", command=mostrar_mensaje)
boton_cerrar = Button(ventana, text="Cerrar", command=ventana.destroy)


mensaje.grid(row=0, column=0, columnspan= 4)
boton_cerrar.grid(row=1, column=1)
boton_mostrar.grid(row=1, column=0)


ventana.mainloop()