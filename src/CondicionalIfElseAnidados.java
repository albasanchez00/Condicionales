import java.util.Scanner;

/* Actividad. Solicitar 3 numero e indicar el orden de menor a mayor (descendente).
     *  a==b && b==c → son iguales
     *  a>b && b>c → a,b,c/
     *  a>c && c>b → a,c,b/
     *  b>a && a>c → b,a,c/
     *  b>c && c>a → b,c,a /
     *  c>a && a>b → c,a,b/
     *  c>b && b>a → c,b,a/
 */


public class CondicionalIfElseAnidados {
    public static void main(String[] args) {
        /* Solicitar 3 numero e indicar el orden de menor a mayor (descendente) */
        // 1. Declaramos el Scanner.
        // 2. Solicitamos y leemos los numeros
        // 3. Comenzar a comparar los numeros utilizando if else anidados
        /* Ejemplo de logica →
             *  a==b && b==c → son iguales
             *  a>b && b>c → a,b,c/
             *  a>c && c>b → a,c,b/
             *  b>a && a>c → b,a,c/
             *  b>c && c>a → b,c,a /
             *  c>a && a>b → c,a,b/
             *  c>b && b>a → c,b,a/
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero → ");
        int num1=sc.nextInt();
        System.out.println("Ingrese el segundo numero → ");
        int num2=sc.nextInt();
        System.out.println("Ingrese el tercer numero → ");
        int num3=sc.nextInt();

        if (num1==num2 && num1==num3 ) {
            System.out.println("Todos los numeros son iguales");
        }else if (num1==num2 && num1!=num3) {
            System.out.println("Este caso no puede ser evaluado");
        }else{
            if (num1>num2 && num2>num3) {
                System.out.println("a="+num1 +" es mayor que b="+num2+" y este es mayor que c="+num3);
            }else if (num1>num3 && num3>num2) {
                System.out.println("a="+num1 +" es mayor que c="+num3+" y este es mayor que b="+num2);
            }else if (num2>num1 && num1>num3) {
                System.out.println("b="+num2 +" es mayor que a="+num1+" y este es mayor que c="+num3);
            }else if (num2>num3 && num3>num1) {
                System.out.println("b="+num2 +" es mayor que c="+num3+" y este es mayor que a="+num1);
            }else if (num3>num1 && num1>num2) {
                System.out.println("c="+num3 +" es mayor que a="+num1+" y este es mayor que b="+num2);
            }else if (num3>num2 && num2>num1) {
                System.out.println("c="+num3 +" es mayor que b="+num2+" y este es mayor que a="+num1);
            }
        }
    }
}


