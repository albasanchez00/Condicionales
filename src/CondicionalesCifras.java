import java.util.Scanner;

public class CondicionalesCifras {
    public static void main(String[] args) {
        /* Solictitar un numero al usuario e indicar cuantas cifras tiene
        * Delimitar que el numero este entre 0 y 9999
        * 1. Declaramos el Scanner
        * 2. Solicitamos el numero
        * 3. Declaramos el la variable y leemos el numero.
        *  Si el numero esta comprendido entre 0 y 9 → tiene 1 cifra (num>=0 && numero<10)
        *  Si el numero esta comprendido entre 10 y 99 → tiene 2 cifras (num>=10 && numero<99)
        *  Si el numero esta comprendido entre 100 y 999 → tiene 3 cifras (num>=100 && numero<999)
        *  Si el numero esta comprendido entre 1000 y 9999 → tiene 4 cifras (num>=1000 && numero<9999)
        *  Si el numero esta comprendido entre 10000 y 99999 → tiene 5 cifras (num>=10000 && numero<99999)
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número → ");
        int numero = sc.nextInt();

        if(numero>=0&&numero<=10) {
            System.out.println("El número "+numero+" tiene 1 cifra");

        }else if (numero>=10&&numero<100) {
            System.out.println("El número "+numero+" tiene 2 cifras");

        }else if (numero>=100&&numero<1000) {
            System.out.println("El número "+numero+" tiene 3 cifras");

        }else if (numero>=1000&&numero<10000) {
            System.out.println("El número "+numero+" tiene 4 cifras");

        }else if (numero>=10000&&numero<1000000) {
            System.out.println("El número "+numero+" tiene 5 cifras");
        }
    }
}
