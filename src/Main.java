public class Main {
     public static void main(String[] args) {
        Customer customer= new Customer("Anil",24,"Sarvaram Suryapet","12345","23/03/2033");
        TicketBooking ticketBooking= new TicketBooking();
        System.out.println(ticketBooking.Process(customer));
        System.out.println(customer);

    }
}