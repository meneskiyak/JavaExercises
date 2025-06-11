/*
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Vücut Kitle İndeksini(VKİ) hesaplayın.
 */
package exercises.VKI;

import java.util.Scanner;

public class VkiCalculation {
    public static void main(String[] args) {
        double boy, kilo, indeks;
        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu metre cinsinden giriniz:");
        boy = input.nextDouble();
        System.out.println("Kilounuzu kg cinsinden giriniz:");
        kilo = input.nextDouble();
        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);
    }
}
