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

        if(edad>=1&&edad<=12) {
            mensaje="Eres un niño.";
        } else if (edad>=13&&edad<=17) {
            mensaje="Eres un adolescente.";
        }else if(edad>=18&&edad<=21) {
            mensaje="Eres un joven.";
        }else if(edad>=22&&edad<=40) {
            mensaje="Eres un joven.";
        }else if(edad>=41&&edad<=60) {
            mensaje="Eres mayor.";
        }else if(edad>=61&&edad<=67) {
            mensaje="Próximo a jubilarte.";
        } else if (edad>=67) {
            mensaje="Eres un jubilado.";
        } else {
            mensaje="La edad no es correcta.";
        }
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
