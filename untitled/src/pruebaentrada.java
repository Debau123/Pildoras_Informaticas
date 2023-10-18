import java.util.Scanner;

public class pruebaentrada {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre_usuario=entrada.next();
        System.out.println("Introduce edad ,por favor" );
        int edad= entrada.nextInt();
        System.out.println("Hola "+ nombre_usuario +". El año que viene tendrás "+ (edad+1)+" años");
    }
}
