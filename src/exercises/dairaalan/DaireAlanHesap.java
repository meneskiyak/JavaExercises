package exercises.dairaalan;

import java.util.Scanner;

public class DaireAlanHesap {
    public static void main(String[] args) {

        double pi=3.14, alan, aci, yaricap;
        Scanner scan = new Scanner(System.in);

        System.out.println("Açıyı giriniz: ");
        aci = scan.nextInt();

        System.out.println("Yarıçapı giriniz: ");
        yaricap = scan.nextDouble();

        alan = (pi*(yaricap*yaricap)*aci)/360;
        System.out.println(alan);
    }
}
