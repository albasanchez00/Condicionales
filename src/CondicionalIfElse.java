/* Actividad. Solicitar dos numero e indicar si son iguales, en caso contrario mostrar que son diferentes
*   1. Pedimos el primer número.
*   2. Declara la variable y recoge el dato.
*   3. Pedimos el segundo número.
*   4. Declara la variable y recoge el dato.
*   5. Crea la condicion if y else para el caso falso.
*/

import java.util.Scanner;

public class CondicionalIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Pedimos el primer número.
        System.out.println("Ingrese el 1º numero: ");
        // 2. Declara la variable y recoge el dato.
        int num1 = sc.nextInt();

        System.out.println("Ingrese el 2º numero: ");
        int num2 = sc.nextInt();
        // Importante identificar
        if(num1==num2){ //Si son iguales
            System.out.print(num1+" y "+num2+ " son iguales");
        } else { //Si son distintos
            // Variables anidadas.
            if(num1>num2){
                System.out.println("Son distintos y "+ num1+ " es mayor que " + num2);
            } else if (num2>num1) {
                System.out.println("Son distintos y "+ num2+ " es mayor que " + num1);
            }
        }
        sc.close();
    }
}
