package PROG.P_4.P_4_2;

import java.util.Scanner;

public class P_4_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == 'a'
                    || frase.charAt(i) == 'e'
                    || frase.charAt(i) == 'i'
                    || frase.charAt(i) == 'o'
                    || frase.charAt(i) == 'u'){
                frase = frase.replace(frase.charAt(i), Character.toUpperCase(frase.charAt(i)));
            }
        }
        System.out.println(frase);
    }
}
