package ud2;

import java.util.Scanner;

public class E0403 {
    public static double area(double altura, double radio) {
        return 2 * Math.PI * radio * (altura + radio);
    }

    public static double volumen(double altura, double radio) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura? ");
        double alt = sc.nextDouble();

        System.out.print("Radio de la base? ");
        double rad = sc.nextDouble();
        sc.close();
        double vol = volumen(alt, rad);
        double area = area(alt, rad);
        System.out.printf("El área del cilindro es %.2fu2 y la volumen %.2fu3", area, vol);
    }
}