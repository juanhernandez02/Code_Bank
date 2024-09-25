// Clase que representa la información básica de un libro
class Libro {
    // Atributos que describen a un libro
    private String titulo; // El título del libro
    private String autor;  // El autor del libro
    private double precio; // El precio del libro

    // Constructor para crear un libro con título y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo; // Asignamos el título
        this.autor = autor;   // Asignamos el autor
        this.precio = 0.0;    // Inicializamos el precio en 0.0
    }

    // Método para imprimir la información del libro en pantalla
    public void imprimirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: $" + precio);
    }

    // Métodos get y set para el título
    public String getTitulo() {
        return titulo; // Retorna el título
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo; // Asigna un nuevo título
    }

    // Métodos get y set para el autor
    public String getAutor() {
        return autor; // Retorna el autor
    }

    public void setAutor(String autor) {
        this.autor = autor; // Asigna un nuevo autor
    }

    // Métodos get y set para el precio
    public double getPrecio() {
        return precio; // Retorna el precio
    }

    public void setPrecio(double precio) {
        this.precio = precio; // Asigna un nuevo precio
    }
}

// Clase que representa libros de texto, hereda de Libro
class LibroTexto extends Libro {
    private String curso; // Atributo adicional para el curso

    // Constructor que inicializa el título, autor y curso
    public LibroTexto(String titulo, String autor, String curso) {
        super(titulo, autor); // Llama al constructor de la clase padre
        this.curso = curso;   // Asigna el curso
    }

    // Redefinimos cómo imprimir la información del libro de texto
    @Override
    public void imprimirInfo() {
        super.imprimirInfo(); // Llama a imprimirInfo de la clase padre
        System.out.println("Curso: " + curso); // Imprime el curso
    }
}

// Clase específica para libros de texto de la Universidad Nacional de Colombia
class LibroTextoUN extends LibroTexto {
    private String facultad; // Atributo adicional para la facultad

    // Constructor que inicializa título, autor, curso y facultad
    public LibroTextoUN(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso); // Llama al constructor de LibroTexto
        this.facultad = facultad;    // Asigna la facultad
    }

    // Redefinimos cómo imprimir la información del libro de texto de la UN
    @Override
    public void imprimirInfo() {
        super.imprimirInfo(); // Llama al método de la clase padre
        System.out.println("Facultad: " + facultad); // Imprime la facultad
    }
}

// Clase para representar novelas, hereda de Libro
class Novela extends Libro {
    private String tipo; // Atributo para el tipo de novela

    // Constructor que inicializa título, autor y tipo de novela
    public Novela(String titulo, String autor, String tipo) {
        super(titulo, autor); // Llama al constructor de la clase padre
        this.tipo = tipo;     // Asigna el tipo de novela
    }

    // Redefinimos cómo imprimir la información de la novela
    @Override
    public void imprimirInfo() {
        super.imprimirInfo(); // Llama al método de la clase padre
        System.out.println("Tipo: " + tipo); // Imprime el tipo de novela
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Creamos un libro normal
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        libro1.setPrecio(10.99); // Asignamos un precio
        libro1.imprimirInfo(); // Imprimimos la información del libro

        System.out.println(); 

        // Creamos un libro de texto
        LibroTexto libroTexto = new LibroTexto("Matemáticas 101", "John Doe", "Matemáticas");
        libroTexto.setPrecio(25.50); // Asignamos un precio
        libroTexto.imprimirInfo(); // Imprimimos la información del libro de texto

        System.out.println(); 

        // Creamos un libro de texto de la Universidad Nacional de Colombia
        LibroTextoUN libroUN = new LibroTextoUN("Biología Avanzada", "Jane Doe", "Biología", "Ciencias");
        libroUN.setPrecio(30.00); // Asignamos un precio
        libroUN.imprimirInfo(); // Imprimimos la información del libro de texto de la UN

        System.out.println(); 

        // Creamos una novela
        Novela novela = new Novela("Cien años de soledad", "Gabriel García Márquez", "Realista");
        novela.setPrecio(15.75); // Asignamos un precio
        novela.imprimirInfo(); // Imprimimos la información de la novela
    }
}
