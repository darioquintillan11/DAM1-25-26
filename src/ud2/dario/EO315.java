package ud2;

import java.util.Scanner;

public class EO315 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de niveles del triangulo ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j-- ) {
                System.out.print("* ");
                
            }
                System.out.println();
        }
    }
}
