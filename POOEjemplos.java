/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.ejemplos;
import java.util.Scanner;
/**
 *
 * @author Camilo
 */
public class POOEjemplos {

    /**
     * funciones para iniciar cada ejercicio
     */
    static void Ejercicio1 () {
        
        System.out.println("""
                           Los identificadores nombran variables, funciones, clases y objetos; cualquier cosa que el programador necesite identificar o usar.
                           
                           5 Ejemplos de identificadores no v\u00e1lidos para uso en Java son:
                           
                           \t1. 1sonic: Este identificador no es v\u00e1lido ya que el primer d\u00edgito de un identificador no puede ser un n\u00famero.
                           \t2. \u00c1rbol: Este identificador no es valido debido a que las tildes y dem\u00e1s signos de acentuacion no son permitidos en Java.
                           \t3. a+2: Este identificador tampoco es v\u00e1lido ya que los identificadores no deben contener operadores aritmeticos ni logicos.
                           \t4. Cantidad manzanas: Los identificadores no pueden tener espacios entre  caracteres, por tal razon, este identificador no es v\u00e1lido.
                           \t5. Static: Esta es una palabra reservada por Java, es decir que tienen una funci\u00f3n \u00fanica y definida dentro de toda su sintaxis y no pueden ser usadas como identificadores.
                           \t
                           En cambio, estos mismos ejemplos podr\u00edan ser validos si se escriben de la siguiente forma:
                           
                            _1sonic: Se mantiene el mismo identificador, pero usamos un guin bajo (_) al inicio para cumplir las condiciones. 
                           Arbol: Quitando la tilde, este se convierte en un identificador valido. 
                           a_plus_2: Reemplazamos el simbolo (+) por una palabra que signifique lo mismo. 
                           Cantidad_manzanas: Reemplazamos el espacio entre caracteres por un guin bajo. 
                           $tatic: El signo ($) es valido dentro de las reglas de identificadores, asi que reemplazamos la s de static por el simbolo, por ejemplo.""");
    }
    static void Ejercicio2 () {
        Scanner e2= new Scanner (System.in);
        // Ecoger la operación a realizar
        
        System.out.print(" EJERCICIO 2: OPERADORES ARITMETICOS Y LOGICOS \n Ingrese el tipo de operacion que va a realizar: 1.SUMA   2.DIFERENCIA   3.PRODUCTO   4.COCIENTE   5. Menor que(<) o Mayor que(>)   6. ¿Ambos números son positivos?  ");
        int operador = e2.nextInt();
        
       
        // Pedir al usuario que ingrese la primera variable
        System.out.print("Ingresa el primer número: ");
        int numero1 = e2.nextInt();

        // Pedir al usuario que ingrese la segunda variable
        System.out.print("Ingresa el segundo número: ");
        int numero2 = e2.nextInt();

        // Calcular la operación de los dos números
        int suma = numero1 + numero2;
        int diferencia = numero1 - numero2;
        int producto = numero1 * numero2;
        int cociente = numero1 / numero2;
        
        // Imprimir operación
        switch (operador) {
            case 1:
                System.out.println("La suma de los numeros " + numero1 + " y " + numero2 + " es: " + suma);
                break;
            case 2:
                System.out.println("La diferencia de los numeros " + numero1 + " y " + numero2 + " es: " + diferencia);
                break;
            case 3:
                System.out.println("El producto de los numeros " + numero1 + " y " + numero2 + " es: " + producto);   
                break;
            case 4:
                System.out.println("El cociente de los numeros " + numero1 + " y " + numero2 + " es: " + cociente);
                break;
            case 5:
                    if (numero1 < numero2){
                        System.out.println(numero1 + " es menor que " + numero2);
                    } else if (numero1 > numero2){
                      System.out.println(numero1 + " es mayor que " + numero2);  
                    }
                break;
            case 6:
                if (numero1 > 0 && numero2 > 0){
                        System.out.println(numero1 + " y " + numero2 + " son positivos.");
                    } else if (numero1 < 0 && numero2 > 0){
                      System.out.println (numero1 + " es negativo, " + numero2 + " es positivo.");  
                    } else if (numero1 > 0 && numero2 < 0){
                      System.out.println (numero1 + " es positivo, " + numero2 + " es negativo."); 
                    } else if (numero1 < 0 && numero2 < 0){
                      System.out.println (numero1 + " y " + numero2 + " son negativos."); 
                    }
            default:
                break;
        }
    }
    static void Ejercicio3 () {
        Scanner e3 = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre completo a continuación: \n");
        String nombreCompleto= e3.next();
        System.out.println("Ingrese su edad a continuación: \n");
        int edad= e3.nextInt();
        System.out.println("¿Es usted estudiante de la Universidad Ean? \n Digite (y) para si y (n) para no. \n");
        String member= e3.next();
        System.out.println("¿Cuales son sus ingresos mensuales? \n");
        float ingresos= e3.nextFloat();
        if (member.equals("y")){
            boolean estudiante= true;
            System.out.println("""
                               Aqui puede ver el resumen de su perfil: \n
                               Nombre completo: """+ nombreCompleto +
                               "\n Edad: "+ edad+
                               "\n Estudiante activo: " + estudiante +
                               "Ingresos mensuales: " + ingresos);
        } else if (member.equals("n")){
            boolean estudiante= false;
            System.out.println("""
                               Aqui puede ver el resumen de su perfil: \n
                               Nombre completo: """+ nombreCompleto +
                               "\n Edad: "+ edad+
                               "\n Estudiante activo: " + estudiante +
                               "Ingresos mensuales: " + ingresos);
        }
    }
    static void Ejercicio4 () {
        Scanner e4 = new Scanner (System.in);
        
        System.out.println("Ingrese su nombre a continuación: \n");
        String nombre= e4.nextLine();
        
        System.out.println("Ingrese su edad: \n");
        int edad= e4.nextInt();
        
        System.out.println("Ingrese su salario neto mensual (no use signos de puntuacion): \n");
        int sueldo= e4.nextInt();
        
        System.out.println("Estimado/a " + nombre + ",\n"
                + "A sus " + edad + " años, calculamos que sus ingresos anuales son de: " + sueldo*12);
    }
    public static void main(String[] args) {
       
        
        /*
        
        32144483833-------------------   MENU PRINCIPAL PARA ESCOGER EJEMPLOS ------------------------------------ */
        
         /*Crear un input para ingresar las variables */
         Scanner scanner= new Scanner (System.in);
        
        System.out.print("""
                         Bienvenido/a al menu principal de los primeros ejemplos y ejercicios de POO.
                          A continuacion, escoge una opcion para acceder al menu: \n (1). Ejercicio 1: Identificadores y Palabras Reservadas \n (2). Ejercicio 2: Operadores Aritmeticos y Logicos \n (3). Ejercicio 3: Tipos de Datos y Variables \n (4). Ejercicio 4: Entrada y Salida de Datos \n""");
        int ejercicios = scanner.nextInt();
        
        switch (ejercicios){
            case 1: 
                Ejercicio1 ();
                break;
            case 2:
                Ejercicio2 ();
                break;
            case 3: 
                Ejercicio3 ();
                break;
            case 4:
                Ejercicio4 ();
                break;
            default:
                System.out.println("La opcion ingresada no es valida en este menu.");
        }
        // --------------------- FIN MENU PARA ESCOGER EJEMPLOS------------------------------------------- 
    
                    
    }
    
}