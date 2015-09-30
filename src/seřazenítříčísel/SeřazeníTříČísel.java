// seřazení tří čísel podle velikosti (vzestupně)
// algoritmus oiužívá techniku Bubble sort
// v nejhorším případě jsou 3 porovnání a 3 prohození
// neexistuje algoritmus s mené, než 3 porovnními, protože
// je 6 kombinací (n!=6) a ceil(log_2(n!)) = 3

package seřazenítříčísel;

import java.util.Scanner;

public class SeřazeníTříČísel {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in, "Windows-1250");
        
        System.out.println("Porovnání tří čísel vzestupně.");
        System.out.print("Zadejte první číslo: ");
        int a = vstup.nextInt();
        System.out.print("Zadejte druhé číslo: ");
        int b = vstup.nextInt();
        System.out.print("Zadejte třetí číslo:");
        int c = vstup.nextInt();
                

        if (a > b) {
            //swap(a,b);
            int pom = a;
            a = b;
            b = pom;
        }
        if (b > c) {
            //swap(b,c)
            int pom = b;
            b = c;
            c = pom;

        }
        if (a > b) {
            //swap(a,b);
            int pom = a;
            a = b;
            b = pom;
        }
        System.out.println("Seřazeno:" + a + "," + b + "," + c);
    }

}
