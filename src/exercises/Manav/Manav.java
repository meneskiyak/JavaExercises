/*
Manav Kasa Programı

Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
package exercises.Manav;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut, elma, domates, muz, patlican, tutar;

        System.out.println("Armut Kaç Kilo: ");
        armut = input.nextDouble();
        System.out.println("Elma Kaç Kilo: ");
        elma = input.nextDouble();
        System.out.println("Domates Kaç Kilo: ");
        domates = input.nextDouble();
        System.out.println("Muz Kaç Kilo: ");
        muz = input.nextDouble();
        System.out.println("Patlıcan Kaç Kilo: ");
        patlican = input.nextDouble();

        armut = armut * 2.14;
        elma = elma * 3.67;
        domates = domates * 1.11;
        muz = muz * 0.95;
        patlican = patlican * 5.00;
        tutar = armut + elma + domates + muz + patlican;
        System.out.println("Toplam Ödenecek Tutar: " + tutar);


    }
}
