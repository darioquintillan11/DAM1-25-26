package ud2.dario.DQQexamen;

import java.util.Scanner;

public class radar {
    /**
     * 
     * @author Darío Quintillán
     */
    public static double velocidadMedia(int distanciaKm, int limiteKmH, int segundos) {
        double horas = segundos / 3600.;
        double velMedia = distanciaKm / horas;
        return velMedia;
    }

    public static void ilegal(double velMedia, int limiteKmH) {
        if (limiteKmH > velMedia || limiteKmH == velMedia) {
            System.out.println("Velocidad dentro do límite");
        } else if (velMedia > limiteKmH * 1.2) {
            System.out.println("Conducción temeraria!! Multa con retirada de puntos");
            System.out.println("Velocidad media " + velMedia + " superando " + limiteKmH + " en un 20%");
        } else {
            System.out.println("Velocidad excesiva! Multa!");
        }
    }

    public static int multas(double velMedia, int limiteKmH) {
        int multas;
        if (limiteKmH > velMedia || limiteKmH == velMedia) {
            multas = 0;
        } else if (velMedia > limiteKmH * 1.2) {
            multas = 1;
        } else {
            multas = 1;
        }
        return multas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radar de velocidad de tramo");
        System.out.println("----------------------------");
        System.out.println("Introduce los datos de distancia (km)");
        int distanciaKm = sc.nextInt();
        System.out.println("Velocidad maxima permitida(km/h)");
        int limiteKmH = sc.nextInt();
        int segundos = 1;
        int contadorCoches = 0;
        double velocidadTodos = 0;
        int contadorMultas = 0;
        double velocidadMax = 0;
        System.out.print("Introduce los tiempos en segundos en recorrer el tramo (0 o negativo para parar)");
        do {
            System.out.println();
            segundos = sc.nextInt();
            if (velocidadMedia(distanciaKm, limiteKmH, segundos) > velocidadMax) {
                velocidadMax = velocidadMedia(distanciaKm, limiteKmH, segundos);
            }

            if (segundos >= 1) {
                ilegal(velocidadMedia(distanciaKm, limiteKmH, segundos), limiteKmH);
                contadorCoches++;
                System.out.printf("Velocidad media %.2f Km/h", velocidadMedia(distanciaKm, limiteKmH, segundos));
                velocidadTodos += velocidadMedia(distanciaKm, limiteKmH, segundos);
            }
            contadorMultas += multas(velocidadMedia(distanciaKm, limiteKmH, segundos), limiteKmH);
            System.out.println();
        } while (segundos >= 1);
        System.out.println();
        System.out.println("Estadisticas finales: ");
        System.out.println("---------------------");
        System.out.println("Total de coches controlados " + (contadorCoches));
        System.out.printf("Velocidad media %.2f km/h", (velocidadTodos / (contadorCoches)));
        System.out.println();
        System.out.printf("Velocidad máxima %.2f km/h", velocidadMax);
        System.out.println();
        System.out.println("Total de multas impuestas = " + contadorMultas);
        sc.close();
    }
}
