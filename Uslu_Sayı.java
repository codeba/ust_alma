package patika;

import java.util.Scanner;

public class Uslu_Sayı {
    public static void main(String[] args) {
        int n,k,total=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("üssü alınacak sayı:");
        n=sc.nextInt();
        System.out.print("üst olacak satıtı giriniz:");
        k=sc.nextInt();
        for (int i = 0; i <k ; i++) {
            total*=n;
        }
        System.out.println("Cevap:"+total);
    }
}
