public class GunlukOdeme implements IOdeme{
    private double tutar;

    public GunlukOdeme(double tutar){
        this.tutar=tutar;
    }
    @Override
    public double hesapla( ) {
        return this.tutar * 1;
    }
}
