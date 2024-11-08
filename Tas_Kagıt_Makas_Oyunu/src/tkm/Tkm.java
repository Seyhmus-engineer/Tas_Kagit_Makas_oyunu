package tkm;

import java.util.Random;
import java.util.Scanner;


public class Tkm {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int pc, kisi;
        Random r = new Random();
        int tur;
        int pcSkor=0,kisiSkor=0;
        
        System.out.print("Kaç tur oynamak istiyorsunuz: ");
        tur=oku.nextInt();
        
                
        for (int i = 1; i <= tur; i++) {
            
        pc = r.nextInt(3) + 1;
        System.out.println("1 taş");
        System.out.println("2 kağıt");
        System.out.println("3 makas");
        System.out.println("0 oyunu bitir");
        System.out.print("Lütfen seçiminizi yapınız: ");
        kisi = oku.nextInt();
        
        
        if (kisi==0) {
            System.out.println("Oyun Bitiriliyor....");
            break;
        }
        else if (kisi != 1 && kisi != 2 && kisi != 3) {
                System.out.println("Yanlış bir seçim yaptınız");
            }
        else {
            if (pc == kisi) {
                System.out.println(" ");
                System.out.println("Pc: "+pc+" Kişi: "+kisi);
                System.out.println("Berabere");
                System.out.println(" ");
            }
            else if (pc == 1 && kisi == 2) {
                System.out.println(" ");
                kisiSkor++;
                System.out.println("Pc: "+pc+" Kişi: "+kisi);
                System.out.println("Kişi kazandı");
                System.out.println(" ");
            }
            else if (pc == 1 && kisi == 3) {
                System.out.println(" ");
                pcSkor++;
                System.out.println("Pc: "+pc+" Kişi: "+kisi);
                System.out.println("pc kazandı");
                System.out.println(" ");
            }
            else if (pc == 2 && kisi == 1) {
                System.out.println(" ");
                pcSkor++;
                System.out.println("Pc: "+pc+" Kişi: "+kisi);
                System.out.println("pc kazandı");
                System.out.println(" ");
            }
            else if (pc == 2 && kisi == 3) {
                System.out.println(" ");
                kisiSkor++;
                System.out.println("Pc: "+pc+" Kişi: "+kisi);
                System.out.println("kişi kazandı");
                System.out.println(" ");
            }
            else if (pc == 3 && kisi == 1) {
                System.out.println(" ");
                kisiSkor++;
                System.out.println("Pc: "+pc+" Kişi: "+kisi);
                System.out.println("kişi kazandı");
                System.out.println(" ");
            }
            else if (pc == 3 && kisi == 2) {
                System.out.println(" ");
                pcSkor++;
                System.out.println("Pc: "+pc+" Kişi: "+kisi);
                System.out.println("pc kazandı");
                System.out.println(" ");
            }
        }
        
        }
        
        System.out.println("***************************************");
        
        System.out.println("   Skor Tabelası   ");
        System.out.println("Pc: "+pcSkor+" "+" Kişi: "+kisiSkor);
        
        if (pcSkor>kisiSkor) {
            System.out.println("Pc Kazandı...");
        }
        else if (pcSkor<kisiSkor) {
            System.out.println("Tebrikler kazandınız....");
        }
        else{
            System.out.println("Berabere Kaldınız....");
        }
        
        System.out.println("***************************************");

    }

}
