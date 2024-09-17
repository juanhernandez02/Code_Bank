// PRIMER EJERCICIO: Clase con métodos sobrecargados para sumar
public class CalcularSumas {

    // Método sumar para dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método sumar para tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método sumar para dos doubles
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método sumar para tres doubles
    public double sumar(double a, double b, double c) {
        return a + b + c;
    }
}

// SEGUNDO EJERCICIO: Clase Empleado con sobrecarga de constructores
class Empleado {
    private int identificador;
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor Empleado sin parámetros
    public Empleado() {
        this.identificador = 100;
        this.nombre = "Nuevo empleado";
        this.apellidos = "Nuevo empleado";
        this.edad = 18;
    }

    // Constructor Empleado con parámetros
    public Empleado(int identificador, String nombre, String apellidos, int edad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

}

// TERCER EJERCICIO: Clase Caja con sobrecarga de constructores
class Caja {
    private double longitudBase;
    private double anchura;
    private double altura;
    private String tipoCaja;

    // Constructor con parámetros
    public Caja(double longitudBase, double anchura, double altura) {
        this.longitudBase = longitudBase;
        this.anchura = anchura;
        this.altura = altura;
        this.tipoCaja = "Sin tipo"; // Valor predeterminado
    }

    // Constructor sin parámetros
    public Caja() {
        this(0, 0, 0); 
    }

    // Constructor con un parámetro
    public Caja(double longitudBase) {
        this(longitudBase, longitudBase, longitudBase); // Llama al constructor con parámetros
    }

    // Constructor con cuatro parámetros
    public Caja(double longitudBase, double anchura, double altura, String tipoCaja) {
        this(longitudBase, anchura, altura); // Invoca al primer constructor con tres parámetros
        this.tipoCaja = tipoCaja; //Acá se agrega el cuarto parámetro
    }
    
}
