def area_triangulo(base, altura):
    return (base * altura) / 2

def area_circulo(radio):
    return 3.14159 * (radio ** 2)

def area_rombo(diagonal_1, diagonal_2):
    return (diagonal_1 * diagonal_2) / 2

def calcular_promedio(areas):
    return sum(areas) / len(areas)

def main():
    print("Calculadora de Áreas")
    
    areas = []
    
    print("1: Área del Triángulo")
    base = float(input("Ingresa la base del triángulo: "))
    altura = float(input("Ingresa la altura del triángulo: "))
    area_t = area_triangulo(base, altura)
    areas.append(area_t)
    print(f"El área del triángulo es: {area_t:.2f}")

    print("2: Área del Círculo")
    radio = float(input("Ingresa el radio del círculo: "))
    area_c = area_circulo(radio)
    areas.append(area_c)
    print(f"El área del círculo es: {area_c:.2f}")

    print("3: Área del Rombo")
    diagonal_1 = float(input("Ingresa la longitud de la primera diagonal: "))
    diagonal_2 = float(input("Ingresa la longitud de la segunda diagonal: "))
    area_r = area_rombo(diagonal_1, diagonal_2)
    areas.append(area_r)
    print(f"El área del rombo es: {area_r:.2f}")

    promedio = calcular_promedio(areas)
    print(f"El promedio de las áreas es: {promedio:.2f}")

if __name__ == "__main__":
    main()
