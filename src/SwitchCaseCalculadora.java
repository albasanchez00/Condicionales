import javax.swing.*;
import java.util.Scanner;

public class SwitchCaseCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String num1T=JOptionPane.showInputDialog("Ingrese el primer numero → ");
        String num2T=JOptionPane.showInputDialog("Ingrese el primer numero → ");
        int num1=0, num2=0;
        String mensaje="";
        try{ // Intenta esto
            num1=Integer.parseInt(num1T);
            num2=Integer.parseInt(num2T);
        }catch(NumberFormatException e){ // Captura o recoge
            mensaje="Alguno de los numero escritos son incorrectos";
        }
        
        if(mensaje.equals("")){
            String operacion=JOptionPane.showInputDialog("Ingrese la operacion a realizar \n [1] Sumar\n [2] Restar\n [3] Multiplicar\n [4] Dividir");
            switch(operacion){
                case "1" ->{
                    double suma=num1+num2;
                    mensaje="La suma de "+num1+" + "+num2+" = "+suma;
                    break;
                }
                case "2" ->{
                    double resta=num1-num2;
                    mensaje="La resta de "+num1+" - "+num2+" = "+resta;
                    break;
                }
                case "3" ->{
                    double multiplicacion=num1*num2;
                    mensaje="La multiplicación de "+num1+" * "+num2+" = "+multiplicacion;
                    break;
                }
                case "4" ->{
                    double division=num1/num2;
                    mensaje="La división de "+num1+" / "+num2+" = "+division;
                    break;
                }
                default ->{
                    mensaje="La operación no está disponible o el valor es inválido";
                    break;
                }
            }
            JOptionPane.showMessageDialog(null,mensaje);
        }else {
            mensaje="Los campos de los números no pueden estar vacíos";
            JOptionPane.showMessageDialog(null,mensaje);
        }
    }
}
