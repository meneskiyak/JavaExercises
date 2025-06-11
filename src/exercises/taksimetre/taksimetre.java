/*
Gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.

 */

package exercises.taksimetre;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        int acilis = 10;
        double tutar, km;
        Scanner scan = new Scanner(System.in);

        System.out.print("Km miktarını giriniz: ");
        km = scan.nextInt();

        tutar = acilis + km * 2.20;
        tutar = tutar < 20 ? 20 : tutar;
        System.out.println("Tutar: " + tutar);
    }
}
