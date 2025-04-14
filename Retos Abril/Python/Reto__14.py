import random

estaFuncionando = True

# Lista de preguntas y respuestas (flashcards)
preguntas_respuestas = [
    ("¿Qué es una variable?: ", "Es un espacio en memoria para guardar datos"),
    ("¿Qué hace un bucle for?: ", "Itera sobre una secuencia de elementos"),
    ("¿Qué es una función?: ", "Un bloque de código reutilizable"),
    ("¿Qué es una lista?: ", "Una colección ordenada y mutable de elementos"),
    ("¿Qué es un diccionario?: ", "Una colección de pares clave-valor"),
    ("¿Qué es un condicional if?: ", "Evalúa una condición y ejecuta código según el resultado"),
    ("¿Qué significa 'None' en Python?: ", "Representa la ausencia de un valor"),
    ("¿Qué hace 'len()'?: ", "Devuelve la longitud de un objeto"),
    ("¿Para qué sirve 'return'?: ", "Para devolver un valor desde una función"),
    ("¿Qué es un error de tipo TypeError?: ", "Ocurre cuando se usa un tipo de dato incorrecto"),
]

def desea_seguir():
    """Pregunta al usuario si desea continuar"""
    respuesta = input("¿Desea seguir?: (S/N)").upper().strip()
    match respuesta:
        case "S":
            return True
        case "N":
            print("Saliendo...")
            return False
        case _:
            print("Responda S o N. ")
            return desea_seguir()

def anyadir_flashcards(pregunta, respuesta):
    """Añade una nueva tupla de pregunta y respuesta a la lista"""
    return preguntas_respuestas.append((pregunta, respuesta))

# Bucle principal del juego
while estaFuncionando:
    eleccion = random.choice(preguntas_respuestas)
    respuesta = input(eleccion[0]).strip().capitalize()

    if respuesta == eleccion[1]:
        print("Has Acertado")
    else:
        print("Has Fallado")

    estaFuncionando = desea_seguir()
