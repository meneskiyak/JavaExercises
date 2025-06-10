/*

 Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
 KDV oranını %8 olarak KDV tutarı hesaplayan program

  */

package exercises.kdv;

import java.util.Scanner;

public class CalculationKDV {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Tutar, kdvliTutar, kdvOrani;

        System.out.print("Tutarı giriniz: ");
        Tutar = scan.nextInt();

        kdvOrani = (Tutar < 1000) ? 18 : 8;
        kdvliTutar = Tutar + (Tutar * kdvOrani / 100);

        System.out.println("Kdv'siz Tutar:" + Tutar);
        System.out.println("Kdv Orani:" + kdvOrani);
        System.out.println("Kdv'li Tutar:" + kdvliTutar);

    }


}

