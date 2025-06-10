package exercises.ortalama;

import java.util.Scanner;

public class CalculationGPA {
    public static void main(String[] args) {

        int fizik, tarih, mat, muzik, kimya, turkce;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu girin");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu girin");
        fizik = input.nextInt();

        System.out.println("Türkçe notunuzu girin");
        turkce = input.nextInt();

        System.out.println("Müzik notunuzu girin");
        muzik = input.nextInt();

        System.out.println("Kimya notunuzu girin");
        kimya = input.nextInt();

        System.out.println("Tarih notunuzu girin");
        tarih = input.nextInt();

        int sonuc = (tarih + kimya + mat + muzik + fizik + turkce) / 6;

        String cikti = (sonuc > 60) ? ("Sınıfı Geçtiniz") : ("Sınıfta Kaldınız");

        System.out.println(cikti);


    }
}
