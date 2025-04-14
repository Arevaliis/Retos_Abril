import time

hora = 0
minuto = 0
segundos = 0

try:
    tiempo = int(input("Introduce el numero de segundos que desea contar: "))
    for i in range(0, tiempo + 1):
        time.sleep(1)  # Pausa el programa durante 1 segundo para simular el cronómetro

        # Imprime el tiempo en formato hh:mm:ss
        print(f"{"0" + str(hora) if hora < 10 else hora}:"  
              f"{"0" + str(minuto) if minuto < 10 else minuto}:"  
              f"{"0" + str(segundos) if segundos < 10 else segundos}")

        # Sí han pasado exactamente 3600 segundos (1 hora)
        if i % 3600 == 0 and i != 0:
            hora += 1  # Aumentamos la hora
            minuto = 0  # Reiniciamos minutos
            segundos = 0  # Reiniciamos segundos

        # Sí han pasado exactamente 60 segundos (1 minuto)
        elif i % 60 == 0 and i != 0:
            segundos = 0  # Reiniciamos segundos
            minuto += 1  # Aumentamos el minuto

        # En cualquier otro caso, simplemente incrementamos los segundos
        else:
            segundos += 1

except ValueError:
    print("Debes introducir un número.")




