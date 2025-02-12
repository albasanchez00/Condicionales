import javax.swing.*;
import java.util.Scanner;

public class SwitchCaseNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String notaAlumno= JOptionPane.showInputDialog("Ingrese una nota → ");
        byte nota=Byte.parseByte(notaAlumno);

        String mensaje;

        switch(nota) {
            case 0,1,2,3,4 -> mensaje="Debes estudiar más. Nivel: Suspenso!";
            case 5 -> mensaje="Puedes mejorar. Nivel: Suficiente";
            case 6 -> mensaje="Puedes mejorar aun más. Nivel: Bien";
            case 7,8 -> mensaje="Vas por buen camino. Nivel: Notable";
            case 9 -> mensaje="Vas por buen camino. Nivel: Sobre saliente";
            case 10 -> mensaje="Perfecto. Nivel: Matricula de Honor";
            default -> mensaje="Nota no válida, debe estar comprendida entre 0 y 10 puntos";
        }

        JOptionPane.showMessageDialog(null,mensaje);
    }
}
