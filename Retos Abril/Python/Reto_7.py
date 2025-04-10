import random

pasos = 20
partcipantes = int(input("Numero de participantes: "))

# Lista para guardar la distancia final recorrida por cada caracol
resultado = []

# Cadena que se usará para mostrar los ganadores en caso de empate
ganador = ""

# Simulamos la carrera: cada caracol avanza una cantidad aleatoria entre 1 y 6 por cada paso
for participante in range(partcipantes):
    caracol = 0
    for i in range(pasos + 1):
        caracol += random.randint(1, 6)
    resultado.append(caracol)

# Comprobamos si hay empate (es decir, más de un caracol con la máxima distancia dentro de la lista)
if resultado.count(max(resultado)) > 1:
    # Si hay empate, buscamos a los caracoles que empataron
    for i in range(len(resultado)):
        if resultado[i] == max(resultado):
            ganador += f"Caracol {i + 1}, "
    print("Ha habido un empate, los ganadores son: " + ganador[:-2] + ".")
else:
    print(f"El caracol ganador es el Caracol {1 + resultado.index(max(resultado))}")
