from datetime import datetime
from dateutil import relativedelta

# Fecho cumpleaños
cumpleanyos = datetime(1996, 9, 9)

# Dia actual
hoy = datetime.now()

# Calcula diferncia entre ambas fechas
tiempo_transcurrido = relativedelta.relativedelta(hoy, cumpleanyos)

print("----------------------------------------")
print(f"Tiempo Transcurrido: {tiempo_transcurrido.years} años, {tiempo_transcurrido.months} meses,"
      f" {tiempo_transcurrido.days} dias")
print("----------------------------------------")
print("Año de mi cumpleaños:", cumpleanyos.strftime("%Y"))
print("Mes de mi cumpleaños:", cumpleanyos.strftime("%B"))
print("Día de mi cumpleaños:", cumpleanyos.strftime("%d"))
print("Día Semana de mi cumpleaños:", cumpleanyos.strftime("%A"))
print("----------------------------------------")
print("Año de hoy:", hoy.strftime("%Y"))
print("Mes de hoy:", hoy.strftime("%B"))
print("Día de hoy:", hoy.strftime("%d"))
print("Día Semana de hoy:", hoy.strftime("%A"))
