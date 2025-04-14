import random

palabras = ["Python", "C", "C++", "Java", "JavaScript",
            "Ruby", "Go", "Swift", "Kotlin", "PHP",
            "TypeScript", "Rust", "Perl", "Scala", "Haskell",
            "R", "Dart", "Elixir", "MATLAB", "Objective-C"]

vidas = 5
palabra_elegida = random.choice(palabras).capitalize()
estaFuncionando = True

while estaFuncionando:

    if vidas > 0:
        respuesta = input("¿En que lenguaje de programacion estoy pensando?: ").capitalize()
        if respuesta == palabra_elegida:
            print("Has acertado!!")
            estaFuncionando = False
        else:
            vidas -= 1
            print(f"Has fallado. Te quedan {vidas} vidas.")
    else:
        print(f"Game Over!!. El lenguaje era {palabra_elegida}")
        estaFuncionando = False
