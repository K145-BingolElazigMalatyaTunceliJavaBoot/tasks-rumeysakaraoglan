import java.util.Scanner;
public class Main {

    static int toplamFiyat;
    public static void main(String[] args) {
        int model;
        int secim;
        int gunlukKira;
        int aylikKira;
        int renk;
        int bagaj;
        int ay;
        int gun;
        int secimEk;
        String MusteriTuru;

        Scanner scanner = new Scanner(System.in);

        suv SUV = new suv(4000,"Kırmızı","Küçük Bagaj","Suv2");
        sedan SEDAN = new sedan(5000,"Gri","Orta Bagaj","Sedan1");
        hatcbag HATCHBAG = new hatcbag(300,6000,"Beyaz","Büyük Bagaj","Hatcbag1");


        sirket Sirket = new sirket("Sedan","SUV","HATCBAG");
        normalVatandas NVatandas = new normalVatandas("HATCBAG");
        digerVatandas DVatandas = new digerVatandas("SUV");

        System.out.println("...HOŞGELDİNİZ...");
        System.out.println("Müşteri Tipini Seçiniz..");
        System.out.println("1."+"ŞİRKET TİP " );
        System.out.println("2."+"NORMAL VATANDAŞ TİP");
        System.out.println("3."+"DİĞER VATANDAŞ TİP \n");
        //System.out.println("Müşteri Tİpini Seçiniz: \n 1.Şirket Tip \n 2.Normal Vatandaş \n 3.Diğer Vatandaş");

       // secimEk = scanner.nextInt();
        secimEk = scanner.nextInt();
        switch(secimEk){
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




        System.out.println("Aşağıdaki Arabalar mevcut");
        System.out.println("1. "+SUV.model+ " Aylık kira: " + SUV.aylikKira+ " TL" + " renk: " +SUV.renk+" Bagaj Tipi: "+SUV.bagaj);
        System.out.println("2. "+SEDAN.model+" Aylık kira: "+ SEDAN.aylikKira+" TL "+" renk: "+SEDAN.renk+" Bagaj Tipi: "+SEDAN.bagaj);
        System.out.println("3."+HATCHBAG.model+" Günlük Kira: "+ HATCHBAG.gunlukKira + " TL "+" renk: "+HATCHBAG.renk+" Bagaj Tipi: "+HATCHBAG.bagaj);
        System.out.println("4."+HATCHBAG.model+" Aylık kira: "+ HATCHBAG.aylikKira+" TL "+" renk: "+HATCHBAG.renk+" Bagaj Tipi: "+HATCHBAG.bagaj);

        System.out.println("Seçmek istediğiniz arabanın numarasını seçiniz: ");
        secim = scanner.nextInt();
        switch (secim){
            case 1:
                toplamFiyat = 4000;
                System.out.println("Kaç ay kiralayacksınız: ");
                ay= scanner.nextInt();
                toplamFiyat*=ay;
                break;
            case 2:
                toplamFiyat = 5000;
                System.out.println("Kaç ay kiralayacksınız: ");
                ay= scanner.nextInt();
                toplamFiyat*=ay;
                break;
            case 3:
                toplamFiyat = 300;
                System.out.println("Kaç gün kiralayacksınız: ");
                // ay= scanner.nextInt();
                // toplamFiyat*=ay;
                gun = scanner.nextInt();
                toplamFiyat*=gun;
                break;

            case 4:
                toplamFiyat = 6000;
                System.out.println("Kaç ay kiralayacksınız: ");
                ay= scanner.nextInt();
                toplamFiyat*=ay;

                break;
            // Aylık ta kiralatmka lazım
        }
        System.out.println("Toplam borcunuz: "+toplamFiyat);

        System.out.println("Güle Güle :)");

    }
}
class  sirket{
    String Sedan;
    String SUV;
    String HATCBAG;
    public sirket (String Sedan, String SUV,String HATCBAG){
        this.Sedan=Sedan;
        this.SUV=SUV;
        this.HATCBAG=HATCBAG;
    }

}
class normalVatandas{
    String HATCBAG;

    public normalVatandas(String HATCBAG){
        this.HATCBAG=HATCBAG;
    }
}
class digerVatandas{
    String SUV;

    public digerVatandas(String SUV){
        this.SUV=SUV;
    }

}

class suv {
    int aylikKira;
    String model;
    String renk;
    String bagaj;

    public suv(int aylikKira, String renk, String bagaj,String model) {
        this.aylikKira=aylikKira;
        this.renk=renk;
        this.bagaj=bagaj;
        this.model=model;
    }
}
class sedan{
    int aylikKira;
    String renk;
    String bagaj;
    String model;

    public sedan(int aylikKira,String renk,String bagaj,String model){
        this.aylikKira=aylikKira;
        this.renk=renk;
        this.bagaj=bagaj;
        this.model=model;
    }
}
class hatcbag{
    int gunlukKira;
    int aylikKira;
    String renk;
    String bagaj;
    String model ;


    public hatcbag(int gunlukKira,int aylikKira,String renk, String bagaj,String model)
    {
        this.gunlukKira= gunlukKira;
        this.aylikKira=aylikKira;
        this.renk=renk;
        this.bagaj=bagaj;
        this.model=model;

    }
}
