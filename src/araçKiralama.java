import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class araçKiralama {
    static int toplamFiyat;

    public static void main(String[] args) {
        int ortPuan = 0, secim, ekSecim, gün;
        Scanner scanner = new Scanner(System.in);
        mercedes mercedes = new mercedes(1000, "GLA 200", 2022, "Benzin");
        nissan nissan = new nissan(500, "Navara", 2022, "Dizel");
        hyundai hyundai = new hyundai(750, "İ30", 2022, "Dizel");

        System.out.println("------RENT A CAR HOŞGELDİNİZ------");
        System.out.println("--KİRALAMAK İSTEDİĞİNİZ ARABAYI SEÇİNİZ--");
        System.out.println("1. Mercedes " + mercedes.model + " ,Günlük Fiyat: " + mercedes.günlükFiyat + " TL, " + mercedes.yil + " Model, " + " Yakıt cinsi :" + mercedes.yakitTürü + "\n"
                + "2. Nissan " + nissan.model + " ,Günlük Fiyat :" + nissan.günlükFiyat + " TL, " + nissan.yil + " Model," + "Yakıt cinsi :" + nissan.yakitTürü + "\n"
                + "3. Hyundai " + hyundai.model + ",Günlük Fiyat :" + hyundai.günlükFiyat + " TL, " + hyundai.yil + " Yakıt cinsi:" + hyundai.yakitTürü);
        System.out.println("------------------------");
        secim = scanner.nextInt();
        switch (secim) {
            case 1:
                toplamFiyat = 1000;
                System.out.println("Kaç gün kiralayacaksınız.:");
                gün = scanner.nextInt();
                toplamFiyat *= gün;

                System.out.println("EKSTRA İSTEKLER :");
                System.out.println("1 - KIŞ LASTİĞİ = 100 TL");
                System.out.println("2 - PORT BAGAJ = 100 TL");
                System.out.println("3 - EKSTRA İSTEMİYORUM");
                ekSecim = scanner.nextInt();
                switch (ekSecim) {
                    case 1:
                        toplamFiyat += 100;
                        break;
                    case 2:
                        toplamFiyat += 100;
                        break;

                }
                break;
            case 2:
                toplamFiyat = 500;
                System.out.println("Kaç gün kiralayacaksınız.:");
                gün = scanner.nextInt();
                toplamFiyat *= gün;

                System.out.println("EKSTRA İSTEKLER :");
                System.out.println("1 - KIŞ LASTİĞİ = 100 TL");
                System.out.println("2 - PORT BAGAJ = 100 TL");
                System.out.println("3 - EKSTRA İSTEMİYORUM");
                ekSecim = scanner.nextInt();
                switch (ekSecim) {
                    case 1:
                        toplamFiyat += 100;
                        break;
                    case 2:
                        toplamFiyat += 100;
                        break;

                }
                break;
            case 3:
                toplamFiyat = 750;
                System.out.println("Kaç gün kiralayacaksınız.:");
                gün = scanner.nextInt();
                toplamFiyat *= gün;

                System.out.println("EKSTRA İSTEKLER :");
                System.out.println("1 - KIŞ LASTİĞİ = 100 TL");
                System.out.println("2 - PORT BAGAJ = 100 TL");
                System.out.println("3 - SİGORTA = 100 TL");
                System.out.println("4 - EKSTRA İSTEMİYORUM");
                ekSecim = scanner.nextInt();
                switch (ekSecim) {
                    case 1:
                        toplamFiyat += 100;
                        break;
                    case 2:
                        toplamFiyat += 100;
                        break;
                }
                break;
        }
        System.out.println("TOPLAM :" + toplamFiyat+" TL");

    }
}
class mercedes {
    int günlükFiyat;
    String model;
    int yil;
    String yakitTürü;

    public mercedes(int günlükFiyat, String model, int yil, String yakitTürü) {
        super();
        this.günlükFiyat = günlükFiyat;
        this.model = model;
        this.yil = yil;
        this.yakitTürü = yakitTürü;

    }
}

class nissan {
    int günlükFiyat;
    String model;
    int yil;
    String yakitTürü;

    public nissan(int günlükFiyat, String model, int yil, String yakitTürü) {
        super();
        this.günlükFiyat = günlükFiyat;
        this.model = model;
        this.yil = yil;
        this.yakitTürü = yakitTürü;

    }

}

class hyundai {
    int günlükFiyat;
    String model;
    int yil;
    String yakitTürü;

    public hyundai(int günlükFiyat, String model, int yil, String yakitTürü) {
        super();
        this.günlükFiyat = günlükFiyat;
        this.model = model;
        this.yil = yil;
        this.yakitTürü = yakitTürü;

    }

}
