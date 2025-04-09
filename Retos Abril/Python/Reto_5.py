from  collections import  Counter

exclamaciones = "¡¡ Hola Mundo !!"

# Creamos un diccionario que cuenta las apariciones de cada letra de la cadena
exclamaciones_dict = Counter(exclamaciones.strip())

print(exclamaciones_dict["!"] == exclamaciones_dict["¡"])


