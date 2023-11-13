import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Entrada2 {
    public static void main(String[] args) {
        String Nombre_usuario= JOptionPane.showInputDialog("Introduce tu nombre, por favor");
        String  edad=JOptionPane.showInputDialog("Introduce la edad,por favor");
        int edad_usuario= Integer.parseInt(edad);
        edad_usuario++;
        System.out.println("Hola "+ Nombre_usuario +". Tendras el año que viene "+( edad_usuario ) + " años");
    }
}
