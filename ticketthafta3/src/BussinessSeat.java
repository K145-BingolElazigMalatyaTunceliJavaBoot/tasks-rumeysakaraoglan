public class BussinessSeat extends Seat{

    BussinessSeat(String seatNumber){
        number=seatNumber;
        title="Bussiness";
        isAvaible=true;
    }

    @Override
    public double calculate() {
        return 1000;
    }
}
