package parcial2.tarea5;

import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {

        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Ingresar valor: ");
            int N=num.nextInt();

            int[][] a = {
                {2, 0, 1}, 
                {3, 0, 0}, 
                {5, 1, 1}
            };
            System.out.println("Matriz 3x3:");
     
            for (int i = 0; i < a.length; ++i) {
                for(int y = 0; y < a[i].length; ++y) {
                    System.out.print( +a[i][y]+ "|");
                }
            System.out.println("");;
            }
      
            int[][] b = {
                {0, 0, 0}, 
                {0, 0, 0}, 
                {0, 0, 0}
                };
             System.out.println("Matriz multiplicada por " + N +  ":");

            for (int i = 0; i < a.length; ++i) {
                for(int y = 0; y < a[i].length; ++y) {
                 b[i][y] = N * a[i][y];
                }
            }

            for (int i = 0; i < a.length; ++i) {
                for(int y = 0; y < a[i].length; ++y) {
                    System.out.print( +b[i][y]+ "|");
                }
             System.out.println(" ");;
            }
        }
    }
}
