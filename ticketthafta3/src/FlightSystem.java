import java.util.ArrayList;
import java.util.List;

public class FlightSystem {
    public String Id;
    public int seatCount;
    public List<Seat> seats;

    private void preperSeat(){
        seats = new ArrayList<>() ;
        seats.add(new BussinessSeat("A1"));
        seats.add(new BussinessSeat("B1"));

        seats.add(new EconomicSeat("A2"));
        seats.add(new EconomicSeat("A3"));
        seats.add(new EconomicSeat("B2"));
        seats.add(new EconomicSeat("B3"));
    }

    public  FlightSystem(){
        preperSeat();
    }

    public void writeSeats(){
        int i=0;
        for (Seat seat:seats ) {
            System.out.println( i + " "+ seat.toString());
            i++;
        }
    }
}