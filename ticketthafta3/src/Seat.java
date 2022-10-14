abstract class Seat {
    public String number;
    public String title;
    public boolean isAvaible=true;
    public double calculate(){
        return 0;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "number='" + number + '\'' +
                ", title='" + title + '\'' +
                ", isAvaible=" + isAvaible +
                '}';
    }
}
