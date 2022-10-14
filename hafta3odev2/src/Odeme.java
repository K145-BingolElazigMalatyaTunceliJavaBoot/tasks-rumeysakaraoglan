import java.util.Scanner;
public class Odeme {
    Scanner scanner = new Scanner(System.in);
    Main main = new Main();

    private String tcKimlikNo;
    public int biletSayisi;
    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public void tutar(int biletSayisi) {
        this.biletSayisi = biletSayisi;
        System.out.println("Bilet sayisi:" + biletSayisi);
    }
    public void  KoltukSecimi(){

        int hesap=0;
        String businnis ;
        String ekonomi;
        System.out.println("1-Bussinis Tip");
        System.out.println("2-Ekonomi Tip");
        int koltukSecim = scanner.nextInt();
        if ( koltukSecim!=1 &&  koltukSecim!=2 )
        {
            System.out.println("LÜtfen gecerli bir koltuk numarası girin.");

        }

    }
/*
    public void totalHesap() {

        int hesap =0;

        int ö = 1;
        System.out.println("Ödeme şeklinin seçiniz.");
        System.out.println("1-Nakit");



        int odemeSekliSecim = scanner.nextInt();
        for (ö = 1; ö > 0; ö++) {

            switch (odemeSekliSecim) {
                case 1:


                    System.out.println("Ödemenin gereken tutar " + hesap + " Tl dir.");
                    System.out.println("Lütfen kaç para yatırdığınızı sisteme girin:");
                    int yatirilanNakit = scanner.nextInt();
                    if (yatirilanNakit >= hesap) {
                        System.out.println("Para üstünüz:" + (yatirilanNakit - hesap));
                        System.out.println("Ödeme işleminiz gerçekleşmiştir.");
                        ö = -1;

                    } else {
                        System.out.println("Yatırdığınız para yetersizdir.");
                    }
                    break;
            }



        }
    }

 */
}