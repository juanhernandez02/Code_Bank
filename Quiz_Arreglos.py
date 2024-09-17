def calcular_promedio_pares():
    # Pedir la cantidad de números a ingresar
    N = int(input("Ingrese la cantidad de números: "))
    
    # Asegurarse de que N sea positivo
    if N <= 0:
        print("La cantidad de números debe ser un número entero positivo.")
        return
    
    numeros = []
    
    # Ingresar N números
    for i in range(N):
        while True:
            try:
                numero = int(input(f"Ingrese el número {i + 1}: "))
                numeros.append(numero)
                break
   # Condición para limitar las entradas no permitidas
            except ValueError:
                print("Por favor, ingrese un número entero válido.")
    
    # Filtrar números en posiciones pares (recordando que las posiciones son indexadas desde 0)
    numeros_pares = [numeros[i] for i in range(1, N, 2)]
    
    # Calcular el promedio de los números en posiciones pares
    if numeros_pares:
        promedio = sum(numeros_pares) / len(numeros_pares)
        print(f"El promedio de los números en posiciones pares es: {promedio:.2f}")
    else:
        print("No hay números en posiciones pares para calcular el promedio.")

# Ejecutar la función
calcular_promedio_pares()
