package hotel;

public class Suite extends Room{
    private boolean hasJacuzzi;

    //konstruktor
    public Suite(String roomNr, int capacity, boolean hasJacuzzi) {
        super(roomNr, capacity);
        this.hasJacuzzi = hasJacuzzi;
    }


    @Override
    public void displayRoomDetails() {
        System.out.println("Suite with " + getRoomNr() + " nr and capacity of " + getCapacity() + " guests. Jacuzzi: " + /*turneryförkortad if-sats. används korta saker ex->*/(hasJacuzzi ? "Ja" : "Nej"));
    }
}
