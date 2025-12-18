package ud2;

import java.util.Scanner;

public class E0313 {
    /**
     * @author Darío
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de alumnos a evaluar ");
        int nAlumnos = sc.nextInt();
        while (nAlumnos != 0) {
            System.out.println("Nota del alumno a evaluar ");
            int notaAlumno = sc.nextInt();
            nAlumnos--;
            if (notaAlumno >= 4 && notaAlumno < 5) {
                System.out.println("El alumno está condicionado");
            } else if (notaAlumno >= 5) {
                System.out.println("El alumno está Aprobado");
            } else if (notaAlumno < 4) {
                System.out.println("El alumno está Suspenso");
            } else {
                System.out.println("La nota no es válida");

            }

        }
        System.out.println("Se ha terminado de evaluar a los alumnos");
        sc.close();
    }
}
