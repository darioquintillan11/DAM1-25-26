package ud2;

public class digitos {
    /**
     * 
     * @author Dario
     */
    public static void main(String[] args) {
        System.out.println("Introduce el numero a dividir ");
        int n = Util.leerInt();
        for (int i = 1; i <= n; i *= 10) {
            System.out.println(n / i % 10);
        }
    }
}
