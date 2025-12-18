package ud2.dario;

import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número 1: ");
        int a = sc.nextInt();
        System.out.print("Número 2: ");
        int b = sc.nextInt();
        System.out.print("Número 3: ");
        int c = sc.nextInt();
        sc.close();

        int maior;
        if (a > b && a > c)
            maior = a;
        else if (b > a && c > b)
            maior = c;
        else
            maior = b;

        System.out.println("O maior é: " + maior);
    }
}
