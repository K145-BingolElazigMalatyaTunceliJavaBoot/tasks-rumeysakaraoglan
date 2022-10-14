public class EconomicSeat extends Seat{

    EconomicSeat(String seatNumber){
        number=seatNumber;
        title="Economic";
        isAvaible=true;
    }
    @Override
    public double calculate() {

        return 500;
    }
}
