package ud2;


public class EO109_TablaMultiplicar2 {
    public static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            System.out.println("Tabla de multiplicar del numero " + n);
            System.out.println("===============================");
            
        
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d x %d = %d %n", n, i, n*i);
            }
    }

}
}
