 package ud2.dario.DQQexamen;

import java.util.Scanner;

public class Mario {
    /**
     * 
     * @author Darío Quintillán
     */
    public static int mayorQue(int n, int n1) {
        int saltosArriba=0;

        if (n > n1) {
            saltosArriba++;
        }
        
        return saltosArriba;
    }
    public static int menorQue(int n, int n1) {
        int saltosAbajo=0;

        if (n > n1) {
            saltosAbajo++;
        }
        
        return saltosAbajo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int j=0;
        int altura=1;
        while (altura>0) {
        System.out.println("Introduce altura de los muros a saltar");
        altura = sc.nextInt();
        i = sc.nextInt();
        for (i = altura; altura > i; i++) {
        }
        }
        System.out.println();
        System.out.println(i);
        System.out.println(j);
        sc.close();
    }
    
}
