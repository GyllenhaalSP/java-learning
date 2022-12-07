package PROG.P_3.P_3_6;

import java.util.Scanner;

public class P_3_6_5_fibonacci {

    public static int fibonacci(int n) {
        if(n==1)
            return 1;
        else if(n==2)
            return 1;
        else
            return (fibonacci(n-1) + fibonacci(n-2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el enésimo número: ");
        int n = sc.nextInt(), primero = 1, segundo = 1, desplazable=0;

        while(n < 1) {
            System.out.print("Introduce un enésimo número mayor que 0: ");
            n = sc.nextInt();
        }

        System.out.print("\n"+primero+" ");

        if (n >= 2) {
            System.out.print(segundo);
        }

        for(int i = 0; i < n-2; i++){
            desplazable = primero+segundo;
            primero = segundo;
            segundo = desplazable;
            System.out.print(" "+desplazable);
        }

        if (n==1 || n==2){
            desplazable = 1;
        }

        System.out.println("\n\nEl "+n+"º número de la secuencia de fibonacci es "+desplazable);
        System.out.println("El "+n+"º número recursivo de la secuencia de fibonacci es "+fibonacci(n));
    }
}
