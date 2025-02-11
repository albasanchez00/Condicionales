import java.util.Scanner;

public class CondicionalFecha {
    public static void main(String[] args) {
        /* Actividad. Solicitar por teclado una fecha (dd/mm/yyyy) e indica si la fecha es correcta
        * Ejemplo → 31-02-2025 → fecha incorrecta.
        * 1. Declaramos el Scanner.
        * 2. Solicitamos dia y leemos el dato.
        * 3. Solicitamos mes y leemos el dato.
        * 4. Solicitamos año y leemos el dato.
        * 5. Devolvemos si el formato de la fecha inrtoducida es correcto o erroneo.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un día → ");
        byte day = sc.nextByte();
        System.out.println("Introduzca un mes → ");
        byte month = sc.nextByte();
        System.out.println("Introduzca un año → ");
        short year = sc.nextShort(); // Short → hasta 32.000 caracteres

        //Creamos una variable llamda booleana, que leera si la fecha es correcta o no.
        boolean fechaCorrecta;

        //Validamos el año →
        if(year==0) { //Si el año es mayor que 0
            fechaCorrecta=false;
        }else {
            if (month==2 && (day>=1 && day<=28)) {
                fechaCorrecta=true;
            }else if ((month==4||month==6||month==9||month==11) && (day>=1 && day<=30)) {
                fechaCorrecta=true;
            }else if ((month==1||month==3||month==5||month==7||month==8||month==10||month==12) && (day>=1 && day<=31)) {
                fechaCorrecta=true;
            }else { //Si el año es igual a 0
                fechaCorrecta=false;
            }
        }

        //Validamos que el formato de la fecha sea la correcta
        if (fechaCorrecta) { //Si fechaCorecta == true
            System.out.println("La fecha "+day+"/"+month+"/"+year+" es correcta");
        }else { //Si fechaCorecta == false
            System.out.println("La fecha "+day+"/"+month+"/"+year+" no es correcta");
        }
    }
}
