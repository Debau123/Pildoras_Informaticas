import java.util.*;
import javax.swing.*;

public class Areas_case {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opcion: \n1: Cuadrado \n2:Rectangulo \n3: Triangulo \n4: Circulo");

        int figura = entrada.nextInt();

        switch (figura) {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El area del cuadrado es  " + (int) Math.pow(lado, 2));
                break;

            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del rectangulo es  " + base * altura);
                break;

            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del triagulo es " + (base * altura) / 2);
                break;

            case 4:

                int radio = base = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.println("El area del circulo es ");
                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
                break;

            default:
                System.out.println("La opcion no es correcta");


        }
    }

    public static class Entrada2 {
        public static void main(String[] args) {
            String Nombre_usuario= JOptionPane.showInputDialog("Introduce tu nombre, por favor");
            String  edad=JOptionPane.showInputDialog("Introduce la edad,por favor");
            int edad_usuario= Integer.parseInt(edad);
            edad_usuario++;
            System.out.println("Hola "+ Nombre_usuario +". Tendras el año que viene "+( edad_usuario ) + " años");
        }
    }
}
