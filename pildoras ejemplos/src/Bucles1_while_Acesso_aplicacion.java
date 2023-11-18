import javax.swing.*;

public class Bucles1_while_Acesso_aplicacion {
    public static void main(String[] args) {
        String clave = "Iñaki";
        String pass = "";
        while (clave.equals(pass) == false) {
            pass = JOptionPane.showInputDialog(" Introduce la contrseña , por favor");
            if (clave.equals(pass) == false) {
                System.out.println("Constraseña incorrecta");
            }
        }
        System.out.println("Contrseña correcta acesso permitido");


    }
}
