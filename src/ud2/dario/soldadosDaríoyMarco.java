package ud2;

import java.util.Scanner;

public class soldadosDaríoyMarco {
    /**
     * 
     * @author Darío y Marco
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero de soldados: ");
        int n = sc.nextInt();
        sc.close();

        int i = n;

        while (n > 0) {
            if (i % Math.sqrt(i) == 0 && i <= n) {
                if (n > 3) {
                    System.out.println();
                    System.out.println("Formacion cuadrada: " + i + " soldados ");
                    for (int j = i; j >= 1; j--) {
                        if (j % Math.sqrt(i) == 0) {
                            System.out.println();
                        }
                        System.out.print("* ");
                    }

                    n -= i;

                }
                if (n <= 3 && n > 0) {
                    System.out.println();
                    System.out.println("Formacion en línea: " + n + " soldados");
                    for (int j = 0; j < n; j++) {
                        System.out.print("* ");
                    }
                    n = 0;
                }
            } else {

                i--;
            }

        }
    }

}