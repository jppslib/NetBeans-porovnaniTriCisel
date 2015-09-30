// seřazení tří čísel podle velikosti (vzestupně)
// algoritmus oiužívá techniku Bubble sort
// v nejhorším případě jsou 3 porovnání a 3 prohození
// neexistuje algoritmus s mené, než 3 porovnními, protože
// je 6 kombinací (n!=6) a ceil(log_2(n!)) = 3

package seřazenítříčísel;

public class SeřazeníTříČísel {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;

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
