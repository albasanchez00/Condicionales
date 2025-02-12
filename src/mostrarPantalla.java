import javax.swing.*;
import java.util.Scanner;

public class mostrarPantalla   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Salida por pantalla de otra manera
         * Esta salida solo puede usarse para leer tipo String.
         * Sintaxis → JOptionPane.showInputDialog("") → Recoge el mensaje
         * Sintaxis → JOptionPane.showMessageDialog("") → Muestra el mensaje
         * Para pasar String a tipo Entero → int aforo=Integer.parseInt(aforoString)
         */

        // Procedemos a pedir los datos y a recogerlos.
        String aforoString= JOptionPane.showInputDialog("Ingrese el aforo máximo → ");
        int aforo=Integer.parseInt(aforoString); // → Convertir un String en Entero

        String entradasVendidasString= JOptionPane.showInputDialog("Ingrese el numero de entradas vendidas → ");
        int entradasVendidas=Integer.parseInt(entradasVendidasString);

        String precioEntradasString= JOptionPane.showInputDialog("Ingrese el precio de la entrada → ");
        double precioEntradas=Integer.parseInt(precioEntradasString);


        // Calculamos el total de la recaudación →
        double recaudacion=precioEntradas*entradasVendidas;

        // Valoramos si las entradas vendidas es menor al 20% del aforo.
        if (entradasVendidas<(aforo*0.20)) {
            // Mostramos el mansaje por pantalla →
            JOptionPane.showMessageDialog(null,"El concierto se cancela, se procede a la devolución de las entradas.");
        } else if (entradasVendidas<(aforo*0.50)) {
            // Procede si → las entradasVendidas es menor al 50% del aforo.
            // En este caso aplicaremos un descuento del 25% al precio de las entradas.
            JOptionPane.showMessageDialog(null,"Las entradas pasaran a tener un 25% de descuento");
            precioEntradas*=0.75; // Calulamos el descuento.
            // Por último mostramos el nuevo precio de las entradas.
            JOptionPane.showMessageDialog(null,"Entradas rebajadas un 25% ->"+precioEntradas+"€");
        }else {
            JOptionPane.showMessageDialog(null,"El concierto marcha con normalidad");
        }
        // Mostramos la recaudación total hasta ahora.
        JOptionPane.showMessageDialog(null,"El total recaudado hasta el momento es: "+recaudacion);
        sc.close();
    }
}
