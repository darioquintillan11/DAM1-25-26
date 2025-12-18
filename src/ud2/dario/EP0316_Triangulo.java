package ud2;


public class EP0316_Triangulo {

    
    private static void dibujaTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        dibujaTriangulo(4);

    }

}
