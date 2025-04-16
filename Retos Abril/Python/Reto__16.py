def sigueFuncionando():
    respuesta = input("Seguir calculando: (S/N)").upper()
    match respuesta:
        case "S": return True
        case "N": return False
        case _:  return False, print("No entiendo. Saliendo...")

def calculadora(x, y):
    respuesta = input("¿Que Operacion quiere hacer?: (+ , - , / , *)")
    match respuesta:
        case "+": return x + y
        case "-": return x - y
        case "/": return x / y
        case "*": return x * y
        case _: return False, print("Eso no es una operacion. Saliendo...")

estaCalculando = True

while estaCalculando:
    try:
        resultado = calculadora(int(input("Introduce X: ")), int(input("Introduce Y: ")))
        print(f"¡Tadá! El resultado es {resultado}")
        estaCalculando = sigueFuncionando()
    except ZeroDivisionError:
        print("¡¿Dividir por cero?! ¡¿Acaso quieres destruir el universo?!")
    except ValueError:
        print("Introduce valores adecuados")