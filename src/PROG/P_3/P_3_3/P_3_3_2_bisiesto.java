package PROG.P_3.P_3_3;

import java.util.Scanner;

public class P_3_3_2_bisiesto {
    public static void main(String[] args) {
        int year;
        char salir = 'n';
        System.out.println("Bienvenido al comprobador de años bisiestos®");
        while (Character.toLowerCase(salir) != 's') {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nIntroduce un año: ");
            year = sc.nextInt();
            System.out.println(P_3_3_2_bisiesto.bisiesto(year) ? year+" es bisiesto.": year+" no es bisiesto.");
            System.out.print("\n'S' para salir: ");
            salir = sc.next().charAt(0);
        }
        System.out.println("\nGracias por utilizar nuestro comprobador de años bisiestos® patentado.");
    }

    public static boolean bisiesto(int year) {
        boolean bisiesto = false;
        if (year % 100 == 0) {
            if (year % 400 == 0) bisiesto = true;
        } else if (year % 4 == 0) bisiesto = true;
        return bisiesto;//((year % 100 != 0) | (year % 400 == 0)) & (year % 4 == 0)
    }
}