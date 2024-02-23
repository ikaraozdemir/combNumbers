import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;
        Scanner input = new Scanner(System.in);
        System.out.print("n'i giriniz :");
        n = input.nextInt();
        System.out.print("r'yi giriniz :");
        r = input.nextInt();

        int fac1 = 1,fac2 = 1,fac3 = 1;
        for (int i = 1; i <= n; i++) {
            fac1 *= i;
        }System.out.println(fac1);
        for (int j = 1; j <= r; j++) {
            fac2 *= j;
        }System.out.println(fac2);
        for (int k = 1; k <= (n - r); k++) {
            fac3 *= k;
        }System.out.println(fac3);
        double comb = (fac1/(fac2*fac3));
         System.out.println(n + "'in " + r + "'li kombinasyonu :"
         +comb);
    }
}