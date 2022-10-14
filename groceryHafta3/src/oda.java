public class oda extends store implements IBuy{
    private int odaElma;
    private int odaArmut;
    private int odaKiraz;
    public void oda(int odaElma, int odaArmut, int odaKiraz){
        this.odaArmut=odaArmut;
        this.odaElma=odaElma;
        this.odaKiraz=odaKiraz;

    }

    public int getOda2Armut() {
        return odaArmut;
    }
    public void setOda2Armut(int odaArmut) {
        this.odaArmut = odaArmut;
    }

    public int getOda2Kiraz() {
        return odaKiraz;
    }

    public void setOda2Kiraz(int odaKiraz) {
        this.odaKiraz = odaKiraz;
    }


    public int getOda2Elma() {
        return odaElma;
    }

    public void setOda2Elma(int odaElma) {
        this.odaElma = odaElma;
    }



    @Override
    public void buyArmut() {
        System.out.println("Kaç kg armut alacaksınız:  ");
        int buyarmut = scan.nextInt();

    }

    @Override
    public void buyKiraz() {
        System.out.println("Kaç kg kiraz alacaksınız:  ");
        int buykiraz = scan.nextInt();

    }

    @Override
    public void buyElma() {
        System.out.println("Kaç kg elma alacaksınız:  ");
        int buyelma = scan.nextInt();

    }
}
