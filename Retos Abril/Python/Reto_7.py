import random

pasos = 20
caracol_1 = 0
caracol_2 = 0
caracol_3 = 0

# Lista para guardar la distancia final recorrida por cada caracol
resultado = []

# Cadena que se usará para mostrar los ganadores en caso de empate
ganador = ""

# Simulamos la carrera: cada caracol avanza una cantidad aleatoria entre 1 y 6 por cada paso
for i in range(pasos + 1):
    caracol_1 += random.randint(1, 6)
    caracol_2 += random.randint(1, 6)
    caracol_3 += random.randint(1, 6)

# Guardamos los resultados finales en la lista
resultado.append(caracol_1)
resultado.append(caracol_2)
resultado.append(caracol_3)

# Comprobamos si hay empate (es decir, más de un caracol con la máxima distancia dentro de la lista)
if resultado.count(max(resultado)) > 1:
    # Si hay empate, buscamos a los caracoles que empataron
    for i in range(len(resultado)):
        if resultado[i] == max(resultado):
            ganador += f"Caracol {i + 1}, "
    print("Ha habido un empate, los ganadores son: " + ganador[:-2] + ".")
else:
    print(f"El caracol ganador es el Caracol {1 + resultado.index(max(resultado))}")
