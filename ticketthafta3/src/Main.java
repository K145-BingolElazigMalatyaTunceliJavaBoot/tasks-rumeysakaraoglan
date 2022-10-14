import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    private static Customer  musteriBilgileriniAl(){
        Customer customer = new Customer();

        Scanner input = new Scanner(System.in);
        System.out.println("Müşteri bilgilerini giriniz: ");

        System.out.println("Müşteri Id: ");
        customer.id= input.nextInt();

        System.out.println("Müşteri Ad: ");
        customer.name=input.next();

        System.out.println("Müşteri Soyad: ");
        customer.surname=input.next();

        return customer;
    }

    private static ITicket biletSec(FlightSystem flightSystem,Seat seat,Customer customer){
        ITicket bilet=null;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bilet seçiniz 1- THY 2- Pegasus: ");
        int biletTuru = input.nextInt();

        if(biletTuru==1) {
            List<IProperty> properties = new ArrayList<>();
            properties.add(new FreeService());

            bilet = new ThyTicket(flightSystem, seat, customer,properties );
        }
        else bilet = new PegasusTicket(flightSystem,seat,customer,null);

        return bilet;
    }

    private static Seat koltukSeciniz(FlightSystem flightSystem){

        Scanner input = new Scanner(System.in);

        Seat seat = null;
        flightSystem.writeSeats();
        System.out.println("Lütfen Seçmek İstediğiniz Koltuk Numarasını Giriniz :\n");
        int koltukNo = input.nextInt();

        seat = flightSystem.seats.get( koltukNo ) ;
        return seat;
    }

    private static int findSeatIndex(String seatNumber,FlightSystem flightSystem)
    {
        int varsayilan=0;
        for(int i=0;i<flightSystem.seats.size();i++){
            Seat seat= flightSystem.seats.get(i);
            if(seat.number==seatNumber)
            {
                return i;
            }
        }
        return varsayilan;
    }
    private static Seat koltukSeciniz2(FlightSystem flightSystem){

        Scanner input = new Scanner(System.in);

        Seat seat = null;
        flightSystem.writeSeats();
        System.out.println("Lütfen Seçmek İstediğiniz Koltuk Numarasını Giriniz :\n");
        String  koltukNo = input.next();

        int koltukIndex= findSeatIndex(koltukNo,flightSystem);
        seat = flightSystem.seats.get( koltukIndex ) ;
        return seat;
    }

    private static void biletSatinAl(ITicket ticket){
        ticket.buyTicket();
        System.out.println( ticket.toString() + " Biletiniz satın alındı");
        System.out.println(" bilet turari " + ticket.calculatePrice()    );
    }

    public static void main(String[] args) {

        FlightSystem flightSystem =  new FlightSystem();
        Customer customer= musteriBilgileriniAl();//
        //Seat seat = koltukSeciniz(flightSystem);
        Seat seat = koltukSeciniz2(flightSystem); //A1 A2 diye secilebilirok

        ITicket ticket = biletSec(flightSystem,seat,customer);
        biletSatinAl(ticket);
        ticket.writeProperties();

        flightSystem.writeSeats();
         //simdi test yapalim
    }
}

//bilet alirken koltuk A1 diye yazabilirsin
//tekrar test tkrar t - bulmasında peoblem varsa indes numarasını kullan aslında ben pek anlayamdım tekrar kodu ıncelrşm öyle anlarımm doğru galına:)
//ok mu? tmamm başka bir sey soracgım -