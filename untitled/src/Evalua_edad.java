package untitled.src;

import java.util.Scanner;

public class Evalua_edad {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = Entrada.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

    }
}
