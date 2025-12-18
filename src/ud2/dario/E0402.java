package ud2;

import java.util.Scanner;

public class E0402 {
    /**
     * @author Darío
     * 
     */

    private static void comprendeEnteros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer entero");
        int n1 = sc.nextInt();
        System.out.println("Segundo entero");
        int n2 = sc.nextInt();
        System.out.println("Los numeros comprendidos son desde: ");
        for (int i = n1 + 1; i < n2; i++) {
            System.out.println(i);

        }
        System.out.println("Hasta aquí");
    }

    public static void main(String[] args) {
        comprendeEnteros();

    }

}
