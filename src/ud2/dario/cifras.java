package ud2.dario;

public class cifras {
        public static int numCifras(int num) {
        int cont = 0;
        if (num == 0) { return 1; }
        while (num != 0) {
            num = num / 10;
            cont++;
        }
        return cont;
    }
    public static void main(String[] args) {
        System.out.println(numCifras(0));
    }
}

