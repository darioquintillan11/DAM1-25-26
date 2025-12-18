package ud2;

import java.util.Random;
import java.util.Scanner;

public class E0303 {
    public static void main(String[] args) {
        Random rdm = new Random();
        int numero_Generado = rdm.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        int numero_Introducido = 0;
        int intentos = 0;

        while (numero_Generado != numero_Introducido) {
            System.out.print( "Introduce un numero: " );
            numero_Introducido = sc.nextInt();
            intentos += 1;
            if (numero_Generado == numero_Introducido) {
                System.out.println("Has acertado el numero");
                System.out.printf("Te tomo el numero de %d intentos." , intentos);
            } else {
                if (numero_Introducido == -1) {
                    System.out.printf("Te has rendido y el numero era %d", numero_Generado);
                    numero_Introducido = numero_Generado;
                } else if (numero_Generado > numero_Introducido){
                    System.out.println("El numero es mayor");
                } else {
                    System.out.println("El numero es menor");
                }
            }
            
        }

        sc.close();
    }

}