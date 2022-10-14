import java.util.Scanner;

public class AnaSinif {
    Scanner scanner = new Scanner(System.in);

    public int koltuk(String[] koltukNo) {

        int biletSayisi = 0;
        boolean a = true;
        boolean HepsiDolu = true;
        while (a) {
            for (int i = 0; i < 29; i++) {
                if (koltukNo[i] != "Dolu") {
                    HepsiDolu = false;
                }
            }
            if (HepsiDolu == true) {
                System.out.println("Hepsi dolu");
                break;
            }
            System.out.println("Lütfen almak istediğiniz koltukları tek tek seçiniz :");
            System.out.println("Koltuk seçiminden çıkmak için 404 yazınız.");
            int no = scanner.nextInt();
            if (no == 404) {

                Odeme odeme = new Odeme();
                odeme.tutar(biletSayisi);

                System.out.println("Tc kimlik numaranızı giriniz.");
                String tcKimlikNo = scanner.next();
                odeme.setTcKimlikNo(tcKimlikNo);
                boolean gecerli = false;
                char[] rakamlar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            }
            if (koltukNo[no] == "Dolu") {
                System.out.println("Seçtiğiniz koltuk doludur.");
            }
            System.out.println();
            if (koltukNo[no] != "Dolu") {
                koltukNo[no] = "Dolu";
                biletSayisi = biletSayisi + 1;
            }

        }
        return biletSayisi;
    }
}
