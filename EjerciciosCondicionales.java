/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioscondicionales;
import java.util.Scanner;

/**
 *
 * @author Camilo
 */
public class EjerciciosCondicionales {
/**
     *
     * @param args
     */
    static void mayoriaEdad (){
        Scanner entrada=new Scanner (System.in);
        System.out.println("Ingrese su edad: \n");
        int edad= entrada.nextInt();
        if (edad<18){
            System.out.println("Usted no es mayor de edad.");
        } else if (edad >=18){
            System.out.println("Usted cumple con la mayoria de edad.");
        }
    }
    
    static void password (){
        Scanner input = new Scanner (System.in);
        System.out.println("A continuacion, asigne un nombre al nuevo usuario : \n");
        String user= input.next();
        System.out.println("Bienvenido, "+ user +".\n Ahora ingrese la contraseña que dará acceso a su usuario: ");
        String password= input.next();
        System.out.println("""
                           Usuario creado con exito, ahora puede ingresar a la plataforma haciendo uso de las credenciales recientemente asignadas.
                            Presione la tecla H para iniciar sesion""");
        String logIn= input.next();
        if (logIn.equals("h")){
            System.out.println("Usuario : \n");
            String userLogIn= input.next();
            if ((userLogIn.toLowerCase()).equals(user.toLowerCase())){
                System.out.println("Contraseña: \n");
                String passwordLogIn= input.next();
                    if ((passwordLogIn.toLowerCase()).equals(password.toLowerCase())){
                        System.out.println("Sesion iniciada exitosamente");
                    } else if (!passwordLogIn.toLowerCase().equals(password.toLowerCase())){
                        System.out.println("La contrasena ingresada es incorrecta");
                    }
            }else if (!userLogIn.toLowerCase().equals(user)){
                System.out.println("El usuario ingresado es incorrecto \n");
            }
        }else if (!logIn.toLowerCase().equals("h")){
            System.out.println("La opcion ingresada no esta disponible");
        }
        
        
        
        
    }
    
    static void division (){
        Scanner nums= new Scanner (System.in);
        System.out.println("Ingrese un dividendo: ");
        int dividendo= nums.nextInt();
        System.out.println("Ingrese un divisor: ");
        int divisor= nums.nextInt();
        if (divisor==0){
            System.out.println("ERROR: El divisor debe ser un numero diferente de cero");
        } else if (divisor!=0){
            System.out.println("El cociente de los numeros es " + (dividendo/divisor));
        }
    }
    
    static void numPrimo(){
        Scanner num= new Scanner (System.in);
        System.out.println("Ingrese un número para clasificarlo como par o impar: ");
        int numInput= num.nextInt();
        if (numInput==0){
            System.out.println("El numero cero no es par ni impar");
        } else if((numInput%2)==0){
            System.out.println("Ingrese un número " + numInput+ " es par");
        } else if ((numInput%2)!=0){
          System.out.println("Ingrese un número " + numInput+ " es impar");  
    }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        
        System.out.print("""
                         Bienvenido/a al menu principal de los primeros ejemplos y ejercicios de POO.
                          A continuacion, escoge una opcion para acceder al menu: \n (1). Ejercicio 1: Mayor o menor de edad \n (2). Ejercicio 2: Comparacion de strings (contraseña) \n (3). Ejercicio 3: Division de dos numeros \n (4). Ejercicio 4:  \n""");
        int ejercicios = scanner.nextInt();
        
        switch (ejercicios){
            case 1: 
                mayoriaEdad ();
                break;
            case 2:
                password ();
                break;
            case 3: 
                division ();
                break;
            case 4:
                numPrimo();
                break;
            
            default:
                System.out.println("La opcion ingresada no es valida en este menu.");
        }
        
    }
    
}
