package exercises.ucgenalan;

/*
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
Üçgenin çevresi = 2𝑢 𝑢 = (a+b+c) / 2 Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */
import java.util.Scanner;

public class AlanHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kenar1, kenar2, kenar3, u, karealan;

        System.out.print("1.kenar uzunluğunu giriniz: ");
        kenar1 = scan.nextInt();

        System.out.print("2.kenar uzunluğunu giriniz: ");
        kenar2 = scan.nextInt();

        System.out.print("3.kenar uzunluğunu giriniz: ");
        kenar3 = scan.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2;
        karealan = u * (u-kenar1)*(u-kenar2)*(u-kenar3);

        System.out.println("Üçgenin Alanı: " + Math.sqrt(karealan));

    }
}
