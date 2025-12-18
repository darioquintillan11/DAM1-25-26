package ud2;

import java.util.Scanner;

public class EO109_TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tabla multiplicar 1-10");
        int n = sc.nextInt();
        sc.close();

        if (n >= 1 && n <= 10 ) {
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d x %d = %d %n", n, i, n*i);
            }
        } else {
            System.out.println("El numero debe estar entre 1 y 10");
        }
    }
}
