import java.util.Scanner;

/**
 *
 * @author SALA
 */
public class StringManipulator {

    // Un método que reciba como parámetro un String y calcule cuántas mayúsculas tiene.
    public int contarMayusculas(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }

    // Un método que reciba como parámetro un String y una letra, y determine cuántas veces está la letra en el String (la letra puede estar en mayúscula o minúscula).
    public int contarLetra(String input, char letra) {
        int count = 0;
        letra = Character.toLowerCase(letra);
        for (char c : input.toCharArray()) {
            if (Character.toLowerCase(c) == letra) {
                count++;
            }
        }
        return count;
    }

    // Un método que reciba como parámetro un String, y que elimine todos sus espacios en blanco y escriba en pantalla el String resultante
    public String eliminarEspacios(String input) {
        String resultado = input.replaceAll("\\s+", "");
        return resultado;
    }

    // Método que invierte un String
    public String invertirString(String input) {
        StringBuilder resultado = new StringBuilder(input);
        resultado.reverse();
        return resultado.toString();
    }

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        Scanner input = new Scanner (System.in);

        System.out.println("""
                           A continuación, ingrese un string para aplicar los siguientes metodos:
                           Un metodo que reciba como para1metro un String y calcule cuantas mayusculas tiene.
                           Un metodo que reciba como parametro un String y una letra, y determine cuantas veces esta la letra en el String (la letra puede estar en mayuscula o minuscula).
                           Un metodo que reciba como parametro un String, y que elimine todos sus espacios en blanco y escriba en pantalla el String resultante.
                           Un metodo que reciba como parametro un String, y obtenga el String escrito al reves.""");
        String testString = input.nextLine();
        
        
        System.out.println("Metodo 1 - Cantidad de mayusculas: " + manipulator.contarMayusculas(testString));
        System.out.println("Metodo 2 - Cantidad de 'e' : " + manipulator.contarLetra(testString,'e'));
        System.out.println("Metodo 3 - String sin espacios: " + manipulator.eliminarEspacios(testString));
        System.out.println("Metodo 4 - String invertido: " + manipulator.invertirString(testString));
    }
}
