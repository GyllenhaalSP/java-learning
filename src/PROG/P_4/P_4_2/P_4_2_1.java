package PROG.P_4.P_4_2;

import java.util.Scanner;

public class P_4_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra, silaba;
        int pos = 0;

        System.out.print("Introduce una palabra: ");
        palabra = sc.nextLine();
        System.out.print("Introduce una silaba: ");
        silaba = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == silaba.charAt(0)) {
                for (int j = 0; j < silaba.length(); j++) {
                    if (palabra.charAt(i + j) == silaba.charAt(j)) {
                        if (j == silaba.length() - 1) {
                            pos = i;
                        }
                    }
                }
            }
        }
        System.out.println("La sílaba '"+silaba+
                "' empieza en la posición "+(pos+1)+" de la palabra '"+palabra+"'.");
    }
}
