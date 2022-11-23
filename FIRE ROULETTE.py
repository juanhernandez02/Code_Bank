#A continuación veremos un juego de ruleta que integra algunas de las funciones vistas a lo largo del curso de Algoritmos y programación.
historial=[]
multiplicadores=[50,100,150,200,300,450,500]
numeros=[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36]
rojos=[1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36]
negros=[2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35]
colores=['ROJO','NEGRO']
paridad=['PAR','IMPAR']


def fire_roulette ():
    print("""¡Bienvenido a PyBets, el casino que te hará millonario!
Prepárate para jugar nuestra ruleta de fuego...
Este juego es simple, puedes ingresar las siguientes opciones""")

    saldo_total=50000
    while saldo_total > 0:
        option=input("""Puedes apostar: 1. Números del 0 a 36    2. Par o impar   3. Rojo o negro
¿Qué apostarás?:  """)
        if option == "1":
            minbet=500
            print("Escoge uno de los siguientes números, pueden ser dos o más si los separas por espacios: ",numeros)
            eleccion=input("¿Cuál será tu elección?:   " )
            apuestas=(eleccion.split())
            print(f"Tus elecciones fueron {apuestas}")
            cant_apuestas=len(apuestas)
            import random
            #Los números de fuego serán números que pagarán más de 30 veces lo apostado
            num_fuego1=random.choice(numeros)
            num_fuego2=random.choice(numeros)
            num_fuego3=random.choice(numeros)
            nums_fuego=[num_fuego1,num_fuego2, num_fuego3]
            #Los multiplicadores son los que determinan cuántas veces pagarán lo apostado en caso de que el jugador escoja ese número y salga en la ruleta
            multiplicador1=random.choice(multiplicadores)
            multiplicador2=random.choice(multiplicadores)
            multiplicador3=random.choice(multiplicadores)
            print(f"""Los números de fuego para esta ronda son: 
            x{multiplicador1} para el número {num_fuego1}
            x{multiplicador2} para el número {num_fuego2}
            x{multiplicador3} para el número {num_fuego3}""")
            print(f"Dinero disponible: {saldo_total}")
            monto_apuesta=int(input(f"¿Qué monto vas a apostar? la apuesta mínima es de ${minbet} : "))
            total_apuesta=(monto_apuesta*cant_apuestas)
            if monto_apuesta>=minbet: 
                #if total_apuesta>=saldo_total:
                numaleat=random.choice(numeros)
                historial.insert(0,numaleat)
                print("La ruleta ha girado... El número ganador es ", numaleat)
                print("Historial de números:  ", historial)
                if numaleat in apuestas:
                    if numaleat == num_fuego1:
                        saldo_total += (monto_apuesta*multiplicador1)
                        print("¡Felicidades, has ganado! Tu saldo ahora es ", saldo_total)
                    elif numaleat == num_fuego2:
                        saldo_total += (monto_apuesta*multiplicador2)
                        print("¡Felicidades, has ganado! Tu saldo ahora es ", saldo_total) 
                    elif numaleat == num_fuego3:
                        saldo_total += (monto_apuesta*multiplicador3)
                        print("¡Felicidades, has ganado! Tu saldo ahora es ", saldo_total)       
                    elif numaleat not in nums_fuego:
                        saldo_total += (monto_apuesta*29)
                        print("¡Felicidades, has ganado! Tu saldo ahora es ", saldo_total)
                else:               
                    saldo_total -=(total_apuesta)
                    print("Has perdido tu apuesta, tu saldo actual es ", saldo_total)
            else:
                print("El monto apostado es inferior al mínimo permitido")

        elif option == "2":
            minbet=1000
            print("Escoge una de las opciones a continuación: ",paridad)
            eleccion=str(input("¿Cuál será tu elección?:   " )).upper()
            print(f"Dinero disponible: {saldo_total}")
            monto_apuesta=int(input(f"¿Qué monto vas a apostar? la apuesta mínima es de ${minbet} : "))
            if monto_apuesta>=minbet: 
                import random
                numaleat=random.choice(numeros)
                historial.insert(0,numaleat)
                print("La ruleta ha girado... El número ganador es ", numaleat)
                print("Historial de números:  ", historial)
                if eleccion == "PAR":
                    if numaleat in range (2,36,2):
                        saldo_total += (monto_apuesta)
                        print("¡Felicidades, has ganado! Tu saldo ahora es ", saldo_total)
                    else:
                        saldo_total -=(monto_apuesta)
                        print("Has perdido tu apuesta, tu saldo actual es ", saldo_total)
                if eleccion == "IMPAR":
                    if numaleat in range (1,35,2):
                        saldo_total += (monto_apuesta)
                        print("¡Felicidades, has ganado! Tu saldo ahora es ", saldo_total)
                    else:
                        saldo_total -=(monto_apuesta)
                        print("Has perdido tu apuesta, tu saldo actual es ", saldo_total)
        
        elif option == "3":
            minbet=1000
            print(f"""Escoge una de las opciones a continuación: {colores}, ten en cuenta que:
            Los números rojos son {rojos}
            Los números negros son {negros}""")
            eleccion=str(input("¿Cuál será tu elección?:   " )).upper()
            print(f"Dinero disponible: {saldo_total}")
            monto_apuesta=int(input(f"¿Qué monto vas a apostar? la apuesta mínima es de ${minbet} : "))
            if monto_apuesta>=minbet:
                import random
                numaleat=random.choice(numeros)
                historial.insert(0,numaleat)
                print("La ruleta ha girado... El número ganador es ", numaleat)
                print("Historial de números: ", historial)
                if eleccion == "ROJO":
                    if numaleat in rojos:
                        saldo_total += (monto_apuesta)
                        print("¡Felicidades, has ganado! tu saldo ahora es ", saldo_total)
                    else:
                        saldo_total -=(monto_apuesta)
                        print("Has perdido tu apuesta, tu saldo actual es ", saldo_total)
                elif eleccion == "NEGRO":
                    if numaleat in negros:
                        saldo_total += (monto_apuesta)
                        print("¡Felicidades, has ganado! tu saldo ahora es ", saldo_total)
                    else:
                        saldo_total -=(monto_apuesta)
                        print("Has perdido tu apuesta, tu saldo actual es ", saldo_total)
        else :
            print("La opción seleccionada no está habilitada en el menú.")

fire_roulette()

             