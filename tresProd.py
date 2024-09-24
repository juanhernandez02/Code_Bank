# Definimos la tasa del IVA
IVA_TASA = 0.19

def calcular_factura(productos):
    """Calcula el subtotal, el impuesto IVA y el total a pagar."""
    subtotal = sum(productos)  # Suma el precio de los productos para obtener el subtotal
    impuesto_iva = subtotal * IVA_TASA  # Calcula el IVA sobre el subtotal
    total = subtotal + impuesto_iva  # Suma el subtotal y el IVA para obtener el total
    return subtotal, impuesto_iva, total

def main():
    productos = []  # Lista para almacenar los precios de los productos
    
    # Ingreso de precios de los tres productos
    for i in range(3):
        precio = float(input(f"Ingrese el precio del producto {i + 1}: "))  # Solicita el precio al usuario
        productos.append(precio)  # Agrega el precio a la lista de productos

    # Calcula el subtotal, el impuesto y el total
    subtotal, impuesto_iva, total = calcular_factura(productos)

    # Imprime los resultados
    print(f"Subtotal: {subtotal:.2f} unidades monetarias")
    print(f"Impuesto IVA (19%): {impuesto_iva:.2f} unidades monetarias")
    print(f"Total a pagar: {total:.2f} unidades monetarias")

if __name__ == "__main__":
    main()  # Llama a la función principal para ejecutar el programa
