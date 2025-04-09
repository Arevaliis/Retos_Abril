nombre = input("Dime tu nombre: ").title().strip()

if nombre[0] == "A" and len(nombre) > 7:
    print(f"¡Hola, Asombroso/a {nombre}!. ¡Qué nombre tan largo y sofisticado!.")
elif len(nombre) > 7:
    print(f"¡Vaya {nombre}!, ¡Qué nombre tan largo y sofisticado!.")
else:
    print(f"Saludos {nombre}")