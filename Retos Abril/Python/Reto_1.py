def redondear_notas(nota):
    """ Redondeamos la nota al numero entero mas proximo """
    return f"Nota del alumno:{round(nota)}"

print(redondear_notas(float(input("Introduce la nota del alumno: "))))