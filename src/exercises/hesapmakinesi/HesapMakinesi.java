package exercises.hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sayi1, sayi2, sonuc;
        String islem;
        System.out.println("Yapmak istediğiniz işlemi yazınız 'toplama','cikarma','carpma','bolme': ");
        islem = input.nextLine();

        System.out.print("Sayi1 Giriniz: ");
        sayi1 = input.nextDouble();
        System.out.print("Sayi2 Giriniz: ");
        sayi2 = input.nextDouble();

        switch (islem) {
            case "toplama":
                sonuc = sayi1 + sayi2;
                break;
            case "cikarma":
                sonuc = sayi1 - sayi2;
                break;
            case "carpma":
                sonuc = sayi1 * sayi2;
                break;
            case "bolme":
                sonuc = sayi1 / sayi2;
                break;
            default:
                System.out.println("Geçersiz İşlem");
                return;
        }

        System.out.println("işlem sonucu:" + sonuc);

    }
}
