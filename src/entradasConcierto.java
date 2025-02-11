import java.util.Scanner;

public class entradasConcierto {
    public static void main(String[] args) {
        /* Actividad Propuesta.
        - precio
        - aforo
        - numero_entradas_vendidas
            1. Se calcula el precio * numero_entradas_vendidas
            2. Si el numero de entradas es menor que el (aforo * 0.2) salida por consola -> Se cancela concierto
            3. Si el numero de entradas es menor que el (aforo * 0.5) se aplica un descuento del 25%
            4. Si el numero de entradas es mayor al 50%, todo continua con normalidad.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el aforo máximo → ");
        int aforo=sc.nextInt();
        System.out.println("Indique el número de entradas vendidas → ");
        int entradasVendidas=sc.nextInt();
        System.out.println("Indique el precio de las entradas → ");
        int precioEntradas=sc.nextInt();

        int totalRecaudado=precioEntradas*entradasVendidas;
        if (entradasVendidas<(aforo*0.2)) {
            System.out.println("El concierto se cancela");
        } else if (entradasVendidas<(aforo*0.5)) {
            System.out.println("Las entradas pasaran a tener un 25% de descuento");

        }else {
            System.out.println("El concierto continua con normalidad");
        }
    }
}
