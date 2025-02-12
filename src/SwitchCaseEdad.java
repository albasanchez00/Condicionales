import javax.swing.*;
import java.util.Scanner;

public class SwitchCaseEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje;
        String edadString= JOptionPane.showInputDialog("Ingrese su edad en años → ");
        byte edad;
        try{ // Intenta esto
            edad=Byte.parseByte(edadString);
        }catch(Exception e){ // Captura o recoge
            edad=-1;
        }
        switch(edad) {
            case 0 -> mensaje="Eres un recien nacido / bebé";
            case 1,2,3,4 -> mensaje="Eres un infante";
            case 5,6,7,8,9,10,11 -> mensaje="Eres un niño/a";
            case 12,13,14,15,16,17 -> mensaje="Eres un adolescente";
            case 18,19,20,21,22,23,24 -> mensaje="Eres joven";
            case 25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44 -> mensaje="Eres un adulto joven";
            case 45,46,47,48,49,50,51,52,53,54,55,56,57,58,59-> mensaje="Eres un adulto";
            case 60,61,62,63,64,65 -> mensaje="Puedes proceder a la jubilación";
            default -> mensaje="No es posible reconocer la edad ingresada. Ingrese una edad entre 1 y 65 años";
        }
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
