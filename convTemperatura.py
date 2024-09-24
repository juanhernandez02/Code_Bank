def celsius_a_kelvin(c):
    return c + 273.15

def kelvin_a_celsius(k):
    return k - 273.15

def celsius_a_fahrenheit(c):
    return (c * 9/5) + 32

def fahrenheit_a_celsius(f):
    return (f - 32) * 5/9

def kelvin_a_fahrenheit(k):
    c = kelvin_a_celsius(k)
    return celsius_a_fahrenheit(c)

def fahrenheit_a_kelvin(f):
    c = fahrenheit_a_celsius(f)
    return celsius_a_kelvin(c)

def main():
    print("Conversor de Temperaturas")
    print("1: C° a K°")
    print("2: K° a C°")
    print("3: C° a F°")
    print("4: F° a C°")
    print("5: K° a F°")
    print("6: F° a K°")
    
    opcion = int(input("Selecciona una opción (1-6): "))
    valor = float(input("Introduce la temperatura: "))
    
    if opcion == 1:
        print(f"{valor} C° = {celsius_a_kelvin(valor)} K°")
    elif opcion == 2:
        print(f"{valor} K° = {kelvin_a_celsius(valor)} C°")
    elif opcion == 3:
        print(f"{valor} C° = {celsius_a_fahrenheit(valor)} F°")
    elif opcion == 4:
        print(f"{valor} F° = {fahrenheit_a_celsius(valor)} C°")
    elif opcion == 5:
        print(f"{valor} K° = {kelvin_a_fahrenheit(valor)} F°")
    elif opcion == 6:
        print(f"{valor} F° = {fahrenheit_a_kelvin(valor)} K°")
    else:
        print("Opción no válida.")

if __name__ == "__main__":
    main()
