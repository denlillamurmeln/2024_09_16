package hotel;

public class Main {
    public static void main(String[] args) {
        //skapa ett objekt av Bookingservice så vi kan komma åt alla metoder
        BookingService bookingService = new BookingService();

        StandardRoom room1 = new StandardRoom("101", 2, true);
        Suite suite1 = new Suite("201", 4, true);

        bookingService.addRoom(room1);
        bookingService.addRoom(suite1);

        System.out.println("----------------------");

        System.out.println("Tillgänliga rum: ");
        bookingService.displayAvailableRooms();
        System.out.println("----------------------");

        System.out.println("Bokar rum 101: ");
        bookingService.bookRoom("101");
        System.out.println("----------------------");

        System.out.println("Försöker boka rum 101 igen: ");
        bookingService.bookRoom("101");
        System.out.println("----------------------");

        System.out.println("Avbokar rum 101: ");
        bookingService.unBookRoom("101");
        System.out.println("----------------------");

        System.out.println("Tillgängliga rum efter alla tester");
        bookingService.displayAvailableRooms();

    }
}
