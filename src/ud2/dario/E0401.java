package ud2;

import java.util.Scanner;

public class E0401 {
    /**
     * @author Darío
     * 
     */
    static void ecoN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de Ecos");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Eco...");

        }
    }

    public static void main(String[] args) {
        ecoN();
    }

}
