contador = 5

while contador >= 0:
    if contador > 0:
        print(f""" 
                __________
               ( 00:00:0{contador} )
                ----------
        """)
        contador -= 1
    else:
        print("""    
                    💥💥💥💥💥
                  💥           💥
                💥   00:00:0%d   💥
                  💥           💥
                    💥💥💥💥💥
        """)
        contador -= 1