# Escribe una función que reciba una cadena de caracteres y devuelva una lista con sublistas,
# donde cada sublista contenga un carácter y el número de veces consecutivas que aparece dicho
# carácter en la cadena.

def funcion(x):
    letras = []
    contador = 1

    for i in range(len(x)):
        if x[i:i + 1] == x[i + 1: i + 2]:
            contador += 1
        else:
            letras.append([x[i], contador])
            contador = 1

    return letras

print(funcion("zzzrrzbr")) # Salida -> [ ['z', 3], ['r', 2], ['z', 1], ['b', 1], ['r', 1] ]