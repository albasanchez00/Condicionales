// Clase sobre Condicional Simple If(){}
/* Sintaxis: if (condicion_a_evaluar){
      Bloque de instrucciones
    }
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese su edad → ");
//        byte edad = sc.nextByte(); // Variable Local: Puede utilizarse en cualquier momento.
//        if (edad >= 18) {
//            // En caso de ser true o cumplirse la condciones.
//            //Bloque de instruncciones: Conjunto de sentencias delimitadas con {}
//            System.out.println("Eres mayor de edad");
//            edad++; // Le incrementamos 1
//            System.out.println("El año que viene tendras " + edad);
//        }
//        //Ambito
//        System.out.println("Edad: " + edad); //Aumenta en 1
//
//        // Aunque es recomendable utilizar las {} en las condiciones que solo almecenen una linea en el bloque de sentencias, estas se pueden suprimir
//        // Ejemplo ↓
//        if (edad < 18) {
//            System.out.println("Eres menor de edad");
//        }
//
//        //Ambito.
//        if (edad >= 18) {
//            byte mayoriaEdad = 18; // Variable Bloque: Variable declarada dentro de un if().
//            System.out.println("Tu edad es igual o mayor a " + mayoriaEdad);
//        }
        // mayoriaEdad++; // Unicamente existe dentro de este bloque de instrucciones if().


        /* Actividad. Solicita por teclado un número y si es menor de 0, indicar que es negativo */
        System.out.print("Introduce un numero negativo o positivo → "); //Solicitamos el numero.
        int num = sc.nextInt(); //Leemos el numero.
        if (num >= 0) { //Si es mayor o igual que 0 (positivo)
            System.out.printf("El numero %d es positivo", num);
        }else {//Si es menor que 0 (negativo)
            System.out.printf("El numero %d es negativo", num);
        }


        sc.close();
    }
}