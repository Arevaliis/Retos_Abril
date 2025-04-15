import re

def valildar_contrasenya(contrasena):
    """Función que compara la contraseña con las restricciones para ver si es segura y valida"""
    patron = re.compile(
                        r"(?=.*[a-z])"      # Debe tener una minuscula
                        r"(?=.*[A-Z])"      # Debe contener una mayuscula
                        r"(?=.*[0-9])"      # Debe contener un numero
                        r"(?=.*[*?!^“$])"   # Debe contener un simbolo especial; *, ?, !, ^, “, $.
                        r".{8,}"            # Debe tener al menos 8 digitos
                        )
    return patron.match(contrasena) and 'git' not in contrasena.lower()

if valildar_contrasenya(input("Introduzca su contraseña: ")):
    print("Contraseña segura y valida")
else:
    print("Esta contraseña no cumple con las reglas o no es segura. ")
