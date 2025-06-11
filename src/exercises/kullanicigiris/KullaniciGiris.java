package exercises.kullanicigiris;
/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun.
Eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */

import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;
        System.out.println("Kullanıcı adınızı giriniz:");
        username = input.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (username.equals("enes") && password.equals("123456")) {
            System.out.println("Giriş yaptınız.");

        } else {
            String degisiklik;
            System.out.println("Giriş bilgileri yanlış, şifrenizi sıfırlamak ister misiniz? 'evet','hayır'");
            degisiklik = input.nextLine();
            if (degisiklik.equals("evet")) {
                System.out.println("Yeni şifrenizi giriniz.");
                password = input.nextLine();
                if (password.equals("123456")) {
                    System.out.println("Şifre oluşturulamadı, eski şifre ile yeni şifre aynı olamaz.");
                } else {
                    System.out.println("Şifre Oluşturuldu.");
                }
            } else if (degisiklik.equals("hayır")) {
                System.out.println("Sistem kapatılıyor");
            } else {
                System.out.println("Geçersiz Seçenek");
            }
        }
    }
}