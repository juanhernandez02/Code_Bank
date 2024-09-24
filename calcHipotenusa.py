def calcular_hipotenusa(cateto_a, cateto_b):
    return (cateto_a**2 + cateto_b**2) ** 0.5

def main():
    print("Calculadora de Hipotenusa")
    
    cateto_a = float(input("Ingresa la longitud del primer cateto (a): "))
    cateto_b = float(input("Ingresa la longitud del segundo cateto (b): "))
    
    hipotenusa = calcular_hipotenusa(cateto_a, cateto_b)
    
    print(f"La hipotenusa del triángulo es: {hipotenusa:.2f}")

if __name__ == "__main__":
    main()
