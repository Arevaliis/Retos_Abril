precio = float(input("Precio producto: "))
pago_cliente = float(input("Pago Cliente: "))
dinero = [500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01]
cambio = {}

if pago_cliente >= precio:
    for i in range((len(dinero))):
        if precio >= dinero[i]:
            cambio[dinero[i]] = int(precio // dinero[i])
            precio %= dinero[i]
else:
    print(f"Te faltas {precio - pago_cliente}€.")

print("Su cambio: ")
for clave, valor in cambio.items():
    tipo = "Billete" if clave > 2 else "Moneda"
    es_plural = "s" if valor > 1 else ""
    print(f"\t\t{valor} {tipo}{es_plural} de {clave}€")


