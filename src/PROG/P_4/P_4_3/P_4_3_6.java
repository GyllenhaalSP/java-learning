package PROG.P_4.P_4_3;

import java.util.Scanner;

public class P_4_3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        double num, radical;
        do{
            System.out.print("Introduce un número: ");
            num = sc.nextDouble();
            System.out.print("Introduce un radical: ");
            radical = sc.nextDouble();
            sc.nextLine();
            System.out.println("La raíz "+radical+" de "+num+" es "+Math.pow(num, 1/radical));
            System.out.print("¿Quieres continuar? (S/N) ");
            respuesta = sc.nextLine().toUpperCase();
        }while(respuesta.equals("S"));
    }
}
