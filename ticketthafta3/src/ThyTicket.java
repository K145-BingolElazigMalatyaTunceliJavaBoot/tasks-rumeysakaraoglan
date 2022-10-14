import java.util.List;

public class ThyTicket implements ITicket{

    private FlightSystem flightSystem;
    private Seat seat;
    private Customer customer;
    private List<IProperty> properties;

    public   ThyTicket(FlightSystem flightSystem, Seat seat, Customer customer, List<IProperty> properties) {
        this.flightSystem=flightSystem;
        this.seat = seat;
        this.customer =customer;
        this.properties = properties;
    }

    public ThyTicket(){}

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

    @Override
    public String toString() {
        return "ThyTicket { " +
                "\n flightSystem = " + flightSystem +
                "\n seat = " + seat +
                "\n customer  = " + customer +
                '}';
    }
}
