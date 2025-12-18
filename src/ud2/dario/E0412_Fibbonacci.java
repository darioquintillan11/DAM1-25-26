package ud2;

public class E0412_Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
        
    }
    static int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }
}
