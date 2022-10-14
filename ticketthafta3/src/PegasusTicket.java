import java.util.List;

public class PegasusTicket implements ITicket {

    private FlightSystem flightSystem;
    private Seat seat;
    private Customer customer;
    private List<IProperty> properties;

    public   PegasusTicket(FlightSystem flightSystem, Seat seat, Customer customer,  List<IProperty> properties) {
        this.flightSystem=flightSystem;
        this.seat = seat;
        this.customer =customer;
    }
    public PegasusTicket(){}

    @Override
    public double calculatePrice() {
        return seat.calculate();
    }

    @Override
    public void buyTicket() {
        seat.isAvaible=false;
    }

    @Override
    public void writeProperties() {
        if(this.properties ==null)
            return;

        for (IProperty property: this.properties ) {
            System.out.println(property.getPropertyTile());
        }
    }
}
