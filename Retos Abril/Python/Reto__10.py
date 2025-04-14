def imprimir_ticket(cajas, gastos_envio, promocion, total):
    """Muestra por pantalla un ticket con los detalles de la compra."""
    print(f"""
    -------------------------------
    ****** Ticket de Compra ******
    -------------------------------
    Numero total de cajas: {cajas}
    Gastos de envio: {gastos_envio}€
    Promoción: {promocion}%
    --------------------------------
    Total de la compra: {total}€
    --------------------------------""")

cajas = int(input("Introduce el numero de cajas que quieres: ").strip())
precio = 6
total = cajas * precio

if cajas < 5:
    # Caso: el número de cajas es menor al mínimo requerido
    print("Debe comprar minimo 5 cajas")

elif cajas < 15:
    # Caso: entre 5 y 14 cajas, se aplican gastos de envío de 10€
    imprimir_ticket(cajas, 10, 0, total + 10)

elif cajas < 19:
    # Caso precio total < 120€, sin gastos de envío ni promoción
    print(f"No puedes optar a la promoción. Te faltan {120 - total}€.")
    imprimir_ticket(cajas, 0, 0, total)

elif total < 41:
    # Caso: precio total entre 120€ y 249.99€, 5% de descuento sin gastos de envío
    imprimir_ticket(cajas, 0, 5, total * 0.95)

else:
    # Caso precio total ≥ 250€, 10% de descuento sin gastos de envío
    imprimir_ticket(cajas, 0, 10, total * 0.90)
