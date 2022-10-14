
public class Main {
    public static void main(String[] args) {
        store store1 = new store();
        oda oda1 = addOda(20, 40, 15, store1);
        System.out.println("Depodaki Elma Sayısı : " + store1.getElma());
        System.out.println("oda1'deki Elma Sayısı : " + oda1.getOda2Elma());
        oda oda2 = addOda(20, 40, 40, store1);
        System.out.println("Depodaki Elma Sayısı : " + store1.getElma());
        System.out.println("oda2'deki Elma Sayısı : " + oda2.getOda2Elma());
        oda1.getElma();
        System.out.println("oda1'de alışveriş sonrası kalan Elma : " + oda1.getOda2Elma());
        oda2.buyArmut();
        System.out.println("oda2'de alışveriş sonrası kalan Armut  : " + oda2.getOda2Armut());


    }

    public static oda addOda(int Elma, int Armut, int Kiraz, store store1) {
        int elmaMiktari= store1.getElma() - Elma;
        int armutMiktari = store1.getArmut() - Armut;
        int kirazMiktari = store1.getKiraz() - Kiraz;
        if (elmaMiktari < 0) {

            System.out.println("Depoda Yeterli Elma Yoktur");
            System.exit(elmaMiktari);
        }
        if (armutMiktari < 0) {

            System.out.println("Depoda Yeterli Armut Yoktur");
            System.exit(armutMiktari);
        }
        if (kirazMiktari < 0) {

            System.out.println("Depoda Yeterli Kiraz Yoktur");
            System.exit(kirazMiktari);
        }

        oda oda1 = new oda();
        store1.setElma(store1.getElma() - oda1.getOda2Elma());
        store1.setArmut(store1.getArmut() - oda1.getOda2Armut());
        store1.setArmut(store1.getKiraz() - oda1.getOda2Kiraz());
        return oda1;
    }

}