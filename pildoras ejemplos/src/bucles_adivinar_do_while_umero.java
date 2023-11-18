import java.util.Scanner;

public class bucles_adivinar_do_while_umero {

    public static void main(String[] args) {

        int aleatorio =(int)(Math.random()*101);
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int intentos = 0;
       do {
            intentos++;
            System.out.println("Introduce un numero, por favor" );
            numero = entrada.nextInt();
            if (aleatorio<numero){
                System.out.println("Mas bajo");

            } else if (aleatorio>numero){
                System.out.println("Mas alto");

            }
        }while (numero !=aleatorio);
        System.out.println("Has acertado el numero era "+aleatorio+" en " + intentos+" intentos ");
    }




}
