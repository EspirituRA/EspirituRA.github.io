package parcial2.tarea5;

public class Matriz3 {
    public static void main(String[] args){

        int[][] a = {
            {1, 1}, 
            {1, 1}, 
        };
        System.out.println("A:");
      
        for (int i = 0; i < a.length; ++i) {
            for(int y = 0; y < a[i].length; ++y) {
                System.out.print(+a[i][y]+ "|");
            }
                        System.out.println(" ");
        }

        int[][] b = {
            {1, 1}, 
            {1, 1}, 
        };
        System.out.println("B:");
      
        for (int i = 0; i < a.length; ++i) {
            for(int y = 0; y < a[i].length; ++y) {
                System.out.print(+b[i][y]+ "|");
            }
        System.out.println(" ");
        }

        int[][] c = {
            {0, 0}, 
            {0, 0}, 
        };
        System.out.println("C:");

        for (int i = 0; i < a.length; ++i) {
            for(int y = 0; y < a[i].length; ++y) {
             c[i][y] = a[i][y] + b[i][y];
            }
        }

        for (int i = 0; i < a.length; ++i) {
            for(int y = 0; y < a[i].length; ++y) {
        System.out.print(+c[i][y]+ "|");
            }
                        System.out.println(" ");
        }
    }
}