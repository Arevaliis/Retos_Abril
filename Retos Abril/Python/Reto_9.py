n_dias = int(input("Introduce los dias que quieres ver: "))

for dia in range(1, n_dias + 1):
    if dia % 3 == 0 and dia % 5 == 0:
        print("FP + Master")
    elif dia % 3 == 0:
        print("FP")
    elif dia % 5 == 0:
        print("Master")
    else:
        print(dia)
