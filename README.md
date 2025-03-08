# Taş-Kağıt-Makas Oyunu

Bu proje, Java kullanılarak geliştirilmiş basit bir Taş-Kağıt-Makas oyunudur. Kullanıcı, belirlenen tur sayısı boyunca bilgisayara karşı oynar ve sonunda kazanan belirlenir.

## Nasıl Çalışır?

1. Oyuncudan, kaç tur oynamak istediği bilgisi alınır.
2. Her turda oyuncu bir seçim yapar:
   - 1: Taş
   - 2: Kağıt
   - 3: Makas
   - 0: Oyundan çıkış
3. Bilgisayar rastgele bir seçim yapar.
4. Seçimlerin sonucuna göre kazanan belirlenir ve skor güncellenir.
5. Belirlenen tur kadar oyun oynandıktan sonra skor tablosu ekrana yazdırılır ve kazanan açıklanır.

## Kullanılan Teknolojiler

- **Java** (Temel konsol uygulaması)
- **Random** sınıfı ile bilgisayarın rastgele seçim yapması
- **Scanner** sınıfı ile kullanıcıdan girdi alma

## Koddan Örnekler

```java
Scanner oku = new Scanner(System.in);
int pc, kisi;
Random r = new Random();

pc = r.nextInt(3) + 1;
System.out.println("1 taş");
System.out.println("2 kağıt");
System.out.println("3 makas");
kisi = oku.nextInt();
```

## Kurulum ve Çalıştırma

1. Java yüklenmiş bir sistemde terminali açın.
2. Proje dosyasını bir klasöre kaydedin.
3. Terminalde ilgili dizine giderek aşağıdaki komutlarla derleyip çalıştırın:
   ```sh
   javac Tkm.java
   java Tkm
   ```

## Katkıda Bulunma
Bu projeyi geliştirmek isterseniz pull request gönderebilirsiniz veya hataları bildirmek için issue oluşturabilirsiniz.

## Lisans
Bu proje MIT lisansı altında sunulmuştur.

