package ud2.dario;

public class capicuaCualquier {
    /**
     * 
     * @author Dario
     */

     public static long invertirNumero(long n) {
        long numInvert = 0;
        while (n % 10 != 0) {
            numInvert = numInvert * 10 + n % 10;
            n = n/10;
            
        }
        return numInvert;
     }
     public static boolean esCapicua(long n) {
        long nInvertido = invertirNumero(n);
        return n == nInvertido;
     }
     
    public static void main(String[] args) {
        System.out.println(esCapicua(1221));
        System.out.println(esCapicua(123321));
        System.out.println(esCapicua(12344321));
    }
}
