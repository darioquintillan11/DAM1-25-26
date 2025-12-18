package ud2;

import java.util.Scanner;

public class E0211 {
    /**
     * @author Darío
     * 
     */
    public static void main(String[] args) {
        System.out.println("Escribe numero entre 1 y 7: ");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        sc.close();
        if (dia == 1) {
            System.out.println("El dia es lunes");

        } else if (dia == 2) {
            System.out.println("El dia es martes");

        } else if (dia == 3) {
            System.out.println("El dia es miercoles");

        } else if (dia == 4) {
            System.out.println("El dia es jueves");

        } else if (dia == 5) {
            System.out.println("El dia es viernes");

        } else if (dia == 6) {
            System.out.println("El dia es sabado");

        } else if (dia == 7) {
            System.out.println("El dia es domingo");

        } else {
            System.out.println("La fecha es incorrecta ");

        }

    }
}
