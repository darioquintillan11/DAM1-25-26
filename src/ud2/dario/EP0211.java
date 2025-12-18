package ud2;

import java.util.Scanner;

public class EP0211 {
    /**
     * 
     * @author Dario
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero a evaluar ");
        int n = sc.nextInt();
        int unidad = n % 10;
        int decenas = n / 10 % 10;
        int centenas = n / 100 % 10;
        int udmillar = n / 1000 % 10;
        sc.close();
        boolean esCapicua = false;

        if ((n > 99) && (n < 1000)) {
            if (unidad == centenas) {
                esCapicua = true;

            } else {
                esCapicua = false;
            }

        } else if ((n > 999) && (n < 10000)) {
            if ((unidad == udmillar) && (decenas == centenas)) {
                esCapicua = true;

            } else {
                esCapicua = false;
            }

        }
            System.out.println(esCapicua ? "es capicua" : "no es capicua");
    }

}
