package PROG.P_REF1EV.P_REF_1;

import java.io.IOException;
import java.util.Scanner;

public class P_REF_1_12 {
    public static void main(String[] args) throws IOException, InterruptedException {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número de 3 cifras: ");
        num1 = Integer.parseInt(sc.nextLine());
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        do {
            System.out.print("Introduce un número de 3 cifras: ");
            num2 = Integer.parseInt(sc.nextLine());
            if (num1 > num2) {
                System.out.println("El número introducido es menor\n");
            } else if (num1 < num2) {
                System.out.println("El número introducido es mayor\n");
            }
        } while (num1 != num2);
        System.out.println("¡Has acertado el número!");
    }
}