import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secim;
        String MusteriTuru;
        Scanner scanner = new Scanner(System.in);        System.out.println("...HOŞGELDİNİZ...");
        System.out.println("Müşteri Tipini Seçiniz..");
        System.out.println("1."+"ŞİRKET TİP " );
        System.out.println("2."+"NORMAL VATANDAŞ TİP");
        System.out.println("3."+"DİĞER VATANDAŞ TİP \n");
        //System.out.println("Müşteri Tİpini Seçiniz: \n 1.Şirket Tip \n 2.Normal Vatandaş \n 3.Diğer Vatandaş");


        secim =scanner.nextInt();
        switch(secim){
            case 1 :
                System.out.println("Şirket Tip : Hacbag, Sedan, Suv kiralaybilirsiniz.");
                break;
            case 2:
                System.out.println("Normal Vatandaş Tip:Sadece Hatcbag kiralayabilrsiniz.");
                break;
            case 3 :
                System.out.println("Diğer Vatanaş: Sadece Suv kiralayabilirsiniz.");
                break;
        }


        SEDAN sedan=new SEDAN(new AylikOdeme(2000));
        System.out.println("Sedan aylık ödeme kirası: "+sedan.hesapla());

        HATCBAG hatcbag=new HATCBAG( new AylikOdeme(1000) );
        System.out.println("Hatcbag aylık kirası: " +hatcbag.hesapla());

        HATCBAG hatcbag2=new HATCBAG( new GunlukOdeme(1000) );
        System.out.println("Hatcbag günlük fiyatı: " +hatcbag2.hesapla());

        SUV suv = new SUV(new GunlukOdeme(500));
        System.out.println("Suv günlük fiyatı: "+suv.hesapla());

        SUV suv2 = new SUV(new AylikOdeme(500));
        System.out.println("Suv aylık fiyatı: "+suv.hesapla());



    }
    class  sirket {
        String Sedan;
        String SUV;
        String HATCBAG;


        public sirket(String Sedan, String SUV, String HATCBAG) {
            this.Sedan = Sedan;
            this.SUV = SUV;
            this.HATCBAG = HATCBAG;

       }
        class digerVatandas{
            String SUV;

            public digerVatandas(String SUV){
                this.SUV=SUV;
            }

        }
        class normalVatandas{
            String HATCBAG;

            public normalVatandas(String HATCBAG){
                this.HATCBAG=HATCBAG;
            }
        }

    }
    }
