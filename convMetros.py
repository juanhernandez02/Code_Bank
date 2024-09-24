def convertir_unidades(metros):
    decimetros = metros * 10
    centimetros = metros * 100
    kilometers = metros / 1000
    return decimetros, centimetros, kilometers

def main():
    metros = float(input("Ingresa la medida en metros: "))
    
    decimetros, centimetros, kilometers = convertir_unidades(metros)
    
    print(f"{metros} metros son:")
    print(f"{decimetros} decímetros")
    print(f"{centimetros} centímetros")
    print(f"{kilometers} kilómetros")

if __name__ == "__main__":
    main()
