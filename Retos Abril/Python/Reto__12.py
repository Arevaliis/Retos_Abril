estaFuncionando = True
lista_numeros_suerte = []

def desea_seguir():
    """Función que pregunta al usuario si desea seguir ejecutando el programa"""
    respuesta = input("¿Desea seguir?: (S/N)").upper().strip()
    match respuesta:
        case "S":  # Si el usuario responde "S", continuar
            return True
        case "N":  # Si responde "N", salir
            print("Saliendo...")
            return False
        case _:  # Cualquier otra respuesta se considera inválida, y se vuelve a preguntar de forma recursiva
            print("Responda S o N. ")
            return desea_seguir()

while estaFuncionando:
    print("\n" * 2)
    try:
        numero = int(input("Introduce un numero: ").strip())
        # Si el número es múltiplo de 7 y no ha sido introducido antes
        if numero % 7 == 0 and str(numero) not in lista_numeros_suerte:
            print(f"{numero} es un numero de la suerte!!")
            lista_numeros_suerte.append(str(numero))
        else:
            # Si no es múltiplo de 7 o ya fue introducido antes
            print(f"{numero} no es un numero de la suerte o ya lo has dicho!!")
            
        estaFuncionando = desea_seguir()

    except ValueError:
        # Captura errores si el usuario no introduce un número
        print("Introduzca un Número")

mensaje = f"Son los siguientes: {", ".join(lista_numeros_suerte)}." if len(lista_numeros_suerte) > 0 else ""
print(
    f"Hemos obtenido un total de {len(lista_numeros_suerte)} números. {mensaje}")
