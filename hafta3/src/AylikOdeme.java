public class AylikOdeme implements IOdeme{

    private double tutar;

    public AylikOdeme(double tutar){
        this.tutar= tutar;
    }
    @Override
    public double hesapla(){
        return this.tutar  * 30;
    }
}

