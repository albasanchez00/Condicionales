import javax.swing.*;
import java.util.Scanner;
/* Actividad Propuesta.
        - precio
        - aforo
        - numero_entradas_vendidas
            1. Se calcula el precio * numero_entradas_vendidas
            2. Si el numero de entradas es menor que el (aforo * 0.2) salida por consola -> Se cancela concierto
            3. Si el numero de entradas es menor que el (aforo * 0.5) se aplica un descuento del 25% (precioEntrada*0.75)
            4. Si el numero de entradas es mayor al 50%, todo continua con normalidad.
        */
public class entradasConcierto {
    public static void main(String[] args) {
        /* Salida por pantalla de otra manera
        * Esta salida solo puede usarse para leer tipo String.
        * Sintaxis → JOptionPane.showInputDialog("")
        * Ejemplo →
            String mensaje= JOptionPane.showInputDialog("Ingrese su mensaje");
            System.out.println(mensaje);
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Indique el aforo máximo → ");
        int aforo=sc.nextInt();
        System.out.print("Indique el precio de las entradas → ");
        double precioEntradas=sc.nextDouble();
        System.out.print("Indique el número de entradas vendidas → ");
        int entradasVendidas=sc.nextInt();

        //Calculamos el total de la recaudación
        double recaudacion=(double)entradasVendidas*precioEntradas;

        //Valoramos si las entradas vendidas es menor al 20% del aforo.
        if (entradasVendidas<(aforo*0.20)) {
            System.out.println("El concierto se cancela, se procede a la devolución de las entradas.");
        } else if (entradasVendidas<(aforo*0.50)) {
            //Procede si → las entradasVendidas es menor al 50% del aforo.
            //En este caso aplicaremos un descuento del 25% al precio de las entradas.
            System.out.println("Las entradas pasaran a tener un 25% de descuento");
            precioEntradas*=0.75;
            //Por último mostramos el nuevo precio de las entradas.
            System.out.println("Las entradas ahora valen "+precioEntradas+"€");
        }else {
            System.out.println("El concierto continua con normalidad, el precio de la entrada es: "+precioEntradas+"€");
        }
        //Mostramos el total recaudado hasta ahora.
        System.out.println("El total recaudado hasta el momento es: "+recaudacion);
        sc.close();
    }
}
