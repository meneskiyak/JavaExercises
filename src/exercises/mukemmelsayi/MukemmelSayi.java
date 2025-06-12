/*

Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
Değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan
sayıya mükemmel sayı denir.

 */

package exercises.mukemmelsayi;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, toplam = 0;
        System.out.print(" Pozitif bir sayi giriniz: ");
        sayi = input.nextInt();

        if (sayi > 0) {

            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }
            if (toplam == sayi) {
                System.out.println(sayi + " mükemmel bir sayidir.");
            } else {
                System.out.println(sayi + " mükemmel bir sayi degildir.");
            }
        } else {
            System.out.print("Geçersiz sayı girdiniz.");
        }
    }
}
