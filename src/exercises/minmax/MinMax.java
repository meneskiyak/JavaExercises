/*
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
ve bu sayıları ekrana yazan programı yazın.
 */
package exercises.minmax;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kacsayi, min = 0, max = 0;

        System.out.println("Kaç tane sayı gireceksiniz?");
        kacsayi = scan.nextInt();

        for (int n = 1; n <= kacsayi; n++) {
            System.out.println(n + ". sayıyı giriniz.");

            int deger = scan.nextInt();
            if (n == 1) {
                max = deger;
                min = deger;
                continue;
            }
            if (deger > max) {
                max = deger;
            } else if (deger < min) {
                min = deger;
            }
        }
        System.out.println("Max değer: " + max);
        System.out.println("Min değer: " + min);
    }
}
