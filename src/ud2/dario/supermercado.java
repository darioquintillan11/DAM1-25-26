package ud2;

import java.util.Scanner;

public class supermercado {

    public static double importeProducto(double precio, int cantidad) {
        double importe = precio * cantidad;
        return importe;
    }

    public static void desgloseCambio(double efectivo, double importeTotal) {
        if (efectivo > importeTotal) {
            int billete50 = 0;
            int billete20 = 0;
            int billete10 = 0;
            int billete5 = 0;
            int moneda2e = 0;
            int moneda1e = 0;
            int centimos = 0;
            double cambio = efectivo - importeTotal;

            while (cambio >= 50) {
                billete50++;
                cambio -= 50;
            }
            while (cambio >= 20) {
                billete20++;
                cambio -= 20;
            }
            while (cambio >= 10) {
                billete10++;
                cambio -= 10;
            }
            while (cambio >= 5) {
                billete5++;
                cambio -= 5;
            }
            while (cambio >= 2) {
                moneda2e++;
                cambio -= 2;
            }
            while (cambio >= 1) {
                moneda1e++;
                cambio -= 1;
            }
            while (cambio >= 0.01) {
                centimos++;
                cambio -= 0.01;
            }

            System.out.printf(
                    "El cambio es de %d billetes de 50, %d billetes de 20, %d billetes de 10, %d billetes de 5, %d monedas de 2, %d monedas de 1, %d céntimos.%n",
                    billete50, billete20, billete10, billete5, moneda2e, moneda1e, centimos);
        } else {
            System.out.println("El efectivo no es suficiente");
        }
    }

    public static void main(String[] args) {
        double precio = 0;
        int cantidad = 0;
        double importeTotal = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce el precio del producto a comprar: ");
            System.out.println("introduce -1 para parar el proceso");
            precio = sc.nextDouble();
            if (precio < 0)
                break;

            System.out.println("Introduce la cantidad de producto a comprar: ");
            cantidad = sc.nextInt();

            double importe = importeProducto(precio, cantidad);
            System.out.println("Precio de los productos: " + importe);

            importeTotal += importe;
        } while (precio > 0);

        System.out.println("Total a pagar: " + importeTotal);
        System.out.println("¿Con qué quieres pagar?");
        System.out.println("1. Tarjeta");
        System.out.println("2. Efectivo");

        int tarjetaEfectivo = sc.nextInt();

        if (tarjetaEfectivo == 1) {
            System.out.println("Muchas gracias por comprar en nuestro establecimiento");
        } else {
            System.out.println("Introduzca importe a pagar: ");
            double efectivo = sc.nextDouble();
            desgloseCambio(efectivo, importeTotal);
        }

    }
}
