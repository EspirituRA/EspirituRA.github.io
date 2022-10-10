import java.util.Scanner;

class Inputinteger {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        //Creamos una instancia de clase sanner
        //llamado input
        System.out.print("Enter an integer: ");
        int number = input.nextInt(); //usamos input para leer un entero
        System.out.println("You entered " + number);

        // closing the scanner object
        input.close();
    }
}
