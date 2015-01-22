package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Dam1 {

    public static final int TAM = 5;
    int[] notas = new int[TAM];
    String[] alumnos = {"OSCAR", "AARON", "RAUL", "AITOR", "DAVID"};

    public void notas() {

        for (int i = 0; i < TAM; i++) {
            double random = Math.random() * 10 + 1;
            int valor = (int) random;
            notas[i] = valor;
            System.out.println(alumnos[i] + "-->" + notas[i]);
        }
    }

    public void visNA() {
        for (int i = 0; i < TAM; i++) {
            System.out.println(alumnos[i] + "-->" + notas[i]);
        }
    }

    public void visualizarApS() {
        int ap = 0, sp = 0;
        for (int i = 0; i < TAM; i++) {
            if (notas[i] >= 5) {
                System.out.println("Nota " + (i + 1) + "-->" + notas[i] + " APROBADO");
                ap++;
            } else {
                System.out.println("Nota " + (i + 1) + "-->" + notas[i] + " SUSPENSO");
                sp++;
            }
        }
        System.out.println("Aprobados: " + ap + "\nSuspensos: " + sp);
    }

    public void nMedia() {
        int ac = 0;
        for (int i = 0; i < TAM; i++) {
            ac += notas[i];
        }
        System.out.println("Nota Media: " + (ac / TAM));
    }

    public void nMax() {
        int nM = 0;
        for (int i = 0; i < TAM; i++) {
            if (notas[i] > nM) {
                nM = notas[i];
            }
        }
        System.out.println("Nota mas alta: " + nM);
    }

    public void nAlumno() {
        String n = JOptionPane.showInputDialog("Nombre del Alumno.");
        n = n.toUpperCase();
        for (int i = 0; i < TAM; i++) {
            if (n.equals(alumnos[i])) {
                System.out.println("Alumno: " + n + " Nota: " + notas[i]);
            }
        }
    }

    public void aAprob() {
        System.out.println("Aprobados.");
        for (int i = 0; i < TAM; i++) {
            if (notas[i] >= 5) {
                System.out.println("Alumno: " + alumnos[i]);
            }
        }
    }

    public void ordenarNA() {
        int c = 0, aux;
        String aux2;
        do {
            c = 0;
            for (int i = 0; i < TAM - 1; i++) {
                if (notas[i] > notas[i + 1]) {
                    aux = notas[i];
                    notas[i] = notas[i + 1];
                    notas[i + 1] = aux;

                    aux2 = alumnos[i];
                    alumnos[i] = alumnos[i + 1];
                    alumnos[i + 1] = aux2;

                    c = 1;
                }
            }
        } while (c != 0);

    }
}
