public class Ticket {
    private String destination;
    private String seatNo;
    private int price;

    public Ticket(String destination, String seatNo, int price, String name) {
        this.destination = destination;
        this.seatNo = seatNo;
        this.price = price;
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Ticket{" +
                "destination='" + destination + '\'' +
                ", seatNo='" + seatNo + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}

