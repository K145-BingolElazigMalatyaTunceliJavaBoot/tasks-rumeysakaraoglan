import java.util.Scanner;

public class HATCBAG implements ICar{
    private String renk;
    private String bagaj;
    private IOdeme odeme;

    public HATCBAG(IOdeme odeme){
        this.odeme = odeme;
    }

    public double hesapla(){
        return odeme.hesapla();
    }

    @Override
    public String getRenk() {
        return this.renk;
    }

    @Override
    public void setRenk(String value) {
          this.renk=value;
    }

    @Override
    public String getBagaj() {
        return this.bagaj;
    }

    @Override
    public void setBagaj(String value) {
        this.bagaj=value;
    }
}
