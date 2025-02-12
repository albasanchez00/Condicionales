import javax.swing.*;
import java.util.Scanner;

public class SwitchCaseColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color= JOptionPane.showInputDialog(null,"Ingrese el nombre de un color → ");
        String mensaje;
        switch(color) {
            case "verde" -> mensaje = "Te gusta la naturaleza 🍃";
            case "azul" -> mensaje = "Te gusta el cielo ☁️";
            case "amarillo" -> mensaje = "Te gusta el sol ☀️";
            case "rojo" -> mensaje = "Te gusta San Valentín ❤️";
            default -> mensaje="No tengo nada que decirte de tu color";
        }
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
