package ud2;

import java.util.Scanner;

public class E0212 {
    /**
     * @author Darío
     * 
     */
    public static void main(String[] args) {
        System.out.println("Escriba dia, mes y año: ");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int año = sc.nextInt();
        sc.close();
        int diaMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            case 2 -> {
                yield 28;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            default -> {
                System.out.println("Error: el mes es incorrecto");
                yield -1;
            }
        };
        if (diaMes == dia) {
            System.out.println("La fecha es correcta ");

        } else {
            System.out.println("La fecha es incorrecta ");

        }

    }
}
