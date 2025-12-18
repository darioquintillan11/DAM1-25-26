package ud2;

public class EP0316_TrianguloPascal {
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void trianguloPascal(int num) {
        for (int n = 0; n <= num; n++) {
            for (int m = 0; m < n; m++) {
                long e = factorial(n) / (factorial(m)) * factorial(n - m);
                System.out.println(e + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        trianguloPascal(10);

    }

}
