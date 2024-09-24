def calcular_costo_torta():
    # Definimos la cantidad de ingredientes necesarios para una torta
    ingredientes_necesarios = {
        "harina": (250, 65000 / 25000),  # gramos, precio por gramo
        "leche": (1000, 180000 / 30000),  # gramos, precio por gramo
        "azucar": (250, 50000 / 25000),   # gramos, precio por gramo
        "sal": (50, 15000 / 10000),       # gramos, precio por gramo
        "huevos": (5, 190000 / (10 * 30)), # huevos, precio por huevo
        "levadura": (5, 5000 / 2000)      # gramos, precio por gramo
    }
    
    costo_torta = 0  # Inicializamos el costo total de una torta

    # Calculamos el costo total de los ingredientes para una torta
    for ingrediente, (cantidad, precio_por_unidad) in ingredientes_necesarios.items():
        costo_torta += cantidad * precio_por_unidad

    return costo_torta

def calcular_tortas_posibles(costo_torta):
    # Definimos el inventario disponible
    inventario = {
        "harina": (25000, 65000),  # gramos, costo total
        "leche": (30000, 180000),   # gramos, costo total
        "azucar": (25000, 50000),   # gramos, costo total
        "sal": (10000, 15000),      # gramos, costo total
        "huevos": (300, 190000),    # huevos (10 cubetas de 30)
        "levadura": (2000, 5000)    # gramos, costo total
    }

    # Calculamos cuántas tortas se pueden hacer con el inventario
    tortas_posibles = float('inf')  # Inicializamos con infinito para buscar el mínimo

    for ingrediente, (cantidad, costo_total) in inventario.items():
        if ingrediente in ["harina", "leche", "azucar", "sal", "levadura"]:
            max_tortas = cantidad // (ingredientes_necesarios[ingrediente][0])
        elif ingrediente == "huevos":
            max_tortas = cantidad // ingredientes_necesarios[ingrediente][0]
        
        tortas_posibles = min(tortas_posibles, max_tortas)

    return tortas_posibles

def main():
    costo_torta = calcular_costo_torta()  # Calculamos el costo de una torta
    tortas_posibles = calcular_tortas_posibles(costo_torta)  # Calculamos cuántas tortas se pueden hacer

    print(f"Costo de una torta: ${costo_torta:.2f}")
    print(f"Cantidad de tortas que se pueden hacer con el inventario: {tortas_posibles}")

if __name__ == "__main__":
    main()  # Ejecuta la función principal
