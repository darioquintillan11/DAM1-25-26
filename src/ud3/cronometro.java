package ud3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class cronometro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce enter para iniciar el contador");
        String enter = sc.nextLine();
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Introduce de nuevo enter para parar");
        String enter2 = sc.nextLine();
        LocalDateTime ahora2 = LocalDateTime.now();
        sc.close();
        long segundos = ahora.until(ahora2, ChronoUnit.SECONDS);
        if (segundos > 60) {
        long minutos = segundos / 60;
            long segundosRestantes = segundos % 60;
            System.out.println(minutos + " Minutos y " + segundosRestantes + " segundos");
        } else {
            System.out.println(segundos + " segundos");
        }
    }
}
